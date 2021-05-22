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
        Reporter.log("Start validating all the links on 'PIM Page'");
        //click on pim link
        findButtonClick(objRepo.pimLink);
        validatePage(driver,objRepo.configurationLinkOnPimPage);
        findButtonClick(objRepo.configurationLinkOnPimPage);
        //validating configuration link list
        validatePage(driver,objRepo.optionalFieldsLink);
        validatePage(driver,objRepo.customFieldsLink);
        validatePage(driver, objRepo.dataImportLink);
        validatePage(driver,objRepo.reportingMethodsLink);
        validatePage(driver,objRepo.terminationReasonsLink);
        //validating employee list link
        validatePage(driver,objRepo.employeeListLink);
        validatePage(driver,objRepo.addEmployeeLink);
        validatePage(driver,objRepo.reportsLink);
        Reporter.log("All the links on the pim page are displayed");
    }

    public void addEmployee(WebDriver driver)
    {
        Reporter.log("Start adding an employee on 'PIM Page'");
        findButtonClick(objRepo.pimLink);
        sleep(1);
        //click add employee link
        waitForElementVisible(driver,objRepo.addEmployeeLink);
        highlightElements(driver,objRepo.addEmployeeLink);
        findButtonClick(objRepo.addEmployeeLink);
        //enter employee first name
        waitForElementVisible(driver,objRepo.employeeFirstnameInputField);
        inputTextField(driver,objRepo.employeeFirstnameInputField,CommonVariables.orangeHRM_PIM_EmployeeFirstname);
        sleep(1);
        //enter employee last name
        inputTextField(driver,objRepo.employeeLastname,CommonVariables.orangeHRM_PIM_EmployeeLastname);
        //click save button
        findButtonClick(objRepo.saveEmployeeButton);
        sleep(1);
        highlightElements(driver,objRepo.profilePicHeader);
        Assert.assertTrue(objRepo.profilePicHeader.isDisplayed());
        sleep(1);
        Reporter.log("Employee added successfully");
    }

    public void searchEmployee(WebDriver driver)
    {
        Reporter.log("Start searching an employee on 'PIM Page'");
        //navigate to the pim page
        findButtonClick(objRepo.pimLink);
        sleep(1);
        //enter employee name
        inputTextField(driver,objRepo.employeeNameInputField,CommonVariables.orangeHRM_PIM_EmployeeFirstname+" "+CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        //click on search button
        findButtonClick(objRepo.searchEmployeeButton);
        highlightElements(driver,objRepo.searchNotFound);
        Assert.assertTrue(objRepo.searchNotFound.isDisplayed());
        sleep(1);






    }
}
