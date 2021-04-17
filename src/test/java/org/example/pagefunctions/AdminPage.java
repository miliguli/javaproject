package org.example.pagefunctions;
import org.example.commonfunctions.CommonFunctions;
import org.example.commonvariables.CommonVariables;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class AdminPage extends CommonFunctions {

    OrangeHRM_ObjRepo objRepo;

    public AdminPage(WebDriver driver) {
        objRepo = PageFactory.initElements(driver, OrangeHRM_ObjRepo.class);
    }

    public void validateAdminPageText(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Validating all the links on the Admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        highlightElements(driver,objRepo.adminLink);
        Assert.assertTrue(objRepo.adminLink.isDisplayed());
        findButtonClick(objRepo.adminLink);
        Reporter.log("Validating user management list on the Admin page");
        waitForElementVisible(driver,objRepo.userManagementLink);
        highlightElements(driver,objRepo.userManagementLink);
        Assert.assertTrue(objRepo.userManagementLink.isDisplayed());
        findButtonClick(objRepo.userManagementLink);
        highlightElements(driver,objRepo.usersLink);
        Assert.assertTrue(objRepo.usersLink.isDisplayed());
        Reporter.log("Validating job list on the Admin page");
        highlightElements(driver,objRepo.jobLink);
        Assert.assertTrue(objRepo.jobLink.isDisplayed());
        findButtonClick(objRepo.jobLinkinMyInfoPage);
        sleep(1);
        highlightElements(driver,objRepo.jobTitleLink);
        Assert.assertTrue(objRepo.jobTitleLink.isDisplayed());
        highlightElements(driver,objRepo.payGradesLink);
        Assert.assertTrue(objRepo.payGradesLink.isDisplayed());
        highlightElements(driver,objRepo.employmentStatusLink);
        Assert.assertTrue(objRepo.employmentStatusLink.isDisplayed());
        highlightElements(driver,objRepo.jobCategoriesLink);
        Assert.assertTrue(objRepo.jobCategoriesLink.isDisplayed());
        highlightElements(driver,objRepo.workShiftsLink);
        Assert.assertTrue(objRepo.workShiftsLink.isDisplayed());
        Reporter.log("Validating organization list on the Admin page");
        highlightElements(driver,objRepo.organizationLink);
        Assert.assertTrue(objRepo.organizationLink.isDisplayed());
        findButtonClick(objRepo.organizationLink);
        sleep(1);
        highlightElements(driver,objRepo.generalInformation);
        Assert.assertTrue(objRepo.generalInformation.isDisplayed());
        highlightElements(driver,objRepo.locationLink);
        Assert.assertTrue(objRepo.locationLink.isDisplayed());
        highlightElements(driver,objRepo.structureLink);
        Assert.assertTrue(objRepo.structureLink.isDisplayed());
        Reporter.log("Validating qualifications list on the Admin page");
        highlightElements(driver,objRepo.qualificationsLinkInAdminPage);
        Assert.assertTrue(objRepo.qualificationsLinkInAdminPage.isDisplayed());
        findButtonClick(objRepo.qualificationsLinkInAdminPage);
        sleep(1);
        highlightElements(driver,objRepo.skillsLink);
        Assert.assertTrue(objRepo.skillsLink.isDisplayed());
        highlightElements(driver,objRepo.educationLink);
        Assert.assertTrue(objRepo.educationLink.isDisplayed());
        highlightElements(driver,objRepo.licensesLink);
        Assert.assertTrue(objRepo.licensesLink.isDisplayed());
        highlightElements(driver,objRepo.languagesLink);
        Assert.assertTrue(objRepo.languagesLink.isDisplayed());
        highlightElements(driver,objRepo.membershipsLinkInAdminPage);
        Assert.assertTrue(objRepo.membershipsLinkInAdminPage.isDisplayed());
        Reporter.log("Validating nationalities link on the Admin page");
        highlightElements(driver,objRepo.nationalitiesLink);
        Assert.assertTrue(objRepo.nationalitiesLink.isDisplayed());
        Reporter.log("Validating configurationLink list on the Admin page");
        highlightElements(driver,objRepo.configurationLink);
        Assert.assertTrue(objRepo.configurationLink.isDisplayed());
        findButtonClick(objRepo.configurationLink);
        sleep(1);
        highlightElements(driver,objRepo.emailSubscriptionsLink);
        Assert.assertTrue(objRepo.emailSubscriptionsLink.isDisplayed());
        highlightElements(driver,objRepo.localizationLink);
        Assert.assertTrue(objRepo.localizationLink.isDisplayed());
        highlightElements(driver,objRepo.languagePackagesLink);
        Assert.assertTrue(objRepo.languagePackagesLink.isDisplayed());
        highlightElements(driver,objRepo.modulesLink);
        Assert.assertTrue(objRepo.modulesLink.isDisplayed());
        highlightElements(driver,objRepo.socialMediaAuthenticationLink);
        Assert.assertTrue(objRepo.socialMediaAuthenticationLink.isDisplayed());
        highlightElements(driver,objRepo.registerOAuthClient);
        Assert.assertTrue(objRepo.registerOAuthClient.isDisplayed());
        Reporter.log("All the links on the admin page are validated");
    }

    public void addSystemUser(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Adding a system user on the admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        waitForElementVisible(driver,objRepo.addUserButton);
        highlightElements(driver,objRepo.addUserButton);
        findButtonClick(objRepo.addUserButton);
        sleep(1);
        waitForElementVisible(driver,objRepo.userRoleType);
        findButtonClick(objRepo.userRoleType);
        sleep(1);
        highlightElements(driver,objRepo.adminRole);
        Assert.assertTrue(objRepo.adminRole.isDisplayed());
        highlightElements(driver,objRepo.essRole);
        Assert.assertTrue(objRepo.essRole.isDisplayed());
        waitForElementVisible(driver,objRepo.employeeNameTextbox);
        inputTextField(driver,objRepo.employeeNameTextbox, CommonVariables.orangeHRM_MyInfo_EmployeeFirstName+" "+CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        waitForElementVisible(driver,objRepo.usernameTextbox);
        inputTextField(driver,objRepo.usernameTextbox,CommonVariables.orangeHRM_System_Username);
        highlightElements(driver,objRepo.statusLabel);
        findButtonClick(objRepo.statusLabel);
        highlightElements(driver,objRepo.enableStatusType);
        Assert.assertTrue(objRepo.enableStatusType.isDisplayed());
        highlightElements(driver,objRepo.disableStatusType);
        Assert.assertTrue(objRepo.disableStatusType.isDisplayed());
        waitForElementVisible(driver,objRepo.systemUserPassword);
        inputTextField(driver,objRepo.systemUserPassword,CommonVariables.orangeHRM_System_Password);
        waitForElementVisible(driver,objRepo.systemUserConfirmPassword);
        inputTextField(driver,objRepo.systemUserConfirmPassword,CommonVariables.orangeHRM_System_Password);
        highlightElements(driver,objRepo.systemUserSaveButton);
        findButtonClick(objRepo.systemUserSaveButton);
        sleep(2);
        Reporter.log("System user added successfully");
    }

    public void searchSystemUser(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Searching a system user on the admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        sleep(1);
        waitForElementVisible(driver,objRepo.searchUsernameField);
        inputTextField(driver,objRepo.searchUsernameField,CommonVariables.orangeHRM_System_Username);
        sleep(1);
        selectFromDropDownList(objRepo.searchSystemUserDropdownList,CommonVariables.orangeHRM_Admin_UserType);
        selectFromDropDownList(objRepo.searchStatusDropdownList,CommonVariables.orangeHRM_Admin_StatusType);
        waitForElementVisible(driver,objRepo.searchButton);
        highlightElements(driver,objRepo.searchButton);
        findButtonClick(objRepo.searchButton);
        sleep(1);
        highlightElements(driver,objRepo.systemUserLink);
        Assert.assertTrue(objRepo.systemUserLink.isDisplayed());
        sleep(1);
        Reporter.log("One record is displayed");
    }

    public void searchInvalidUser(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Searching an invalid system user on the admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        sleep(1);
        waitForElementVisible(driver,objRepo.searchUsernameField);
        inputTextField(driver,objRepo.searchUsernameField,CommonVariables.orangeHRM_System_InvalidUsername);
        highlightElements(driver,objRepo.searchButton);
        findButtonClick(objRepo.searchButton);
        sleep(1);
        highlightElements(driver,objRepo.searchErrorMessage);
        Assert.assertTrue(objRepo.searchErrorMessage.isDisplayed());
        sleep(1);
        Reporter.log("'No record found' message is displayed");
    }

    public void addJobTitle(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Adding job title to the admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        sleep(1);
        highlightElements(driver,objRepo.jobLink);
        findButtonClick(objRepo.jobLink);
        highlightElements(driver,objRepo.jobTitleLink);
        findButtonClick(objRepo.jobTitleLink);
        waitForElementVisible(driver,objRepo.addJobTitleButton);
        findButtonClick(objRepo.addJobTitleButton);
        inputTextField(driver,objRepo.jobTitleInputField,CommonVariables.orangeHRM_Admin_JobTitle);
        sleep(1);
        inputTextField(driver,objRepo.jobDescriptionInputField,CommonVariables.orangeHRM_Admin_JobDescription);
        sleep(1);
        findButtonClick(objRepo.saveJobTitleButton);
        Assert.assertTrue(objRepo.jobTitleAdded.isDisplayed());
        Reporter.log("One job title Added to the page");

    }

    public void deleteJobTitle(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("deleting a job title on the admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        sleep(1);
        highlightElements(driver,objRepo.jobLink);
        findButtonClick(objRepo.jobLink);
        sleep(1);
        highlightElements(driver,objRepo.jobTitleLink);
        findButtonClick(objRepo.jobTitleLink);
        sleep(1);
        highlightElements(driver,objRepo.businessManagerLink);
        findButtonClick(objRepo.businessManagerLink);
        sleep(1);
        findButtonClick(objRepo.deleteJobTitleButton);
        sleep(1);
        findButtonClick(objRepo.okButtonForDeleteTitle);
        sleep(1);

    }


    }


