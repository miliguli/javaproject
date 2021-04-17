package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.commonvariables.CommonVariables;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LeavePage extends CommonFunctions {

    OrangeHRM_ObjRepo objRepo;

    public LeavePage(WebDriver driver)
    {
        objRepo= PageFactory.initElements(driver,OrangeHRM_ObjRepo.class);
    }

    public void validateLeavePage(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Successfully Logged in ");
        Reporter.log("Navigating to the Leave page");
        waitForElementVisible(driver,objRepo.leaveLink);
        findButtonClick(objRepo.leaveLink);
        sleep(1);
        highlightElements(driver,objRepo.applyLink);
        Assert.assertTrue(objRepo.applyLink.isDisplayed());
        highlightElements(driver,objRepo.myLeaveLinkLeavePage);
        Assert.assertTrue(objRepo.myLeaveLinkLeavePage.isDisplayed());
        highlightElements(driver,objRepo.entitlementsLink);
        Assert.assertTrue(objRepo.entitlementsLink.isDisplayed());
        findButtonClick(objRepo.entitlementsLink);
        sleep(1);
        highlightElements(driver,objRepo.addEntitlementsLink);
        Assert.assertTrue(objRepo.addEntitlementsLink.isDisplayed());
        highlightElements(driver,objRepo.employeeEntitlementsLink);
        Assert.assertTrue(objRepo.employeeEntitlementsLink.isDisplayed());
        highlightElements(driver,objRepo.myEntitlementsLink);
        Assert.assertTrue(objRepo.myEntitlementsLink.isDisplayed());
        highlightElements(driver,objRepo.reportsLinkLeavePage);
        Assert.assertTrue(objRepo.reportsLinkLeavePage.isDisplayed());
        findButtonClick(objRepo.reportsLinkLeavePage);
        sleep(1);
        highlightElements(driver,objRepo.leaveEntitlementReportLink);
        Assert.assertTrue(objRepo.leaveEntitlementReportLink.isDisplayed());
        highlightElements(driver,objRepo.myLeaveEntitlementsReportLink);
        Assert.assertTrue(objRepo.myLeaveEntitlementsReportLink.isDisplayed());
        highlightElements(driver,objRepo.configureLink);
        Assert.assertTrue(objRepo.configureLink.isDisplayed());
        findButtonClick(objRepo.configureLink);
        sleep(1);
        highlightElements(driver,objRepo.menuLeavePeriodLink);
        Assert.assertTrue(objRepo.menuLeavePeriodLink.isDisplayed());
        highlightElements(driver,objRepo.leaveTypeListLink);
        Assert.assertTrue(objRepo.leaveTypeListLink.isDisplayed());
        highlightElements(driver,objRepo.defineWorkWeekLink);
        Assert.assertTrue(objRepo.defineWorkWeekLink.isDisplayed());
        highlightElements(driver,objRepo.viewHolidayListLink);
        Assert.assertTrue(objRepo.viewHolidayListLink.isDisplayed());
        sleep(1);
        highlightElements(driver,objRepo.viewLeaveListLink);
        Assert.assertTrue(objRepo.viewLeaveListLink.isDisplayed());
        highlightElements(driver,objRepo.assignLeaveLinkLeavePage);
        Assert.assertTrue(objRepo.assignLeaveLinkLeavePage.isDisplayed());
        sleep(1);
    }

    public void assignAList(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Successfully Logged in ");
        Reporter.log("Navigating to the Leave page");
        waitForElementVisible(driver,objRepo.leaveLink);
        findButtonClick(objRepo.leaveLink);
        sleep(1);
        Reporter.log("Start assigning a leave list");
        highlightElements(driver,objRepo.assignLeaveLinkLeavePage);
        findButtonClick(objRepo.assignLeaveLinkLeavePage);
        sleep(1);
        highlightElements(driver,objRepo.assignEmployeeNameInput);
        inputTextField(driver,objRepo.assignEmployeeNameInput,CommonVariables.orangeHRM_LeavePage_EmployeeName);
        sleep(1);
        highlightElements(driver,objRepo.assignLeaveTypeList);
        selectFromDropDownList(objRepo.assignLeaveTypeList,CommonVariables.orangeHRM_LeavePage_AssignLeaveType);
        sleep(1);
        highlightElements(driver,objRepo.assignFromDateInput);
        inputDate(driver,objRepo.assignFromDateInput,CommonVariables.orangeHRM_LeavePage_FromDate);
        highlightElements(driver,objRepo.assignToDateInput);
        inputDate(driver, objRepo.assignToDateInput, CommonVariables.orangeHRM_LeavePage_ToDate);
        sleep(1);
        highlightElements(driver,objRepo.partialDaysInput);
        selectFromDropDownList(objRepo.partialDaysInput,CommonVariables.orangeHRM_LeavePage_PartialDays);
        highlightElements(driver,objRepo.durationDropdwonList);
        selectFromDropDownList(objRepo.durationDropdwonList,CommonVariables.orangeHRM_LeavePage_PartialDuration);
        sleep(1);
        highlightElements(driver,objRepo.durationTime);
        selectFromDropDownList(objRepo.durationTime,CommonVariables.orangeHRM_LeavePage_DurationTime);
        sleep(1);
        highlightElements(driver,objRepo.assignLeaveButton);
        findButtonClick(objRepo.assignLeaveButton);
        sleep(1);
        Reporter.log("One leave list assigned to the page");


    }

    public void searchLeaveList(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Successfully Logged in ");
        Reporter.log("Navigating to the Leave page");
        waitForElementVisible(driver,objRepo.leaveLink);
        findButtonClick(objRepo.leaveLink);
        sleep(1);
        Reporter.log("Start searching leave list");
        highlightElements(driver,objRepo.fromDateInput);
        inputDate(driver,objRepo.fromDateInput, CommonVariables.orangeHRM_LeavePage_FromDate);
        highlightElements(driver,objRepo.toDateInput);
        inputDate(driver,objRepo.toDateInput,CommonVariables.orangeHRM_LeavePage_ToDate);
        sleep(1);
        highlightElements(driver,objRepo.withStatusCheckbox);
        findButtonClick(objRepo.withStatusCheckbox);
        sleep(1);
        highlightElements(driver,objRepo.subUnitDropdownList);
        selectFromDropDownList(objRepo.subUnitDropdownList,CommonVariables.orangeHRM_LeavePage_SubUnit);
        sleep(1);
        findButtonClick(objRepo.leaveListSearchButton);
        sleep(1);
        highlightElements(driver,objRepo.leaveListResult);
        Assert.assertTrue(objRepo.leaveListResult.isDisplayed());
        sleep(1);
        Reporter.log("searching result is displayed");








    }
}
