package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.commonvariables.CommonVariables;
import org.example.objectrepo.OrangeHRM_ObjRepo;
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
        Reporter.log("Start validating all the links on 'My Info Page'");
        findButtonClick(objRepo.myInfoLink);
        scrollIntoView(driver, objRepo.personDetailsLink);
        validatePage(driver,objRepo.personDetailsLink);
        validatePage(driver,objRepo.contactDetailsLink);
        validatePage(driver,objRepo.emergencyContactsLink);
        validatePage(driver,objRepo.dependentsLink);
        validatePage(driver,objRepo.immigrationLink);
        validatePage(driver,objRepo.jobLinkinMyInfoPage);
        validatePage(driver,objRepo.salaryLink);
        validatePage(driver,objRepo.taxExemptionsLink);
        validatePage(driver,objRepo.reportToLink);
        validatePage(driver,objRepo.qualificationsLinkInAdminPage);
        validatePage(driver,objRepo.membershipsLink);
        Reporter.log("All the links are displayed on the MyInfo page");
    }

    public void editMyInfoPage(WebDriver driver)
    {
        Reporter.log("Start editing personal information on 'MyInfo Page'");
        //navigating to my info page
        waitForElementVisible(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        //click edit my info button
        waitForElementVisible(driver, objRepo.editMyInfoButton);
        findButtonClick(objRepo.editMyInfoButton);
        //enter first name
        waitForElementVisible(driver, objRepo.firstNameInputBox);
        highlightElements(driver, objRepo.firstNameInputBox);
        inputTextField(driver, objRepo.firstNameInputBox, CommonVariables.orangeHRM_MyInfo_EmployeeFirstName);
        objRepo.middleNameInputBox.clear();
        //enter last name
        waitForElementVisible(driver, objRepo.lastnameInputBox);
        highlightElements(driver, objRepo.lastnameInputBox);
        inputTextField(driver, objRepo.lastnameInputBox, CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        //enter employee id
        waitForElementVisible(driver, objRepo.employeeIdInputBox);
        highlightElements(driver, objRepo.employeeIdInputBox);
        inputTextField(driver, objRepo.employeeIdInputBox, CommonVariables.orangeHRM_MyInfo_EmployeeId);
        waitForElementVisible(driver, objRepo.licenseExpDatePicker);
        findButtonClick(objRepo.licenseExpDatePicker);
        sleep(1);
        //enter date to date picker
        inputTextField(driver,objRepo.datePicker,CommonVariables.orangeHRM_MyInfo_ExpiryDate);
        sleep(1);
        //click female button
        findButtonClick(objRepo.genderButtonForFemale);
        Reporter.log("Selecting marital status");
        //select single from marital status
        waitForElementVisible(driver, objRepo.maritalStatusSelector);
        highlightElements(driver, objRepo.maritalStatusSelector);
        selectFromDropDownList(objRepo.maritalStatusSelector, CommonVariables.orangeHRM_MyInfo_MaritalStatus);
        sleep(1);
        Reporter.log("Selecting nationality from dropdown list");
        waitForElementVisible(driver, objRepo.nationalitySelector);
        highlightElements(driver, objRepo.nationalitySelector);
        selectFromDropDownList(objRepo.nationalitySelector, CommonVariables.orangeHRM_MyInfo_Nationality);
        //click save button
        findButtonClick(objRepo.myInfoSaveButton);
        sleep(1);
        highlightElements(driver,objRepo.infoSavedMessage);
        Assert.assertTrue(objRepo.infoSavedMessage.isDisplayed());
        Reporter.log("'Personal details' got updated");
    }
    public void editCustomField(WebDriver driver)
    {
        //click custom field edit button
        Reporter.log("Start editing 'Custom Fields' on MyInfo Page");
        waitForElementVisible(driver,objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        waitForElementVisible(driver,objRepo.customFieldEditButton);
        scrollIntoView(driver, objRepo.customFieldEditButton);
        highlightElements(driver, objRepo.customFieldEditButton);
        //navigate to custom field
        findButtonClick(objRepo.customFieldEditButton);
        sleep(1);
        //waitForElementVisible(driver, objRepo.cityInputForEditCustom);
        //enter city name
        //inputDate(driver,objRepo.cityInputForEditCustom,CommonVariables.orangeHRM_Contact_City);
        //enter country name
        //inputTextField(driver,objRepo.countryInputField,CommonVariables.orangeHRM_Contact_Country);
        //select gender
        //selectFromDropDownList(objRepo.genderDropdownList,CommonVariables.orangeHRM_MyInfo_GenderType);
        selectFromDropDownList(objRepo.bloodTypeDropdownList,CommonVariables.orangeHRM_MyInfo_BloodType);
        findButtonClick(objRepo.saveButtonForEditCustom);
        Assert.assertTrue(objRepo.savedConfirmMessage.isDisplayed());
        Reporter.log("Adding file to the personal information page");
        sleep(1);
        //click add attachment button
        waitForElementVisible(driver, objRepo.addAttachmentsButton);
        highlightElements(driver, objRepo.addAttachmentsButton);
        findButtonClick(objRepo.addAttachmentsButton);
        sleep(1);
        //uploading file
        waitForElementVisible(driver, objRepo.chooseFileInputField);
        highlightElements(driver, objRepo.chooseFileInputField);
        uploadFile(driver,objRepo.uploadFile,CommonVariables.orangeHRM_MyInfoFilePath);
        sleep(1);
        //leave comment
        waitForElementVisible(driver, objRepo.attachmentCommentField);
        inputTextField(driver, objRepo.attachmentCommentField, CommonVariables.orangeHRM_MyInfo_AttachmentComment);
        waitForElementVisible(driver, objRepo.uploadAttachmentButton);
        highlightElements(driver, objRepo.uploadAttachmentButton);
        //click save button
        findButtonClick(objRepo.uploadAttachmentButton);
        sleep(1);
        highlightElements(driver,objRepo.attachmentListDisplayed);
        Assert.assertTrue(objRepo.attachmentListDisplayed.isDisplayed());
        Reporter.log("'Custom Fields' on MyInfo Page is updated");
    }

    public void editContactDetails(WebDriver driver)
    {
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        //navigate to my info page
        findButtonClick(objRepo.myInfoLink);
        Reporter.log("Start editing 'Contact Details'");
        //click contact details link
        waitForElementVisible(driver, objRepo.contactDetailsLink);
        highlightElements(driver, objRepo.contactDetailsLink);
        sleep(1);
        findButtonClick(objRepo.contactDetailsLink);
        //click edit Contact Details Button
        waitForElementVisible(driver, objRepo.editContactDetailsButton);
        findButtonClick(objRepo.editContactDetailsButton);
        //enter street 1 address
        waitForElementVisible(driver, objRepo.street1InputField);
        highlightElements(driver, objRepo.street1InputField);
        inputTextField(driver, objRepo.street1InputField, CommonVariables.orangeHRM_Contact_Street1);
        sleep(1);
        //enter street 2 address
        waitForElementVisible(driver, objRepo.street2InputField);
        highlightElements(driver, objRepo.street2InputField);
        inputTextField(driver, objRepo.street2InputField, CommonVariables.orangeHRM_Contact_Street2);
        sleep(1);
        //enter city
        waitForElementVisible(driver, objRepo.contactCityInputField);
        highlightElements(driver, objRepo.contactCityInputField);
        inputTextField(driver, objRepo.contactCityInputField, CommonVariables.orangeHRM_Contact_City);
        sleep(1);
        //enter state
        highlightElements(driver, objRepo.contactStateInputField);
        inputTextField(driver, objRepo.contactStateInputField, CommonVariables.orangeHRM_Contact_State);
        sleep(1);
        //enter zip code
        highlightElements(driver, objRepo.contactZipCodeField);
        inputTextField(driver, objRepo.contactZipCodeField, CommonVariables.orangeHRM_Contact_ZipCode);
        sleep(1);
        //select country
        highlightElements(driver, objRepo.contactCountryDropdownList);
        selectFromDropDownList(objRepo.contactCountryDropdownList, CommonVariables.orangeHRM_Contact_Country);
        sleep(1);
        //click save button
        waitForElementVisible(driver, objRepo.contactSaveButton);
        findButtonClick(objRepo.contactSaveButton);
        sleep(1);
        highlightElements(driver,objRepo.contactInfoSavedMessage);
        Assert.assertTrue(objRepo.contactInfoSavedMessage.isDisplayed());
        Reporter.log("Contact details are updated");
    }

    public void addEmergencyContacts(WebDriver driver)
    {
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        Reporter.log("Start editing 'Emergency Contacts'");
        //go to emergency contact
        waitForElementVisible(driver,objRepo.emergencyContactsLink);
        highlightElements(driver,objRepo.emergencyContactsLink);
        findButtonClick(objRepo.emergencyContactsLink);
        //click add emergency contact button
        waitForElementVisible(driver,objRepo.addEmgContactsButton);
        highlightElements(driver,objRepo.addEmgContactsButton);
        findButtonClick(objRepo.addEmgContactsButton);
        sleep(1);
        //enter emergency contact name
        waitForElementVisible(driver,objRepo.emgContactsName);
        inputTextField(driver,objRepo.emgContactsName,CommonVariables.orangeHRM_EmergencyContact_name);
        sleep(1);//enter relationship with emergency contact person
        waitForElementVisible(driver,objRepo.emgContactsRelationship);
        inputTextField(driver,objRepo.emgContactsRelationship,CommonVariables.orangeHRM_EmergencyContact_Relationship);
        sleep(1);
        //enter phone number
        waitForElementVisible(driver,objRepo.emgContactsHomePhone);
        inputTextField(driver,objRepo.emgContactsHomePhone,CommonVariables.orangeHRM_EmergencyContact_PhoneNumber);
        sleep(1);
        //click save button
        waitForElementVisible(driver,objRepo.emgContactsSaveButton);
        findButtonClick(objRepo.emgContactsSaveButton);
        highlightElements(driver,objRepo.verifyRecordAdded);
        Assert.assertTrue(objRepo.verifyRecordAdded.isDisplayed());
        Reporter.log(" 'Adding Emergency Contact' test passed");
    }

    public void addDependents(WebDriver driver)
    {
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        Reporter.log("Start adding 'Emergency Contacts'");
        //click dependents link
        highlightElements(driver,objRepo.dependentsLink);
        findButtonClick(objRepo.dependentsLink);
        sleep(1);
        //add dependents
        findButtonClick(objRepo.addDependentsButton);
        sleep(1);
        //enter dependents name
        inputTextField(driver,objRepo.nameForDependentInputField,CommonVariables.orangeHRM_Dependents_name);
        //slect relationship type
        highlightElements(driver,objRepo.relationshipForDependents);
        sleep(1);
        waitForElementVisible(driver,objRepo.relationshipForDependents);
        selectFromDropDownList(objRepo.relationshipForDependents,CommonVariables.orangeHRM_Dependents_relationship);
        //enter date of birth
        waitForElementVisible(driver,objRepo.dateOfBirthInputField);
        inputTextField(driver,objRepo.dateOfBirthInputField,CommonVariables.orangeHRM_Dependents_DateOfBirth);
        //click save button
        waitForElementVisible(driver,objRepo.saveButtonForDependents);
        findButtonClick(objRepo.saveButtonForDependents);
        highlightElements(driver,objRepo.verifySavedMessage);
        Assert.assertTrue(objRepo.verifySavedMessage.isDisplayed());
        Reporter.log("A dependent is added successfully");
    }

    public void addImmigrantRecords(WebDriver driver)
    {
        Reporter.log("Start editing My information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        Reporter.log("Start adding 'Immigrant Records'");
        //add immigration page
        highlightElements(driver,objRepo.immigrationLink);
        findButtonClick(objRepo.immigrationLink);
        sleep(1);
        //click add immigration button
        findButtonClick(objRepo.addImmigrantRecordButton);
        sleep(1);
        Assert.assertTrue(objRepo.passportRadioButton.isDisplayed());
        Assert.assertTrue(objRepo.visaRadioButton.isDisplayed());
        //click visa radio button
        waitForElementVisible(driver,objRepo.visaRadioButton);
        findButtonClick(objRepo.visaRadioButton);
        sleep(1);
        //enter immigration record number
        inputTextField(driver,objRepo.numberInputField,CommonVariables.orangeHRM_ImmigrantRecord_Number);
        //enter issued date
        waitForElementVisible(driver,objRepo.issuedDateInputField);
        inputDate(driver,objRepo.issuedDateInputField,CommonVariables.orangeHRM_ImmigrantRecord_IssuedDate);
        sleep(1);
        //enter expire date
        inputDate(driver,objRepo.expireDateInputField,CommonVariables.orangeHRM_ImmigrantRecord_ExpireDate);
        sleep(1);
        //enter eligible status
        inputDate(driver, objRepo.eligibleStatusInputField,CommonVariables.orangeHRM_ImmigrantRecord_EligibleStatus);
        sleep(1);
        //select issued by
        selectFromDropDownList(objRepo.issuedBySelectList,CommonVariables.orangeHRM_ImmigrantRecord_IssuedBy);
        sleep(1);
        //enter eligible review date
        inputDate(driver,objRepo.eligibleReviewDate,CommonVariables.orangeHRM_ImmigrantRecord_EligibleReviewDate);
        sleep(1);
        //leave comment for immigration record
        inputTextField(driver,objRepo.commentForImmigrationRecord,CommonVariables.orangeHRM_ImmigrantRecord_CommentForImmigrationRecord);
        sleep(1);
        //click save button
        findButtonClick(objRepo.saveButtonForImmigrantRecord);
        sleep(1);
        highlightElements(driver,objRepo.recordAddedMessage);
        Assert.assertTrue(objRepo.recordAddedMessage.isDisplayed());
        Reporter.log("one immigration record added to the page ");
    }

    public void deleteImmigrationRecord(WebDriver driver)
    {
        Reporter.log("Start editing my information on 'MyInfo Page'");
        waitForElementVisible(driver, objRepo.myInfoLink);
        highlightElements(driver, objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        sleep(1);
        Reporter.log("Start deleting 'Immigrant Records'");
        //click immigration link
        highlightElements(driver,objRepo.immigrationLink);
        findButtonClick(objRepo.immigrationLink);
        sleep(1);
        //click a immigration record
        waitForElementVisible(driver,objRepo.immigrationRecord);
        findButtonClick(objRepo.immigrationRecord);
        //click delete button
        highlightElements(driver,objRepo.deleteImmigrationRecordButton);
        findButtonClick(objRepo.deleteImmigrationRecordButton);
        highlightElements(driver,objRepo.deletedMessage);
        Assert.assertTrue(objRepo.deletedMessage.isDisplayed());
        Reporter.log("Immigration record got deleted");

    }

}
