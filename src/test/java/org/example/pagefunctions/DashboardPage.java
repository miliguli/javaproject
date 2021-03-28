package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage extends CommonFunctions {
    OrangeHRM_ObjRepo objRepo;

    public DashboardPage(WebDriver driver) {
        objRepo = PageFactory.initElements(driver, OrangeHRM_ObjRepo.class);
    }

    public void validateDashboardLinks(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        Assert.assertTrue(objRepo.assignLeaveLink.isDisplayed());
        Assert.assertTrue(objRepo.leaveListLink.isDisplayed());
        Assert.assertTrue(objRepo.timeSheetsLink.isDisplayed());
        Assert.assertTrue(objRepo.applyLeaveLink.isDisplayed());
        Assert.assertTrue(objRepo.myLeaveLink.isDisplayed());
        Assert.assertTrue(objRepo.myTimesheetLink.isDisplayed());
        Assert.assertTrue(objRepo.empDistributionCanvas.isDisplayed());
        Assert.assertTrue(objRepo.legendFieldSet.isDisplayed());
        Assert.assertTrue(objRepo.pendingLeaveFieldSet.isDisplayed());
    }
}
