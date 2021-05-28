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
        Reporter.log("Navigating to the Leave page");
        //click on leave link
        findButtonClick(objRepo.leaveLink);
        validatePage(driver,objRepo.leaveLink);
        validatePage(driver,objRepo.applyLink);
        validatePage(driver,objRepo.myLeaveLinkLeavePage);
        validatePage(driver,objRepo.entitlementsLink);
        //validation entitlements link list
        findButtonClick(objRepo.entitlementsLink);
        validatePage(driver,objRepo.addEntitlementsLink);
        validatePage(driver,objRepo.employeeEntitlementsLink);
        validatePage(driver,objRepo.myEntitlementsLink);
        validatePage(driver,objRepo.reportsLinkLeavePage);
        //validating report link list
        findButtonClick(objRepo.reportsLinkLeavePage);
        validatePage(driver,objRepo.leaveEntitlementReportLink);
        validatePage(driver,objRepo.myLeaveEntitlementsReportLink);
        //validating configure link list
        validatePage(driver,objRepo.configureLink);
        findButtonClick(objRepo.configureLink);
        validatePage(driver,objRepo.menuLeavePeriodLink);
        validatePage(driver,objRepo.leaveTypeListLink);
        validatePage(driver,objRepo.defineWorkWeekLink);
        validatePage(driver,objRepo.viewHolidayListLink);
        validatePage(driver,objRepo.viewLeaveListLink);
        validatePage(driver,objRepo.assignLeaveLinkLeavePage);
        Reporter.log("All the links are displayed on the leave page");
    }

    public void assignAList(WebDriver driver)
    {
        Reporter.log("Navigating to the Leave page");
        waitForElementVisible(driver,objRepo.leaveLink);
        findButtonClick(objRepo.leaveLink);
        sleep(1);
        Reporter.log("Start assigning a leave list");
        highlightElements(driver,objRepo.assignLeaveLinkLeavePage);
        //navigating to assign Leave Page
        findButtonClick(objRepo.assignLeaveLinkLeavePage);
        sleep(1);
        //entering employee name
        highlightElements(driver,objRepo.assignEmployeeNameInput);
        inputTextField(driver,objRepo.assignEmployeeNameInput,CommonVariables.orangeHRM_LeavePage_EmployeeName);
        sleep(1);
        //selecting leave type
        highlightElements(driver,objRepo.assignLeaveTypeList);
        selectFromDropDownList(objRepo.assignLeaveTypeList,CommonVariables.orangeHRM_LeavePage_AssignLeaveType);
        sleep(1);
        //entering assign from date
        highlightElements(driver,objRepo.assignFromDateInput);
        inputDate(driver,objRepo.assignFromDateInput,CommonVariables.orangeHRM_LeavePage_FromDate);
        //entering assign to date
        highlightElements(driver,objRepo.assignToDateInput);
        inputDate(driver, objRepo.assignToDateInput, CommonVariables.orangeHRM_LeavePage_ToDate);
        sleep(1);
        //selecting partial days
        highlightElements(driver,objRepo.partialDaysInput);
        selectFromDropDownList(objRepo.partialDaysInput,CommonVariables.orangeHRM_LeavePage_PartialDays);
        //selecting duration type
        highlightElements(driver,objRepo.durationDropdwonList);
        selectFromDropDownList(objRepo.durationDropdwonList,CommonVariables.orangeHRM_LeavePage_PartialDuration);
        sleep(1);
        //selecting duration time
        highlightElements(driver,objRepo.durationTime);
        selectFromDropDownList(objRepo.durationTime,CommonVariables.orangeHRM_LeavePage_DurationTime);
        sleep(1);
        //saving the leave
        highlightElements(driver,objRepo.assignLeaveButton);
        findButtonClick(objRepo.assignLeaveButton);
        sleep(1);
        findButtonClick(objRepo.okButtonForAssignList);
        Assert.assertTrue(objRepo.confirmedMessage.isDisplayed());
        Reporter.log("One leave list assigned to the page");
    }

    public void searchLeaveList(WebDriver driver)
    {
        Reporter.log("Start navigating to the Leave page");
        waitForElementVisible(driver,objRepo.leaveLink);
        findButtonClick(objRepo.leaveLink);
        sleep(1);
        Reporter.log("Start searching leave list");
        //entering from date
        highlightElements(driver,objRepo.fromDateInput);
        inputDate(driver,objRepo.fromDateInput, CommonVariables.orangeHRM_LeavePage_FromDate);
        //entering to date
        highlightElements(driver,objRepo.toDateInput);
        inputDate(driver,objRepo.toDateInput,CommonVariables.orangeHRM_LeavePage_ToDate);
        sleep(1);
        //click status button
        highlightElements(driver,objRepo.withStatusCheckbox);
        findButtonClick(objRepo.withStatusCheckbox);
        sleep(1);
        //selecting sub unit from dropdown list
        highlightElements(driver,objRepo.subUnitDropdownList);
        selectFromDropDownList(objRepo.subUnitDropdownList,CommonVariables.orangeHRM_LeavePage_SubUnit);
        sleep(1);
        //click search button
        findButtonClick(objRepo.leaveListSearchButton);
        sleep(1);
        highlightElements(driver,objRepo.leaveListResult);
        Assert.assertTrue(objRepo.leaveListResult.isDisplayed());
        sleep(1);
        Reporter.log("searching result is displayed");
    }
}
