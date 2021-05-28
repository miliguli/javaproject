package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DashboardPage extends CommonFunctions {
    OrangeHRM_ObjRepo objRepo;

    public DashboardPage(WebDriver driver) {
        objRepo = PageFactory.initElements(driver, OrangeHRM_ObjRepo.class);
    }

    public void validateDashboardLinks(WebDriver driver)
    {
        Reporter.log("Start validating all the links display on the 'Dashboard Page'");
        validatePage(driver,objRepo.assignLeaveLink);
        validatePage(driver,objRepo.leaveListLink);
        validatePage(driver,objRepo.timeSheetsLink);
        validatePage(driver,objRepo.applyLeaveLink);
        validatePage(driver,objRepo.myLeaveLink);
        validatePage(driver,objRepo.myTimesheetLink);
        validatePage(driver,objRepo.empDistributionCanvas);
        validatePage(driver,objRepo.legendFieldSet);
        validatePage(driver,objRepo.pendingLeaveFieldSet);
        Reporter.log("All links are displayed on the 'Dashboard Page'");
    }
}
