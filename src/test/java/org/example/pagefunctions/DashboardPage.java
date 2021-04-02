package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class DashboardPage extends CommonFunctions {
    OrangeHRM_ObjRepo objRepo;

    public DashboardPage(WebDriver driver) {
        objRepo = PageFactory.initElements(driver, OrangeHRM_ObjRepo.class);
    }

    public void validateDashboardLinks(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Reporter.log("Start validating all the links display on the 'Dashboard Page'");
        waitForElementVisible(driver,objRepo.assignLeaveLink);
        highlightElements(driver,objRepo.assignLeaveLink);
        Assert.assertTrue(objRepo.assignLeaveLink.isDisplayed());
        waitForElementVisible(driver,objRepo.leaveListLink);
        highlightElements(driver,objRepo.leaveListLink);
        Assert.assertTrue(objRepo.leaveListLink.isDisplayed());
        waitForElementVisible(driver,objRepo.timeSheetsLink);
        highlightElements(driver,objRepo.timeSheetsLink);
        Assert.assertTrue(objRepo.timeSheetsLink.isDisplayed());
        waitForElementVisible(driver,objRepo.applyLeaveLink);
        highlightElements(driver,objRepo.applyLeaveLink);
        Assert.assertTrue(objRepo.applyLeaveLink.isDisplayed());
        waitForElementVisible(driver,objRepo.myLeaveLink);
        highlightElements(driver,objRepo.myLeaveLink);
        Assert.assertTrue(objRepo.myLeaveLink.isDisplayed());
        waitForElementVisible(driver,objRepo.myTimesheetLink);
        highlightElements(driver,objRepo.myTimesheetLink);
        Assert.assertTrue(objRepo.myTimesheetLink.isDisplayed());
        sleep(1);
        waitForElementVisible(driver,objRepo.empDistributionCanvas);
        highlightElements(driver,objRepo.empDistributionCanvas);
        Assert.assertTrue(objRepo.empDistributionCanvas.isDisplayed());
        sleep(1);
        waitForElementVisible(driver,objRepo.legendFieldSet);
        highlightElements(driver,objRepo.legendFieldSet);
        Assert.assertTrue(objRepo.legendFieldSet.isDisplayed());
        sleep(1);
        waitForElementVisible(driver,objRepo.pendingLeaveFieldSet);
        highlightElements(driver,objRepo.pendingLeaveFieldSet);
        Assert.assertTrue(objRepo.pendingLeaveFieldSet.isDisplayed());
        sleep(1);
        Reporter.log("All links are displayed on the 'Dashboard Page'");
    }
}
