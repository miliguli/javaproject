package org.example.objectrepo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_ObjRepo {
     // login
    @FindBy(xpath = "//*[@id=\"divLogo\"]/img")
    public WebElement loginLog;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

    @FindBy(css = "input#txtUsername")
    public WebElement username;

    @FindBy(css = "input#txtPassword")
    public WebElement password;

    @FindBy(linkText = "Dashboard")
    public WebElement loggedInDashboardPage;

    // logout
    @FindBy(id = "welcome")
    public WebElement welcomeLink;

    @FindBy(id = "aboutDisplayLink")
    public WebElement aboutLink;

    @FindBy(linkText = "Logout")
    public WebElement logoutLink;

    @FindBy(id = "logInPanelHeading")
    public WebElement loginPanel;

    //resetting password
    @FindBy(linkText = "Forgot your password?")
    public WebElement passwordRestLink;

    @FindBy(css = "#content > div.box > div.head > h1")
    public WebElement forgetPasswordHeader;

    @FindBy(id = "securityAuthentication_userName")
    public WebElement authentication_userName;

    @FindBy(name = "button")
    public WebElement resetPasswordButton;

    @FindBy(css = "#content > div.box > div.head > h1")
    public WebElement restConfirmation;

    @FindBy(id = "spanMessage")
    public WebElement errorMessage;

    @FindBy(linkText = "Forgot your password?")
    public WebElement requestPasswordLink;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/span")
    public WebElement loginInfo;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]")
    public WebElement loginPageFooter;

    //Dashboard Page
    @FindBy(xpath = "//span[text()='Assign Leave']")
    public WebElement assignLeaveLink;

    @FindBy(xpath = "//span[text()='Leave List']")
    public WebElement leaveListLink;

    @FindBy(xpath = "//span[text()='Timesheets']")
    public WebElement timeSheetsLink;

    @FindBy(xpath = "//span[text()='Apply Leave']")
    public WebElement applyLeaveLink;

    @FindBy(xpath = "//span[text()='My Leave']")
    public WebElement myLeaveLink;

    @FindBy(xpath = "//span[text()='My Timesheet']")
    public WebElement myTimesheetLink;

    @FindBy(css = "#div_graph_display_emp_distribution > canvas.flot-overlay")
    public WebElement empDistributionCanvas;

    @FindBy(id = "panel_resizable_1_1")
    public WebElement legendFieldSet;

    @FindBy(id = "panel_resizable_1_2")
    public WebElement pendingLeaveFieldSet;

    //My Info Page
    @FindBy(linkText = "My Info")
    public WebElement myInfoLink;

    @FindBy(linkText = "Personal Details")
    public WebElement personDetailsLink;

    @FindBy(linkText = "Contact Details")
    public WebElement contactDetailsLink;

    @FindBy(linkText = "Emergency Contacts")
    public WebElement emergencyContactsLink;

    @FindBy(linkText = "Dependents")
    public WebElement dependentsLink;

    @FindBy(linkText = "Immigration")
    public WebElement immigrationLink;

    @FindBy(linkText = "Job")
    public WebElement jobLinkinMyInfoPage;

    @FindBy(linkText = "Salary")
    public WebElement salaryLink;

    @FindBy(linkText = "Tax Exemptions")
    public WebElement taxExemptionsLink;

    @FindBy(linkText = "Report-to")
    public WebElement reportToLink;

    @FindBy(linkText = "Qualifications")
    public WebElement qualificationsLink;

    @FindBy(linkText = "Memberships")
    public WebElement membershipsLink;

    //edit My info
    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    public WebElement editMyInfoButton;

    @FindBy(name = "personal[txtEmpFirstName]")
    public WebElement firstNameInputBox;

    @FindBy(name = "personal[txtEmpLastName]")
    public WebElement lastnameInputBox;

    @FindBy(name = "personal[txtEmployeeId]")
    public WebElement employeeIdInputBox;

    @FindBy(id = "personal_txtLicExpDate")
    public WebElement licenseExpDatePicker;

    @FindBy(xpath = "//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[3]/li[1]/ul/li[2]/label")
    public WebElement genderButtonForFemale;

    @FindBy(xpath = "//select[@id='personal_cmbMarital']")
    public WebElement maritalStatusSelector;

    @FindBy(xpath = "//*[@id=\"personal_cmbNation\"]")
    public WebElement nationalitySelector;

    @FindBy(id = "btnSave")
    public WebElement myInfoSaveButton;

    @FindBy(id = "btnEditCustom")
    public WebElement customFieldEditButton;

    @FindBy(name = "custom1")
    public WebElement bloodTypeSelector;

    @FindBy(xpath = "//*[@id=\'btnAddAttachment\']")
    public WebElement addButtonForAddingAttachment;

    @FindBy(xpath = "//*[@id=\'ufile\']")
    public WebElement addAttachmentForInfoPage;

    @FindBy(xpath = "//*[@id=\'txtAttDesc\']")
    public WebElement attachmentCommentField;

    @FindBy(xpath = "//*[@id=\'btnSaveAttachment\']")
    public WebElement uploadAttachmentButton;

    @FindBy(xpath = "//*[@id=\'btnAddAttachment\']")
    public WebElement addAttachmentButton;

    @FindBy(xpath = "//*[@id=\'tblAttachments\']/tbody/tr")
    public WebElement attachmentListDisplayed;



    //Admin Page
    @FindBy(linkText = "Admin")
    public WebElement adminLink;

    @FindBy(linkText = "User Management")
    public WebElement userManagementLink;

    @FindBy(linkText = "Job")
    public WebElement jobLink;

    @FindBy(linkText = "Organization")
    public WebElement organizationLink;

    @FindBy(linkText = "Qualifications")
    public WebElement qualificationsLinkInAdminPage;

    @FindBy(linkText = "Nationalities")
    public WebElement nationalitiesLink;

    @FindBy(linkText = "Configuration")
    public WebElement  configurationLink;

    @FindBy(id ="btnAdd")
    public WebElement addUserButton;

    @FindBy(id = "systemUser_userType")
    public WebElement userTypeForAddingUser;

    @FindBy(xpath = "//*[@id=\"systemUser_userType\"]/option[1]")
    public WebElement adminUserType;

    @FindBy(xpath = "//*[@id=\"systemUser_userType\"]/option[2]")
    public WebElement essUserType;

    @FindBy(xpath = "//*[@id=\"systemUser_employeeName_empName\"]")
    public WebElement employeeNameTextbox;

    @FindBy(id = "systemUser_userName")
    public WebElement usernameTextbox;

    @FindBy(id = "systemUser_status")
    public WebElement statusLabel;

    @FindBy(xpath = "//*[@id=\"systemUser_status\"]/option[1]")
    public WebElement enableStatusType;

    @FindBy(xpath = "//*[@id=\"systemUser_status\"]/option[2]")
    public WebElement disableStatusType;

    @FindBy(name = "systemUser[password]")
    public WebElement systemUserPassword;

    @FindBy(name = "systemUser[confirmPassword]")
    public WebElement systemUserConfirmPassword;

    @FindBy(id = "btnSave")
    public WebElement systemUserSaveButton;

    @FindBy(id = "searchSystemUser_userName")
    public WebElement searchUsernameField;

    @FindBy(id = "searchSystemUser_userType")
    public WebElement searchSystemUserDropdownList;

    @FindBy(id = "searchSystemUser_status")
    public WebElement searchStatusDropdownList;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;

    @FindBy(linkText = "Milyyy")
    public WebElement systemUserLink;

    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td")
    public WebElement searchErrorMessage;


}

