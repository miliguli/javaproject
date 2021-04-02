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
    }

    public void editMyInfoPage(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start editing personal information on 'MyInfo Page'");
        waitForElementVisible(driver,objRepo.myInfoLink);
        highlightElements(driver,objRepo.myInfoLink);
        findButtonClick(objRepo.myInfoLink);
        waitForElementVisible(driver,objRepo.editMyInfoButton);
        highlightElements(driver,objRepo.editMyInfoButton);
        findButtonClick(objRepo.editMyInfoButton);
        waitForElementVisible(driver,objRepo.firstNameInputBox);
        highlightElements(driver,objRepo.firstNameInputBox);
        inputTextField(driver,objRepo.firstNameInputBox, CommonVariables.orangeHRM_MyInfo_EmployeeFirstName);
        waitForElementVisible(driver,objRepo.lastnameInputBox);
        highlightElements(driver,objRepo.lastnameInputBox);
        inputTextField(driver,objRepo.lastnameInputBox,CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        waitForElementVisible(driver,objRepo.employeeIdInputBox);
        highlightElements(driver,objRepo.employeeIdInputBox);
        inputTextField(driver,objRepo.employeeIdInputBox,CommonVariables.orangeHRM_MyInfo_EmployeeId);
        waitForElementVisible(driver,objRepo.licenseExpDatePicker);
        highlightElements(driver,objRepo.licenseExpDatePicker);
        findButtonClick(objRepo.licenseExpDatePicker);
        sleep(1);
        datePicker(driver);
        sleep(1);
        waitForElementVisible(driver,objRepo.genderButtonForFemale);
        findButtonClick(objRepo.genderButtonForFemale);
        Reporter.log("Selecting marital status");
        waitForElementVisible(driver,objRepo.maritalStatusSelector);
        highlightElements(driver,objRepo.maritalStatusSelector);
        selectFromDropDownList(objRepo.maritalStatusSelector,CommonVariables.orangeHRM_MyInfo_MaritalStatus);
        sleep(1);
        Reporter.log("Selecting nationality from dropdown list");
        waitForElementVisible(driver,objRepo.nationalitySelector);
        highlightElements(driver,objRepo.nationalitySelector);
        selectFromDropDownList(objRepo.nationalitySelector,CommonVariables.orangeHRM_MyInfo_Nationality);
        waitForElementVisible(driver,objRepo.myInfoSaveButton);
        highlightElements(driver,objRepo.myInfoSaveButton);
        findButtonClick(objRepo.myInfoSaveButton);
        sleep(1);
        Reporter.log("Start editing 'Custom Fields' on MyInfo Page");
        waitForElementVisible(driver,objRepo.customFieldEditButton);
        highlightElements(driver,objRepo.customFieldEditButton);
        scrollIntoView(driver,objRepo.customFieldEditButton);
        findButtonClick(objRepo.customFieldEditButton);
        highlightElements(driver,objRepo.bloodTypeSelector);
        selectFromDropDownList(objRepo.bloodTypeSelector,CommonVariables.orangeHRM_MyInfo_BloodType);
        sleep(1);
        Reporter.log("Adding file to the personal information page");
        waitForElementVisible(driver,objRepo.addButtonForAddingAttachment);
        highlightElements(driver,objRepo.addButtonForAddingAttachment);
        findButtonClick(objRepo.addButtonForAddingAttachment);
        sleep(1);
        waitForElementVisible(driver,objRepo.addAttachmentForInfoPage);
        highlightElements(driver,objRepo.addAttachmentForInfoPage);
        uploadFile(driver,By.xpath("//*[@id=\'ufile\']"),CommonVariables.orangeHRM_MyInfoFilePath);
        sleep(1);
        waitForElementVisible(driver,objRepo.attachmentCommentField);
        highlightElements(driver,objRepo.attachmentCommentField);
        inputTextField(driver,objRepo.attachmentCommentField,CommonVariables.orangeHRM_MyInfo_AttachmentComment);
        waitForElementVisible(driver,objRepo.uploadAttachmentButton);
        highlightElements(driver,objRepo.uploadAttachmentButton);
        findButtonClick(objRepo.uploadAttachmentButton);
        waitForElementVisible(driver,objRepo.addAttachmentButton);
        highlightElements(driver,objRepo.addAttachmentButton);
        findButtonClick(objRepo.addAttachmentButton);
        sleep(1);
        Assert.assertTrue(objRepo.attachmentListDisplayed.isDisplayed());
}

}
