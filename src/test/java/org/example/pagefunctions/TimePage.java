package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TimePage extends CommonFunctions {

    OrangeHRM_ObjRepo objRepo;

    public TimePage(WebDriver driver)
    {
        objRepo= PageFactory.initElements(driver,OrangeHRM_ObjRepo.class);
    }

    public void validateTimePage(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        waitForElementVisible(driver,objRepo.timeLink);
        findButtonClick(objRepo.timeLink);
        highlightElements(driver,objRepo.timeSheetsLinkTimePage);
        findButtonClick(objRepo.timeSheetsLinkTimePage);
        sleep(1);
        highlightElements(driver,objRepo.myTimeSheetsLinkTimePage);
        highlightElements(driver,objRepo.employeeTimeSheetsLink);
        waitForElementVisible(driver,objRepo.attendanceLink);
        highlightElements(driver,objRepo.attendanceLink);
        findButtonClick(objRepo.attendanceLink);
        sleep(1);
        highlightElements(driver,objRepo.myRecordsLink);
        highlightElements(driver,objRepo.punchInOutLink);
        highlightElements(driver,objRepo.employeeRecordsLink);
        highlightElements(driver,objRepo.configurationLinkOnTimePage);
        highlightElements(driver,objRepo.reportsLinkTimePage);
        findButtonClick(objRepo.reportsLinkTimePage);
        sleep(1);
        highlightElements(driver,objRepo.projectReportsLink);
        highlightElements(driver,objRepo.employeeReportsLink);
        highlightElements(driver,objRepo.attendanceSummaryLink);
        highlightElements(driver,objRepo.projectInfoLink);
        findButtonClick(objRepo.projectInfoLink);
        sleep(1);
        highlightElements(driver,objRepo.customersLink);
        highlightElements(driver,objRepo.projectsLink);
        sleep(1);



    }
}
