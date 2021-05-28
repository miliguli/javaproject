package org.example.objectrepo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_ObjRepo {
     // login
    @FindBy(id = "divLogo")
    public WebElement loginLog;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(name = "txtUsername")
    public WebElement username;

    @FindBy(id = "txtPassword")
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

    @FindBy(xpath = " //div[@class=\"head\"]")
    public WebElement forgetPasswordHeader;

    @FindBy(id = "securityAuthentication_userName")
    public WebElement authentication_userName;

    @FindBy(name = "button")
    public WebElement resetPasswordButton;

    @FindBy(xpath = "//div[@class=\"message warning fadable\"]")
    public WebElement resetPasswordErrorMessage;

    @FindBy(xpath = "//div[@class=\"message warning fadable\"]")
    public WebElement warningMessage;

    @FindBy(id = "divContent")
    public WebElement restConfirmation;

    @FindBy(id = "spanMessage")
    public WebElement errorMessage;

    @FindBy(linkText = "Forgot your password?")
    public WebElement requestPasswordLink;

    @FindBy(xpath = "//span[text()='( Username : Admin | Password : admin123 )']")
    public WebElement loginInfo;

    @FindBy(id = "footer")
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

    @FindBy(xpath = "//*[@class=\"flot-overlay\"]")
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
    @FindBy(id = "btnSave")
    public WebElement editMyInfoButton;

    @FindBy(name = "personal[txtEmpFirstName]")
    public WebElement firstNameInputBox;

    @FindBy(name = "personal[txtEmpLastName]")
    public WebElement lastnameInputBox;

    @FindBy(name = "personal[txtEmpMiddleName]")
    public WebElement middleNameInputBox;

    @FindBy(name = "personal[txtEmployeeId]")
    public WebElement employeeIdInputBox;

    @FindBy(id = "personal_txtLicExpDate")
    public WebElement licenseExpDatePicker;

    @FindBy(name = "personal[optGender]")
    public WebElement genderButtonForFemale;

    @FindBy(id = "personal_cmbMarital")
    public WebElement maritalStatusSelector;

    @FindBy(id = "personal_txtLicExpDate")
    public WebElement datePicker;

    @FindBy(id = "personal_cmbNation")
    public WebElement nationalitySelector;

    @FindBy(id = "btnSave")
    public WebElement myInfoSaveButton;

    @FindBy(xpath = "//div[@class=\"message success fadable\"]")
    public WebElement infoSavedMessage;

    @FindBy(id = "btnEditCustom")//btnEditCustom
    public WebElement customFieldEditButton;

    @FindBy(name = "custom5")
    public WebElement cityInputForEditCustom;

    @FindBy(name = "custom2")
    public WebElement genderDropdownList;

    @FindBy(id = "btnEditCustom")
    public WebElement saveButtonForEditCustom;

    @FindBy(name = "custom1")
    public WebElement bloodTypeDropdownList;

    @FindBy(xpath = "//div[@class=\"message success fadable\"]")
    public WebElement savedConfirmMessage;

    @FindBy(id="custom3")
    public WebElement countryInputField;

    @FindBy(id = "btnAddAttachment")
    public WebElement addAttachmentsButton;

    @FindBy(id = "ufile")
    public WebElement chooseFileInputField;

    @FindBy(id = "txtAttDesc")
    public WebElement attachmentCommentField;

    @FindBy(id = "btnSaveAttachment")
    public WebElement uploadAttachmentButton;

    @FindBy(xpath = "//*[@class=\"odd\"]") //or //div[@class="message success fadable"]
    public WebElement attachmentListDisplayed;

    @FindBy(id = "btnSave")
    public WebElement editContactDetailsButton;

    @FindBy(id = "contact_street1")
    public WebElement street1InputField;

    @FindBy(id = "contact_street2")
    public WebElement street2InputField;

    @FindBy(id = "contact_city")
    public WebElement contactCityInputField;

    @FindBy(id = "contact_province")
    public WebElement contactStateInputField;

    @FindBy(id = "contact_emp_zipcode")
    public WebElement contactZipCodeField;

    @FindBy(id = "contact_country")
    public WebElement contactCountryDropdownList;

    @FindBy(id = "btnSave")
    public WebElement contactSaveButton;

    @FindBy(xpath = "//div[@class=\"message success fadable\"]")
    public WebElement contactInfoSavedMessage;

    @FindBy(id = "btnAddContact")
    public WebElement addEmgContactsButton;

    @FindBy(id = "emgcontacts_name")
    public WebElement emgContactsName;

    @FindBy(id = "emgcontacts_relationship")
    public WebElement emgContactsRelationship;

    @FindBy(id = "emgcontacts_homePhone")
    public WebElement emgContactsHomePhone;

    @FindBy(id = "btnSaveEContact")
    public WebElement emgContactsSaveButton;

    @FindBy(xpath = "//*[@id=\"emgcontact_list\"]/tbody/tr[1]")
    public WebElement verifyRecordAdded;

    @FindBy(id = "btnAddDependent")
    public WebElement addDependentsButton;

    @FindBy(id = "dependent_name")
    public WebElement nameForDependentInputField;

    @FindBy(id = "dependent_relationshipType")
    public WebElement relationshipForDependents;

    @FindBy(id = "dependent_dateOfBirth")
    public WebElement dateOfBirthInputField;

    @FindBy(id = "btnSaveDependent")
    public WebElement saveButtonForDependents;

    @FindBy(xpath = "//div[@class=\"message success fadable\"]")
    public WebElement verifySavedMessage;

    //Add immigrant record
    @FindBy(id = "btnAdd")
    public WebElement addImmigrantRecordButton;

    @FindBy(id = "immigration_type_flag_1")
    public WebElement passportRadioButton;

    @FindBy(id = "immigration_type_flag_2")
    public WebElement visaRadioButton;

    @FindBy(id = "immigration_number")
    public WebElement numberInputField;

    @FindBy(id = "immigration_passport_issue_date")
    public WebElement issuedDateInputField;

    @FindBy(id = "immigration_passport_expire_date")
    public WebElement expireDateInputField;

    @FindBy(id = "immigration_i9_status")
    public WebElement eligibleStatusInputField;

    @FindBy(id = "immigration_country")
    public WebElement issuedBySelectList;

    @FindBy(id = "immigration_i9_review_date")
    public WebElement eligibleReviewDate;

    @FindBy(id = "immigration_comments")
    public WebElement commentForImmigrationRecord;

    @FindBy(id = "btnSave")
    public WebElement saveButtonForImmigrantRecord;

    @FindBy(id = "immigrationHeading")
    public  WebElement clickButton;

    @FindBy(xpath ="//div[@class=\"message success fadable\"]")
    public WebElement recordAddedMessage;

    @FindBy(xpath = "//*[@id=\"frmImmigrationDelete\"]/table/tbody/tr[1]/td[1]/input")
    public WebElement immigrationRecord;

    @FindBy(id = "btnDelete")
    public WebElement deleteImmigrationRecordButton;

    @FindBy(xpath = "//div[@class='message success fadable']")
    public WebElement deletedMessage;

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

    @FindBy(linkText = "Memberships")
    public WebElement membershipsLinkInAdminPage;

    @FindBy(linkText = "Email Configuration")
    public WebElement emailConfigurationLink;

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

    @FindBy(id = "systemUser_userType")
    public WebElement adminRole;

    @FindBy(id = "systemUser_userType")
    public WebElement essRole;

    @FindBy(id = "systemUser_employeeName_empName")
    public WebElement employeeNameTextbox;

    @FindBy(id = "systemUser_userName")
    public WebElement usernameTextbox;

    @FindBy(id = "systemUser_status")
    public WebElement statusLabel;

    @FindBy(id = "systemUser_status")
    public WebElement enableStatusType;

    @FindBy(id = "systemUser_status")
    public WebElement disableStatusType;

    @FindBy(name = "systemUser[password]")
    public WebElement systemUserPassword;

    @FindBy(name = "systemUser[confirmPassword]")
    public WebElement systemUserConfirmPassword;

    @FindBy(id = "btnSave")
    public WebElement systemUserSaveButton;

    @FindBy(xpath = "//div[@class=\"message success fadable\"]")
    public WebElement successMessage;

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
    @FindBy(id = "btnAdd")
    public WebElement addJobTitleButton;

    @FindBy(id = "jobTitle_jobTitle")
    public WebElement jobTitleInputField;

    @FindBy(id = "jobTitle_jobDescription")
    public WebElement jobDescriptionInputField;

    @FindBy(id = "btnSave")
    public WebElement saveJobTitleButton;

    @FindBy(linkText = "Business Manager")
    public WebElement jobTitleAdded;

    @FindBy(id = "btnDelete")
    public WebElement deleteJobTitleButton;

    @FindBy(name = "chkSelectRow[]")
    public WebElement existingJobTitleLink;

    @FindBy(id = "dialogDeleteBtn")
    public WebElement okButtonForDeleteTitle;

    @FindBy(xpath = "//div[@class=\"message success fadable\"]")
    public WebElement deletedSuccessMessage;

    //PIM page
    @FindBy(id = "menu_pim_viewPimModule")
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
    @FindBy(id = "firstName")
    public WebElement employeeFirstnameInputField;

    @FindBy(id = "lastName")
    public WebElement employeeLastname;

    @FindBy(id = "btnSave")
    public WebElement saveEmployeeButton;

    @FindBy(xpath = "//*[@id=\"profile-pic\"]/h1")
    public WebElement profilePicHeader;

    //Searching employee
    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement employeeNameInputField;

    @FindBy(id = "searchBtn")
    public WebElement searchEmployeeButton;

    @FindBy(css = "td[colspan=\"8\"]")
    public WebElement searchNotFound;

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

    @FindBy(id = "menu_leave_defineLeavePeriod")
    public WebElement menuLeavePeriodLink;

    @FindBy(id = "menu_leave_leaveTypeList")
    public WebElement leaveTypeListLink;

    @FindBy(id = "menu_leave_defineWorkWeek")
    public WebElement defineWorkWeekLink;

    @FindBy(id = "menu_leave_viewHolidayList")
    public WebElement viewHolidayListLink;

    @FindBy(id = "menu_leave_viewLeaveList")
    public WebElement viewLeaveListLink;

    @FindBy(id = "menu_leave_assignLeave")
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

    @FindBy(id = "confirmOkButton")
    public WebElement okButtonForAssignList;

    @FindBy(xpath = "//div[@class=\"message success fadable\"]")
    public WebElement confirmedMessage;

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

