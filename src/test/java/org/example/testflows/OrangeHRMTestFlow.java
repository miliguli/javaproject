package org.example.testflows;

import org.example.base.Base;
import org.example.pagefunctions.AdminPage;
import org.example.pagefunctions.DashboardPage;
import org.example.pagefunctions.LoginPage;
import org.example.pagefunctions.MyInfoPage;
import org.testng.annotations.Test;


public class OrangeHRMTestFlow extends Base {

    @Test(enabled = true, priority = 0)
    public void loginTest(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        loginPage.logout(driver);
    }

    @Test(enabled = true,priority = 1)
    public void resetPasswordTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.resetPassword(driver);
    }

    @Test(enabled = true,priority = 2)
    public void invalidPasswordTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.invalidPasswordLogin(driver);
    }

    @Test(enabled = true,priority = 3)
    public void invalidUsernameTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.invalidUsername(driver);
    }

    @Test(enabled = true,priority = 4)
    public void emptyUsernameTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.emptyUsername(driver);
    }

    @Test(enabled = true,priority = 5)
    public void emptyPasswordTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.emptyPassword(driver);
    }

    @Test(enabled = true,priority = 6)
    public void passwordResettingErrorTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.passwordResettingError(driver);
    }

    @Test(enabled = true,priority = 7)
    public void passwordResettingErrorWithSpecialCharacterTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.passwordResettingErrorWithSpecialCharacter(driver);
    }

    @Test(enabled = true,priority = 8)
    public void validateLoginPageTextTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.validateLoginPageText(driver);
    }

    @Test(enabled = true,priority = 9)
    public void validateDashboardPageLinksTest()
    {
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.validateDashboardLinks(driver);
    }

    @Test(enabled = true,priority = 10)
    public void validateMyInfoTest()
    {
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.validateMyInfo(driver);
    }

    @Test(enabled = true,priority = 11)
    public void editMyInfoTest()
    {
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.editMyInfoPage(driver);

    }

    @Test(enabled = true,priority = 12)
    public void validateAdminPageTextTest()
    {
        AdminPage adminPage=new AdminPage(driver);
        adminPage.validateAdminPageText(driver);
    }

    @Test(enabled = true,priority = 13)
    public void addSystemUserTest()
    {
        AdminPage adminPage=new AdminPage(driver);
        adminPage.addSystemUser(driver);
        adminPage.searchSystemUser(driver);
    }

    @Test(enabled = true,priority = 14)
    public void searchSystemUserTest()
    {
        AdminPage adminPage=new AdminPage(driver);
        adminPage.searchSystemUser(driver);
    }




}
