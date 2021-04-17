package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.commonvariables.CommonVariables;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class MyInfoPage extends CommonFunctions {

    OrangeHRM_ObjRepo objRepo;

    public MyInfoPage(WebDriver driver)
    {
        objRepo= PageFactory.initElements(driver,OrangeHRM_ObjRepo.class);
    }

    public void validateMyInfo(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start validating all the links on 'My Info Page'");
        findButtonClick(objRepo.myInfoLink);
        scrollIntoView(driver, objRepo.personDetailsLink);
        highlightElements(driver,objRepo.personDetailsLink);
        Assert.assertTrue(objRepo.personDetailsLink.isDisplayed());
        highlightElements(driver,objRepo.contactDetailsLink);
        Assert.assertTrue(objRepo.contactDetailsLink.isDisplayed());
        highlightElements(driver,objRepo.emergencyContactsLink);
        Assert.assertTrue(objRepo.emergencyContactsLink.isDisplayed());
        highlightElements(driver,objRepo.dependentsLink);
        Assert.assertTrue(objRepo.dependentsLink.isDisplayed());
        highlightElements(driver,objRepo.immigrationLink);
        Assert.assertTrue(objRepo.immigrationLink.isDisplayed());
        highlightElements(driver,objRepo.jobLinkinMyInfoPage);
        Assert.assertTrue(objRepo.jobLinkinMyInfoPage.isDisplayed());
        highlightElements(driver,objRepo.salaryLink);
        Assert.assertTrue(objRepo.salaryLink.isDisplayed());
        //highlightElements(driver,objRepo.taxExemptionsLink);
        //Assert.assertTrue(objRepo.taxExemptionsLink.isDisplayed());
        highlightElements(driver,objRepo.reportToLink);
        Assert.assertTrue(objRepo.reportToLink.isDisplayed());
        highlightElements(driver,objRepo.qualificationsLinkInAdminPage);
        Assert.assertTrue(objRepo.qualificationsLinkInAdminPage.isDisplayed());
        highlightElements(driver,objRepo.membershipsLink);
        Assert.assertTrue(objRepo.membershipsLink.isDisplayed());
        Reporter.log("All the links are displayed on the MyInfo page");
    }

    public void editMyInfoPage(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start editing personal information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        waitForElementVisible(driver, objRepo.editMyInfoButton);
        highlightElements(driver, objRepo.editMyInfoButton);
        findButtonClick(objRepo.editMyInfoButton);
        waitForElementVisible(driver, objRepo.firstNameInputBox);
        highlightElements(driver, objRepo.firstNameInputBox);
        inputTextField(driver, objRepo.firstNameInputBox, CommonVariables.orangeHRM_MyInfo_EmployeeFirstName);
        waitForElementVisible(driver, objRepo.lastnameInputBox);
        highlightElements(driver, objRepo.lastnameInputBox);
        inputTextField(driver, objRepo.lastnameInputBox, CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        waitForElementVisible(driver, objRepo.employeeIdInputBox);
        highlightElements(driver, objRepo.employeeIdInputBox);
        inputTextField(driver, objRepo.employeeIdInputBox, CommonVariables.orangeHRM_MyInfo_EmployeeId);
        waitForElementVisible(driver, objRepo.licenseExpDatePicker);
        highlightElements(driver, objRepo.licenseExpDatePicker);
        findButtonClick(objRepo.licenseExpDatePicker);
        sleep(1);
        //datePicker
        inputTextField(driver,objRepo.datePicker,CommonVariables.orangeHRM_MyInfo_ExpiryDate);
        sleep(1);
        waitForElementVisible(driver, objRepo.genderButtonForFemale);
        findButtonClick(objRepo.genderButtonForFemale);
        Reporter.log("Selecting marital status");
        waitForElementVisible(driver, objRepo.maritalStatusSelector);
        highlightElements(driver, objRepo.maritalStatusSelector);
        selectFromDropDownList(objRepo.maritalStatusSelector, CommonVariables.orangeHRM_MyInfo_MaritalStatus);
        sleep(1);
        Reporter.log("Selecting nationality from dropdown list");
        waitForElementVisible(driver, objRepo.nationalitySelector);
        highlightElements(driver, objRepo.nationalitySelector);
        selectFromDropDownList(objRepo.nationalitySelector, CommonVariables.orangeHRM_MyInfo_Nationality);
        waitForElementVisible(driver, objRepo.myInfoSaveButton);
        highlightElements(driver, objRepo.myInfoSaveButton);
        findButtonClick(objRepo.myInfoSaveButton);
        sleep(1);
        Reporter.log("Start editing 'Custom Fields' on MyInfo Page");
        waitForElementVisible(driver, objRepo.customFieldEditButton);
        highlightElements(driver, objRepo.customFieldEditButton);
        scrollIntoView(driver, objRepo.customFieldEditButton);
        findButtonClick(objRepo.customFieldEditButton);
        waitForElementVisible(driver, objRepo.bloodTypeSelector);
        selectFromDropDownList(objRepo.bloodTypeSelector, CommonVariables.orangeHRM_MyInfo_BloodType);
        sleep(1);
        Reporter.log("Adding file to the personal information page");
        waitForElementVisible(driver, objRepo.addAttachmentsButton);
        highlightElements(driver, objRepo.addAttachmentsButton);
        findButtonClick(objRepo.addAttachmentsButton);
        sleep(1);
        waitForElementVisible(driver, objRepo.chooseFileInputField);
        highlightElements(driver, objRepo.chooseFileInputField);
        uploadFile(driver, By.xpath("//*[@id=\'ufile\']"), CommonVariables.orangeHRM_MyInfoFilePath);
        sleep(1);
        waitForElementVisible(driver, objRepo.attachmentCommentField);
        inputTextField(driver, objRepo.attachmentCommentField, CommonVariables.orangeHRM_MyInfo_AttachmentComment);
        waitForElementVisible(driver, objRepo.uploadAttachmentButton);
        highlightElements(driver, objRepo.uploadAttachmentButton);
        findButtonClick(objRepo.uploadAttachmentButton);
        sleep(1);
        Assert.assertTrue(objRepo.attachmentListDisplayed.isDisplayed());
        Reporter.log("'Personal details' got updated");
    }

    public void editContactDetails(WebDriver driver) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        Reporter.log("Start editing 'Contact Details'");
        waitForElementVisible(driver, objRepo.contactDetailsLink);
        highlightElements(driver, objRepo.contactDetailsLink);
        sleep(1);
        findButtonClick(objRepo.contactDetailsLink);
        waitForElementVisible(driver, objRepo.editContactDetailsButton);
        findButtonClick(objRepo.editContactDetailsButton);
        waitForElementVisible(driver, objRepo.street1InputField);
        highlightElements(driver, objRepo.street1InputField);
        inputTextField(driver, objRepo.street1InputField, CommonVariables.orangeHRM_Contact_Street1);
        sleep(1);
        waitForElementVisible(driver, objRepo.street2InputField);
        highlightElements(driver, objRepo.street2InputField);
        inputTextField(driver, objRepo.street2InputField, CommonVariables.orangeHRM_Contact_Street2);
        sleep(1);
        waitForElementVisible(driver, objRepo.contactCityInputField);
        highlightElements(driver, objRepo.contactCityInputField);
        inputTextField(driver, objRepo.contactCityInputField, CommonVariables.orangeHRM_Contact_City);
        sleep(1);
        highlightElements(driver, objRepo.contactStateInputField);
        inputTextField(driver, objRepo.contactStateInputField, CommonVariables.orangeHRM_Contact_State);
        sleep(1);
        highlightElements(driver, objRepo.contactZipCodeField);
        inputTextField(driver, objRepo.contactZipCodeField, CommonVariables.orangeHRM_Contact_ZipCode);
        sleep(1);
        highlightElements(driver, objRepo.contactCountryDropdownList);
        selectFromDropDownList(objRepo.contactCountryDropdownList, CommonVariables.orangeHRM_Contact_Country);
        sleep(1);
        waitForElementVisible(driver, objRepo.contactSaveButton);
        findButtonClick(objRepo.contactSaveButton);
        sleep(1);
        Reporter.log("Contact details are updated");
    }

    public void addEmergencyContacts(WebDriver driver)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        Reporter.log("Start editing 'Emergency Contacts'");
        waitForElementVisible(driver,objRepo.emergencyContactsLink);
        highlightElements(driver,objRepo.emergencyContactsLink);
        findButtonClick(objRepo.emergencyContactsLink);
        waitForElementVisible(driver,objRepo.addEmgContactsButton);
        highlightElements(driver,objRepo.addEmgContactsButton);
        findButtonClick(objRepo.addEmgContactsButton);
        sleep(1);
        waitForElementVisible(driver,objRepo.emgContactsName);
        inputTextField(driver,objRepo.emgContactsName,CommonVariables.orangeHRM_EmergencyContact_name);
        sleep(1);
        waitForElementVisible(driver,objRepo.emgContactsRelationship);
        inputTextField(driver,objRepo.emgContactsRelationship,CommonVariables.orangeHRM_EmergencyContact_Relationship);
        sleep(1);
        waitForElementVisible(driver,objRepo.emgContactsHomePhone);
        inputTextField(driver,objRepo.emgContactsHomePhone,CommonVariables.orangeHRM_EmergencyContact_PhoneNumber);
        sleep(1);
        waitForElementVisible(driver,objRepo.emgContactsSaveButton);
        findButtonClick(objRepo.emgContactsSaveButton);
        Assert.assertTrue(objRepo.verifyRecordAdded.isDisplayed());
        Reporter.log(" 'Adding Emergency Contact' test passed");
    }

    public void addDependents(WebDriver driver)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        Reporter.log("Start adding 'Emergency Contacts'");
        highlightElements(driver,objRepo.dependentsLink);
        findButtonClick(objRepo.dependentsLink);
        sleep(1);
        findButtonClick(objRepo.addDependentsButton);
        sleep(1);
        inputTextField(driver,objRepo.nameForDependentInputField,CommonVariables.orangeHRM_Dependents_name);
        highlightElements(driver,objRepo.relationshipForDependents);
        sleep(1);
        waitForElementVisible(driver,objRepo.relationshipForDependents);
        selectFromDropDownList(objRepo.relationshipForDependents,CommonVariables.orangeHRM_Dependents_relationship);
        waitForElementVisible(driver,objRepo.dateOfBirthInputField);
        inputTextField(driver,objRepo.dateOfBirthInputField,CommonVariables.orangeHRM_Dependents_DateOfBirth);
        waitForElementVisible(driver,objRepo.saveButtonForDependents);
        findButtonClick(objRepo.saveButtonForDependents);
        //Assert.assertTrue(objRepo.verifyDependentsAdded.isDisplayed());
        Reporter.log("A dependent is added successfully");
    }

    public void addImmigrantRecords(WebDriver driver)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        Reporter.log("Start adding 'Immigrant Records'");
        highlightElements(driver,objRepo.immigrationLink);
        findButtonClick(objRepo.immigrationLink);
        sleep(1);
        findButtonClick(objRepo.addImmigrantRecordButton);
        sleep(1);
        Assert.assertTrue(objRepo.passportRadioButton.isDisplayed());
        Assert.assertTrue(objRepo.visaRadioButton.isDisplayed());
        waitForElementVisible(driver,objRepo.visaRadioButton);
        findButtonClick(objRepo.visaRadioButton);
        sleep(1);
        inputTextField(driver,objRepo.numberInputField,CommonVariables.orangeHRM_ImmigrantRecord_Number);
        waitForElementVisible(driver,objRepo.issuedDateInputField);
        inputDate(driver,objRepo.issuedDateInputField,CommonVariables.orangeHRM_ImmigrantRecord_IssuedDate);
        sleep(1);
        inputDate(driver,objRepo.expireDateInputField,CommonVariables.orangeHRM_ImmigrantRecord_ExpireDate);
        sleep(1);
        inputDate(driver, objRepo.eligibleStatusInputField,CommonVariables.orangeHRM_ImmigrantRecord_EligibleStatus);
        sleep(1);
        selectFromDropDownList(objRepo.issuedBySelectList,CommonVariables.orangeHRM_ImmigrantRecord_IssuedBy);
        sleep(1);
        inputDate(driver,objRepo.eligibleReviewDate,CommonVariables.orangeHRM_ImmigrantRecord_EligibleReviewDate);
        sleep(1);
        inputTextField(driver,objRepo.commentForImmigrationRecord,CommonVariables.orangeHRM_ImmigrantRecord_CommentForImmigrationRecord);
        sleep(1);
        findButtonClick(objRepo.saveButtonForImmigrantRecord);
        sleep(1);
        highlightElements(driver,objRepo.recordAdded);
        Assert.assertTrue(objRepo.recordAdded.isDisplayed());
    }

    public void deleteImmigrationRecord(WebDriver driver)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        Reporter.log("Start deleting 'Immigrant Records'");
        highlightElements(driver,objRepo.immigrationLink);
        findButtonClick(objRepo.immigrationLink);
        sleep(1);
        waitForElementVisible(driver,objRepo.immigrationRecord);
        findButtonClick(objRepo.immigrationRecord);
        highlightElements(driver,objRepo.deleteImmigrationRecordButton);
        findButtonClick(objRepo.deleteImmigrationRecordButton);
        Reporter.log("Immigration record got deleted");

    }

}
