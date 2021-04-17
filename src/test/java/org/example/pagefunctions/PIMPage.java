package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.commonvariables.CommonVariables;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class PIMPage extends CommonFunctions {
    OrangeHRM_ObjRepo objRepo;

    public PIMPage(WebDriver driver)
    {
        objRepo= PageFactory.initElements(driver,OrangeHRM_ObjRepo.class);
    }

    public void validatePIMPage(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start validating all the links on 'PIM Page'");
        findButtonClick(objRepo.pimLink);
        sleep(1);
        Assert.assertTrue(objRepo.configurationLinkOnPimPage.isDisplayed());
        highlightElements(driver,objRepo.configurationLinkOnPimPage);
        findButtonClick(objRepo.configurationLinkOnPimPage);
        sleep(1);
        Assert.assertTrue(objRepo.optionalFieldsLink.isDisplayed());
        highlightElements(driver,objRepo.optionalFieldsLink);
        Assert.assertTrue(objRepo.customFieldsLink.isDisplayed());
        highlightElements(driver,objRepo.customFieldsLink);
        Assert.assertTrue(objRepo.dataImportLink.isDisplayed());
        highlightElements(driver,objRepo.dataImportLink);
        Assert.assertTrue(objRepo.reportingMethodsLink.isDisplayed());
        highlightElements(driver,objRepo.reportingMethodsLink);
        Assert.assertTrue(objRepo.terminationReasonsLink.isDisplayed());
        highlightElements(driver,objRepo.terminationReasonsLink);
        sleep(1);
        Assert.assertTrue(objRepo.employeeListLink.isDisplayed());
        highlightElements(driver,objRepo.employeeListLink);
        Assert.assertTrue(objRepo.addEmployeeLink.isDisplayed());
        highlightElements(driver,objRepo.addEmployeeLink);
        sleep(1);
        Assert.assertTrue(objRepo.reportsLink.isDisplayed());
        highlightElements(driver,objRepo.reportsLink);
        sleep(1);
    }

    public void addEmployee(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start adding an employee on 'PIM Page'");
        findButtonClick(objRepo.pimLink);
        sleep(1);
        waitForElementVisible(driver,objRepo.addEmployeeLink);
        highlightElements(driver,objRepo.addEmployeeLink);
        findButtonClick(objRepo.addEmployeeLink);
        waitForElementVisible(driver,objRepo.employeeFirstnameInputField);
        inputTextField(driver,objRepo.employeeFirstnameInputField,CommonVariables.orangeHRM_PIM_EmployeeFirstname);
        sleep(1);
        inputTextField(driver,objRepo.employeeLastname,CommonVariables.orangeHRM_PIM_EmployeeLastname);
        findButtonClick(objRepo.saveEmployeeButton);
        sleep(1);
        highlightElements(driver,objRepo.profilePicHeader);
        Assert.assertTrue(objRepo.profilePicHeader.isDisplayed());
        sleep(1);
        Reporter.log("Employee added successfully");
    }

    public void searchEmployee(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start searching an employee on 'PIM Page'");
        findButtonClick(objRepo.pimLink);
        sleep(1);
        inputTextField(driver,objRepo.employeeNameInputField,CommonVariables.orangeHRM_PIM_EmployeeFirstname+" "+CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        findButtonClick(objRepo.searchEmployeeButton);





    }
}
