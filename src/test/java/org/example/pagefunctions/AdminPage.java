package org.example.pagefunctions;


import org.example.commonfunctions.CommonFunctions;
import org.example.commonvariables.CommonVariables;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class AdminPage extends CommonFunctions {

    OrangeHRM_ObjRepo objRepo;

    public AdminPage(WebDriver driver) {
        objRepo = PageFactory.initElements(driver, OrangeHRM_ObjRepo.class);
    }

    public void validateAdminPageText(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Assert.assertTrue(objRepo.adminLink.isDisplayed());
        findButtonClick(objRepo.adminLink);
        //userManagement List
        Assert.assertTrue(objRepo.userManagementLink.isDisplayed());
        findButtonClick(objRepo.userManagementLink);
        Assert.assertTrue(objRepo.usersLink.isDisplayed());
        //job list
        Assert.assertTrue(objRepo.jobLink.isDisplayed());
        findButtonClick(objRepo.jobLinkinMyInfoPage);
        sleep(1);
        Assert.assertTrue(objRepo.jobTitleLink.isDisplayed());
        Assert.assertTrue(objRepo.payGradesLink.isDisplayed());
        Assert.assertTrue(objRepo.employmentStatusLink.isDisplayed());
        Assert.assertTrue(objRepo.jobCategoriesLink.isDisplayed());
        Assert.assertTrue(objRepo.workShiftsLink.isDisplayed());
        //organization list
        Assert.assertTrue(objRepo.organizationLink.isDisplayed());
        findButtonClick(objRepo.organizationLink);
        sleep(1);
        Assert.assertTrue(objRepo.generalInformation.isDisplayed());
        Assert.assertTrue(objRepo.locationLink.isDisplayed());
        Assert.assertTrue(objRepo.structureLink.isDisplayed());
        //qualifications list
        Assert.assertTrue(objRepo.qualificationsLinkInAdminPage.isDisplayed());
        findButtonClick(objRepo.qualificationsLinkInAdminPage);
        sleep(1);
        Assert.assertTrue(objRepo.skillsLink.isDisplayed());
        Assert.assertTrue(objRepo.educationLink.isDisplayed());
        Assert.assertTrue(objRepo.licensesLink.isDisplayed());
        Assert.assertTrue(objRepo.languagesLink.isDisplayed());
        Assert.assertTrue(objRepo.membershipsLinkInAdminPage.isDisplayed());
        //nationalities link
        Assert.assertTrue(objRepo.nationalitiesLink.isDisplayed());
        //configurationLink list
        Assert.assertTrue(objRepo.configurationLink.isDisplayed());
        findButtonClick(objRepo.configurationLink);
        sleep(1);
        Assert.assertTrue(objRepo.emailSubscriptionsLink.isDisplayed());
        Assert.assertTrue(objRepo.localizationLink.isDisplayed());
        Assert.assertTrue(objRepo.languagePackagesLink.isDisplayed());
        Assert.assertTrue(objRepo.modulesLink.isDisplayed());
        Assert.assertTrue(objRepo.socialMediaAuthenticationLink.isDisplayed());
        Assert.assertTrue(objRepo.registerOAuthClient.isDisplayed()
        );


    }

    public void addSystemUser(WebDriver driver)
    {
        validateAdminPageText(driver);
        findButtonClick(objRepo.addUserButton);
        findButtonClick(objRepo.userTypeForAddingUser);
        Assert.assertTrue(objRepo.adminUserType.isDisplayed());
        Assert.assertTrue(objRepo.essUserType.isDisplayed());
        inputTextField(driver,objRepo.employeeNameTextbox, CommonVariables.orangeHRM_MyInfo_EmployeeFirstName+" "+CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        inputTextField(driver,objRepo.usernameTextbox,CommonVariables.orangeHRM_System_Username);
        findButtonClick(objRepo.statusLabel);
        Assert.assertTrue(objRepo.enableStatusType.isDisplayed());
        Assert.assertTrue(objRepo.disableStatusType.isDisplayed());
        inputTextField(driver,objRepo.systemUserPassword,CommonVariables.orangeHRM_System_Password);
        inputTextField(driver,objRepo.systemUserConfirmPassword,CommonVariables.orangeHRM_System_Password);
        findButtonClick(objRepo.systemUserSaveButton);
        sleep(2);
    }

    public void searchSystemUser(WebDriver driver)
    {
        validateAdminPageText(driver);
        inputTextField(driver,objRepo.searchUsernameField,CommonVariables.orangeHRM_System_Username);
        Select selectSystemUserRole=new Select(objRepo.searchSystemUserDropdownList);
        selectSystemUserRole.selectByVisibleText("ESS");
        List<WebElement> listOfSearchOptions=selectSystemUserRole.getOptions();
        for (WebElement element:listOfSearchOptions)
        {
            System.out.println("User Roles are:"+element.getText());
        }
        Select selectSearchStatus=new Select(objRepo.searchStatusDropdownList);
        selectSearchStatus.selectByVisibleText("Enabled");
        sleep(2);
        List<WebElement> listOfSearchStatus=selectSearchStatus.getOptions();
        for (WebElement element:listOfSearchStatus)
        {
            System.out.println("searchable statuses are: "+element.getText());
        }
        findButtonClick(objRepo.searchButton);
        Assert.assertTrue(objRepo.systemUserLink.isDisplayed());
    }

    public void searchInvalidUser(WebDriver driver)
    {
        validateAdminPageText(driver);
        inputTextField(driver,objRepo.searchUsernameField,CommonVariables.orangeHRM_System_InvalidUsername);
        findButtonClick(objRepo.searchButton);
        Assert.assertTrue(objRepo.searchErrorMessage.isDisplayed());

    }


    }


