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
        findButtonClick(objRepo.adminLink);
        Reporter.log("Start validating user management list on the Admin page");
        //validating User management list
        findButtonClick(objRepo.userManagementLink);
        validatePage(driver,objRepo.usersLink);
        //validating job list
        findButtonClick(objRepo.jobLink);
        validatePage(driver,objRepo.jobTitleLink);
        validatePage(driver,objRepo.payGradesLink);
        validatePage(driver,objRepo.employmentStatusLink);
        validatePage(driver,objRepo.jobCategoriesLink);
        validatePage(driver,objRepo.workShiftsLink);
        //validating organization list
        findButtonClick(objRepo.organizationLink);
        validatePage(driver,objRepo.generalInformation);
        validatePage(driver,objRepo.locationLink);
        validatePage(driver,objRepo.structureLink);
        //validating qualification list
        validatePage(driver, objRepo.qualificationsLinkInAdminPage);
        findButtonClick(objRepo.qualificationsLinkInAdminPage);
        validatePage(driver,objRepo.skillsLink);
        validatePage(driver,objRepo.educationLink);
        validatePage(driver,objRepo.licensesLink);
        validatePage(driver,objRepo.languagesLink);
        validatePage(driver,objRepo.membershipsLinkInAdminPage);
        //validating nationalities list
        validatePage(driver,objRepo.nationalitiesLink);
        //validating configuration list
        highlightElements(driver,objRepo.configurationLink);
        findButtonClick(objRepo.configurationLink);
        validatePage(driver,objRepo.emailConfigurationLink);
        validatePage(driver,objRepo.emailSubscriptionsLink);
        validatePage(driver,objRepo.localizationLink);
        validatePage(driver,objRepo.languagePackagesLink);
        validatePage(driver, objRepo.modulesLink);
        validatePage(driver,objRepo.socialMediaAuthenticationLink);
        validatePage(driver,objRepo.registerOAuthClient);
        Reporter.log("All the links on the admin page are validated");
    }

    public void addSystemUser(WebDriver driver)
    {
        Reporter.log("Navigate to admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        //adding system user
        waitForElementVisible(driver,objRepo.addUserButton);
        highlightElements(driver,objRepo.addUserButton);
        findButtonClick(objRepo.addUserButton);
        sleep(1);
        //selecting user type
        waitForElementVisible(driver,objRepo.userRoleType);
        findButtonClick(objRepo.userRoleType);
        sleep(1);
        highlightElements(driver,objRepo.adminRole);
        Assert.assertTrue(objRepo.adminRole.isDisplayed());
        highlightElements(driver,objRepo.essRole);
        Assert.assertTrue(objRepo.essRole.isDisplayed());
        waitForElementVisible(driver,objRepo.employeeNameTextbox);
        //enter EmployeeFirstName and EmployeeLastName
        inputTextField(driver,objRepo.employeeNameTextbox, CommonVariables.orangeHRM_MyInfo_EmployeeFirstName+" "+CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        waitForElementVisible(driver,objRepo.usernameTextbox);
        //entering system user name
        inputTextField(driver,objRepo.usernameTextbox,CommonVariables.orangeHRM_System_Username);
        highlightElements(driver,objRepo.statusLabel);
        findButtonClick(objRepo.statusLabel);
        highlightElements(driver,objRepo.enableStatusType);
        Assert.assertTrue(objRepo.enableStatusType.isDisplayed());
        highlightElements(driver,objRepo.disableStatusType);
        Assert.assertTrue(objRepo.disableStatusType.isDisplayed());
        waitForElementVisible(driver,objRepo.systemUserPassword);
        //entering password
        inputTextField(driver,objRepo.systemUserPassword,CommonVariables.orangeHRM_System_Password);
        waitForElementVisible(driver,objRepo.systemUserConfirmPassword);
        inputTextField(driver,objRepo.systemUserConfirmPassword,CommonVariables.orangeHRM_System_Password);
        highlightElements(driver,objRepo.systemUserSaveButton);
        //saving system user
        findButtonClick(objRepo.systemUserSaveButton);
        highlightElements(driver,objRepo.successMessage);
        sleep(1);
        Assert.assertTrue(objRepo.successMessage.isDisplayed());
        Reporter.log("System user added successfully");
    }

    public void searchSystemUser(WebDriver driver)
    {
        Reporter.log("Start navigating to admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        sleep(1);
        Reporter.log("Start searching system user");
        waitForElementVisible(driver,objRepo.searchUsernameField);
        //entering username
        inputTextField(driver,objRepo.searchUsernameField,CommonVariables.orangeHRM_System_Username);
        sleep(1);
        //selecting User type
        selectFromDropDownList(objRepo.searchSystemUserDropdownList,CommonVariables.orangeHRM_Admin_UserType);
        //searching status type
        selectFromDropDownList(objRepo.searchStatusDropdownList,CommonVariables.orangeHRM_Admin_StatusType);
        waitForElementVisible(driver,objRepo.searchButton);
        highlightElements(driver,objRepo.searchButton);
        findButtonClick(objRepo.searchButton);
        sleep(1);
        highlightElements(driver,objRepo.systemUserLink);
        sleep(1);
        Assert.assertTrue(objRepo.systemUserLink.isDisplayed());
        Reporter.log("One record is displayed");
    }

    public void searchInvalidUser(WebDriver driver)
    {
        Reporter.log("Searching an invalid system user on the admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        sleep(1);
        waitForElementVisible(driver,objRepo.searchUsernameField);
        //entering invalid username to username input field
        inputTextField(driver,objRepo.searchUsernameField,CommonVariables.orangeHRM_System_InvalidUsername);
        highlightElements(driver,objRepo.searchButton);
        //searching invalid user
        findButtonClick(objRepo.searchButton);
        sleep(1);
        highlightElements(driver,objRepo.searchErrorMessage);
        Assert.assertTrue(objRepo.searchErrorMessage.isDisplayed());
        Reporter.log("'No record found' message is displayed");
    }

    public void addJobTitle(WebDriver driver)
    {
        Reporter.log("Start adding job title to the admin page");
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        sleep(1);
        highlightElements(driver,objRepo.jobLink);
        findButtonClick(objRepo.jobLink);
        highlightElements(driver,objRepo.jobTitleLink);
        //navigating to job title page
        findButtonClick(objRepo.jobTitleLink);
        waitForElementVisible(driver,objRepo.addJobTitleButton);
        //clicking add job title button
        findButtonClick(objRepo.addJobTitleButton);
        //entering job title to the input field
        inputTextField(driver,objRepo.jobTitleInputField,CommonVariables.orangeHRM_Admin_JobTitle);
        sleep(1);
        //entering job description
        inputTextField(driver,objRepo.jobDescriptionInputField,CommonVariables.orangeHRM_Admin_JobDescription);
        sleep(1);
        //saving job title
        findButtonClick(objRepo.saveJobTitleButton);
        Assert.assertTrue(objRepo.jobTitleAdded.isDisplayed());
        Reporter.log("One job title Added to the page");
    }

    public void deleteJobTitle(WebDriver driver)
    {
        Reporter.log("Start deleting a job title on the admin page");
        //navigation to the admin page
        waitForElementVisible(driver,objRepo.adminLink);
        findButtonClick(objRepo.adminLink);
        sleep(1);
        highlightElements(driver,objRepo.jobLink);
        findButtonClick(objRepo.jobLink);
        sleep(1);
        highlightElements(driver,objRepo.jobTitleLink);
        findButtonClick(objRepo.jobTitleLink);
        sleep(1);
        //selection a job title
        highlightElements(driver,objRepo.existingJobTitleLink);
        findButtonClick(objRepo.existingJobTitleLink);
        sleep(1);
        //deleting job title
        findButtonClick(objRepo.deleteJobTitleButton);
        sleep(1);
        findButtonClick(objRepo.okButtonForDeleteTitle);
        sleep(1);
        highlightElements(driver,objRepo.deletedSuccessMessage);
        Assert.assertTrue(objRepo.deletedSuccessMessage.isDisplayed());
        Reporter.log("One job title got deleted");

    }


    }


