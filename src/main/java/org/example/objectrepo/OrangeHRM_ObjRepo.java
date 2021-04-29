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

    @FindBy(xpath = "//*[@id=\"sidenav\"]/li[8]/a")
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

    @FindBy(xpath = "//*[@id=\"personal_txtLicExpDate\"]")
    public WebElement datePicker;


    @FindBy(xpath = "//*[@id=\"personal_cmbNation\"]")
    public WebElement nationalitySelector;

    @FindBy(id = "btnSave")
    public WebElement myInfoSaveButton;

    @FindBy(id = "btnEditCustom")
    public WebElement customFieldEditButton;

    @FindBy(name = "custom1")
    public WebElement bloodTypeSelector;

    @FindBy(xpath = "//*[@id=\'btnAddAttachment\']") 
    public WebElement addAttachmentsButton;

    @FindBy(xpath = "//*[@id=\'ufile\']")
    public WebElement chooseFileInputField;

    @FindBy(xpath = "//*[@id=\'txtAttDesc\']")
    public WebElement attachmentCommentField;

    @FindBy(xpath = "//*[@id=\'btnSaveAttachment\']")
    public WebElement uploadAttachmentButton;

    @FindBy(xpath = "//*[@id=\'tblAttachments\']/tbody/tr")
    public WebElement attachmentListDisplayed;

    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    public WebElement editContactDetailsButton;

    @FindBy(xpath = "//*[@id=\"contact_street1\"]")
    public WebElement street1InputField;

    @FindBy(xpath = "//*[@id=\"contact_street2\"]")
    public WebElement street2InputField;

    @FindBy(xpath = "//*[@id=\"contact_city\"]")
    public WebElement contactCityInputField;

    @FindBy(xpath = "//*[@id=\"contact_province\"]")
    public WebElement contactStateInputField;

    @FindBy(xpath = "//*[@id=\"contact_emp_zipcode\"]")
    public WebElement contactZipCodeField;

    @FindBy(xpath = "//*[@id=\"contact_country\"]")
    public WebElement contactCountryDropdownList;

    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    public WebElement contactSaveButton;

    @FindBy(xpath = "//*[@id=\"btnAddContact\"]")
    public WebElement addEmgContactsButton;

    @FindBy(xpath = "//*[@id=\"emgcontacts_name\"]")
    public WebElement emgContactsName;

    @FindBy(xpath = "//*[@id=\'emgcontacts_relationship\']")
    public WebElement emgContactsRelationship;

    @FindBy(xpath = "//*[@id=\'emgcontacts_homePhone\']")
    public WebElement emgContactsHomePhone;

    @FindBy(xpath = "//*[@id=\"btnSaveEContact\"]")
    public WebElement emgContactsSaveButton;

    @FindBy(xpath = "//*[@id=\"emgcontact_list\"]/tbody/tr[1]")
    public WebElement verifyRecordAdded;

    @FindBy(id = "btnAddDependent")
    public WebElement addDependentsButton;

    @FindBy(xpath = "//*[@id='dependent_name']") ////*[@id="dependent_name"]
    public WebElement nameForDependentInputField;

    @FindBy(xpath = "//*[@id='dependent_relationshipType']")
    public WebElement relationshipForDependents;

    @FindBy(xpath = "//*[@id='dependent_dateOfBirth']")
    public WebElement dateOfBirthInputField;

    @FindBy(xpath = "//*[@id='btnSaveDependent']")
    public WebElement saveButtonForDependents;

    @FindBy(xpath = "//*[@id=\"dependent_list\"]/tbody/tr[2]/td[2]")
    public WebElement verifyDependentsAdded;

    //Add immigrant record
    @FindBy(xpath = "//*[@id=\"btnAdd\"]")
    public WebElement addImmigrantRecordButton;

    @FindBy(xpath = "//*[@id=\"immigration_type_flag_1\"]")
    public WebElement passportRadioButton;

    @FindBy(xpath = "//*[@id=\"immigration_type_flag_2\"]")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//*[@id=\"immigration_number\"]")
    public WebElement numberInputField;

    @FindBy(xpath = "//*[@id=\"immigration_passport_issue_date\"]")
    public WebElement issuedDateInputField;

    @FindBy(xpath = "//*[@id=\"immigration_passport_expire_date\"]")
    public WebElement expireDateInputField;

    @FindBy(xpath = "//*[@id=\"immigration_i9_status\"]")
    public WebElement eligibleStatusInputField;

    @FindBy(xpath = "//*[@id=\"immigration_country\"]")
    public WebElement issuedBySelectList;

    @FindBy(xpath = "//*[@id=\"immigration_i9_review_date\"]")
    public WebElement eligibleReviewDate;

    @FindBy(xpath = "//*[@id=\"immigration_comments\"]")
    public WebElement commentForImmigrationRecord;

    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    public WebElement saveButtonForImmigrantRecord;

    @FindBy(xpath = "//*[@id=\"frmEmpImmigration\"]/fieldset/ol/li[4]/label")
    public  WebElement clickButton;

    @FindBy(xpath = "//*[@id=\"frmImmigrationDelete\"]/table/tbody/tr/td[2]")
    public WebElement recordAdded;

    @FindBy(xpath = "//*[@id=\"frmImmigrationDelete\"]/table/tbody/tr[1]/td[1]/input")
    public WebElement immigrationRecord;

    @FindBy(xpath = "//*[@id=\"btnDelete\"]")
    public WebElement deleteImmigrationRecordButton;


    //Admin Page
    @FindBy(linkText = "Admin")
    public WebElement adminLink;

    @FindBy(linkText = "User Management")
    public WebElement userManagementLink;

    @FindBy(linkText = "Users")
    public WebElement usersLink;

    @FindBy(linkText = "Job")
    public WebElement jobLink;

    @FindBy(linkText = "Job Titles")
    public WebElement jobTitleLink;

    @FindBy(linkText = "Pay Grades")
    public WebElement payGradesLink;

    @FindBy(linkText = "Employment Status")
    public WebElement employmentStatusLink;

    @FindBy(linkText = "Job Categories")
    public WebElement jobCategoriesLink;

    @FindBy(linkText = "Work Shifts")
    public WebElement workShiftsLink;

    @FindBy(linkText = "General Information")
    public WebElement generalInformation;

    @FindBy(linkText = "Locations")
    public WebElement locationLink;

    @FindBy(linkText = "Structure")
    public WebElement structureLink;

    @FindBy(linkText = "Skills")
    public WebElement skillsLink;

    @FindBy(linkText = "Education")
    public WebElement educationLink;

    @FindBy(linkText = "Licenses")
    public WebElement licensesLink;

    @FindBy(linkText = "Languages")
    public WebElement languagesLink;

    @FindBy(xpath = "//*[@id='menu_admin_membership']")
    public WebElement membershipsLinkInAdminPage;

    @FindBy(linkText = "Email Subscriptions")
    public WebElement emailSubscriptionsLink;

    @FindBy(linkText = "Localization")
    public WebElement localizationLink;

    @FindBy(linkText = "Language Packages")
    public WebElement languagePackagesLink;

    @FindBy(linkText = "Modules")
    public WebElement modulesLink;

    @FindBy(linkText = "Social Media Authentication")
    public WebElement socialMediaAuthenticationLink;

    @FindBy(linkText = "Register OAuth Client")
    public WebElement registerOAuthClient;

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
    public WebElement userRoleType;

    @FindBy(xpath = "//*[@id=\"systemUser_userType\"]/option[1]")
    public WebElement adminRole;

    @FindBy(xpath = "//*[@id=\"systemUser_userType\"]/option[2]")
    public WebElement essRole;

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

    //add job title
    @FindBy(xpath = "//*[@id=\"btnAdd\"]")
    public WebElement addJobTitleButton;

    @FindBy(xpath = "//*[@id=\"jobTitle_jobTitle\"]")
    public WebElement jobTitleInputField;

    @FindBy(xpath = "//*[@id=\"jobTitle_jobDescription\"]")
    public WebElement jobDescriptionInputField;

    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    public WebElement saveJobTitleButton;

    @FindBy(linkText = "Business Manager")
    public WebElement jobTitleAdded;

    @FindBy(id = "btnDelete")
    public WebElement deleteJobTitleButton;

    @FindBy(name= "chkSelectRow[]")
    public WebElement businessManagerLink;

    @FindBy(id = "dialogDeleteBtn")
    public WebElement okButtonForDeleteTitle;


    //PIM page
    @FindBy(xpath = "//*[@id=\"menu_pim_viewPimModule\"]")
    public WebElement pimLink;

    @FindBy(linkText = "Configuration")
    public WebElement configurationLinkOnPimPage;

    @FindBy(linkText = "Optional Fields")
    public WebElement optionalFieldsLink;

    @FindBy(linkText = "Custom Fields")
    public WebElement customFieldsLink;

    @FindBy(linkText = "Data Import")
    public WebElement dataImportLink;

    @FindBy(linkText = "Reporting Methods")
    public WebElement reportingMethodsLink;

    @FindBy(linkText = "Termination Reasons")
    public WebElement terminationReasonsLink;

    @FindBy(linkText = "Employee List")
    public WebElement employeeListLink;

    @FindBy(linkText = "Add Employee")
    public WebElement addEmployeeLink;

    @FindBy(linkText = "Reports")
    public WebElement reportsLink;

    //add employee in PIM page
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement employeeFirstnameInputField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement employeeLastName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement employeeLastname;

    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    public WebElement saveEmployeeButton;

    @FindBy(xpath = "//*[@id=\"profile-pic\"]/h1")
    public WebElement profilePicHeader;

    //Searching employee
    @FindBy(xpath = "//*[@id=\"empsearch_employee_name_empName\"]")
    public WebElement employeeNameInputField;

    @FindBy(xpath = "//*[@id=\"searchBtn\"]")
    public WebElement searchEmployeeButton;

    //Leave List Page
    @FindBy(id = "menu_leave_viewLeaveModule")
    public WebElement leaveLink;

    @FindBy(id = "menu_leave_applyLeave")
    public WebElement applyLink;

    @FindBy(id = "menu_leave_viewMyLeaveList")
    public WebElement myLeaveLinkLeavePage;

    @FindBy(linkText = "Entitlements")
    public WebElement entitlementsLink;

    @FindBy(linkText = "Add Entitlements")
    public WebElement addEntitlementsLink;

    @FindBy(linkText = "Employee Entitlements")
    public WebElement employeeEntitlementsLink;

    @FindBy(linkText = "My Entitlements")
    public WebElement myEntitlementsLink;

    @FindBy(linkText = "Reports")
    public WebElement reportsLinkLeavePage;

    @FindBy(linkText = "Leave Entitlements and Usage Report")
    public WebElement leaveEntitlementReportLink;

    @FindBy(linkText = "My Leave Entitlements and Usage Report")
    public WebElement myLeaveEntitlementsReportLink;

    @FindBy(linkText = "Configure")
    public WebElement configureLink;

    @FindBy(xpath = "//*[@id=\"menu_leave_defineLeavePeriod\"]")
    public WebElement menuLeavePeriodLink;

    @FindBy(xpath = "//*[@id=\"menu_leave_leaveTypeList\"]")
    public WebElement leaveTypeListLink;

    @FindBy(xpath = "//*[@id=\"menu_leave_defineWorkWeek\"]")
    public WebElement defineWorkWeekLink;

    @FindBy(xpath = "//*[@id=\"menu_leave_viewHolidayList\"]")
    public WebElement viewHolidayListLink;

    @FindBy(xpath = "//*[@id=\"menu_leave_viewLeaveList\"]")
    public WebElement viewLeaveListLink;

    @FindBy(xpath = "//*[@id=\"menu_leave_assignLeave\"]")
    public WebElement assignLeaveLinkLeavePage;

    @FindBy(name = "leaveList[calFromDate]")
    public WebElement fromDateInput;

    @FindBy(name = "leaveList[calToDate]")
    public WebElement toDateInput;

    @FindBy(id = "leaveList_chkSearchFilter_checkboxgroup_allcheck")
    public WebElement withStatusCheckbox;

    @FindBy(id = "leaveList_cmbSubunit")
    public WebElement subUnitDropdownList;

    @FindBy(id = "btnSearch")
    public WebElement leaveListSearchButton;

    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr")
    public WebElement leaveListResult;

    @FindBy(id = "assignleave_txtEmployee_empName")
    public WebElement assignEmployeeNameInput;

    @FindBy(id = "assignleave_txtLeaveType")
    public WebElement assignLeaveTypeList;

    @FindBy(name = "assignleave[txtFromDate]")
    public WebElement assignFromDateInput;

    @FindBy(name = "assignleave[txtToDate]")
    public WebElement assignToDateInput;

    @FindBy(id = "assignleave_partialDays")
    public WebElement partialDaysInput;

    @FindBy(id = "assignleave_firstDuration_duration")
    public WebElement durationDropdwonList;

    @FindBy(id = "assignleave_firstDuration_ampm")
    public WebElement durationTime;

    @FindBy(id = "assignBtn")
    public WebElement assignLeaveButton;

    //Time PAge
    @FindBy(id = "menu_time_viewTimeModule")
    public WebElement timeLink;

    @FindBy(id = "menu_time_Timesheets")
    public WebElement timeSheetsLinkTimePage;

    @FindBy(id = "menu_time_viewMyTimesheet")
    public WebElement myTimeSheetsLinkTimePage;

    @FindBy(linkText = "Employee Timesheets")
    public WebElement employeeTimeSheetsLink;

    @FindBy(linkText = "Attendance")
    public WebElement attendanceLink;

    @FindBy(linkText = "My Records")
    public WebElement myRecordsLink;

    @FindBy(linkText = "Punch In/Out")
    public WebElement punchInOutLink;

    @FindBy(linkText = "Employee Records")
    public WebElement employeeRecordsLink;

    @FindBy(linkText = "Configuration")
    public WebElement configurationLinkOnTimePage;

    @FindBy(linkText = "Reports")
    public WebElement reportsLinkTimePage;

    @FindBy(linkText = "Project Reports")
    public WebElement projectReportsLink;

    @FindBy(linkText = "Employee Reports")
    public WebElement employeeReportsLink;

    @FindBy(linkText = "Attendance Summary")
    public WebElement attendanceSummaryLink;

    @FindBy(linkText = "Project Info")
    public WebElement projectInfoLink;

    @FindBy(linkText = "Customers")
    public WebElement customersLink;

    @FindBy(linkText = "Projects")
    public WebElement projectsLink;






}

