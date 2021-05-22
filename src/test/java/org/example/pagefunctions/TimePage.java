package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TimePage extends CommonFunctions {

    OrangeHRM_ObjRepo objRepo;

    public TimePage(WebDriver driver)
    {
        objRepo= PageFactory.initElements(driver,OrangeHRM_ObjRepo.class);
    }

    public void validateTimePage(WebDriver driver)
    {
        Reporter.log("Navigate to the time page");
        waitForElementVisible(driver,objRepo.timeLink);
        findButtonClick(objRepo.timeLink);
        //validating timeSheets link list
       validatePage(driver,objRepo.timeSheetsLinkTimePage);
        findButtonClick(objRepo.timeSheetsLinkTimePage);
        validatePage(driver,objRepo.myTimeSheetsLinkTimePage);
        validatePage(driver,objRepo.employeeTimeSheetsLink);
        //validating Attendance link list
        validatePage(driver,objRepo.attendanceLink);
        findButtonClick(objRepo.attendanceLink);
        validatePage(driver,objRepo.myRecordsLink);
        validatePage(driver,objRepo.punchInOutLink);
        validatePage(driver,objRepo.employeeRecordsLink);
        validatePage(driver,objRepo.configurationLinkOnTimePage);
        //validating reports link list
        validatePage(driver,objRepo.reportsLinkTimePage);
        findButtonClick(objRepo.reportsLinkTimePage);
        validatePage(driver,objRepo.projectReportsLink);
        validatePage(driver,objRepo.employeeReportsLink);
        validatePage(driver,objRepo.attendanceSummaryLink);
        //validating project info link list
        validatePage(driver,objRepo.projectInfoLink);
        findButtonClick(objRepo.projectInfoLink);
        validatePage(driver,objRepo.customersLink);
        validatePage(driver,objRepo.projectsLink);
        Reporter.log("All the links on the time page are displayed");
    }
}