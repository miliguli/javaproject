package org.example.testflows;

import org.example.base.Base;
import org.example.pagefunctions.*;
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
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.validateDashboardLinks(driver);
    }

    @Test(enabled = true,priority = 10)
    public void validateMyInfoPageTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.validateMyInfo(driver);
    }

    @Test(enabled = true,priority = 11)
    public void editMyPersonalInfoTest()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.editMyInfoPage(driver);
    }
    @Test(enabled = true, priority = 12)
    public void editCustomFieldTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.editCustomField(driver);
    }

    @Test(enabled = true,priority = 13)
    public void editContactDetailsTest()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.editContactDetails(driver);
    }

    @Test(enabled = true,priority = 14)
    public void addEmergencyContactsTest()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.addEmergencyContacts(driver);
    }

    @Test(enabled = true,priority = 15)
    public void addDependentsTest()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.addDependents(driver);
    }

    @Test(enabled = true,priority = 16)
    public void addImmigrantRecordsTest()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.addImmigrantRecords(driver);
    }

    @Test(enabled = true,priority = 17)
    public void deleteImmigrationRecordTest()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin(driver);
        MyInfoPage myInfoPage=new MyInfoPage(driver);
        myInfoPage.deleteImmigrationRecord(driver);
    }

    @Test(enabled = true,priority = 18)
    public void validateAdminPageTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        AdminPage adminPage=new AdminPage(driver);
        adminPage.validateAdminPageText(driver);
    }

    @Test(enabled = true,priority = 19)
    public void addSystemUserTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        AdminPage adminPage=new AdminPage(driver);
        adminPage.addSystemUser(driver);
    }

    @Test(enabled = true,priority = 20)
    public void searchSystemUserTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        AdminPage adminPage=new AdminPage(driver);
        adminPage.searchSystemUser(driver);
    }

    @Test(enabled = true,priority = 21)
    public void searchInvalidUserTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        AdminPage adminPage=new AdminPage(driver);
        adminPage.searchInvalidUser(driver);
    }

    @Test(enabled = true,priority = 22)
    public void addJobTitleTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        AdminPage adminPage=new AdminPage(driver);
        adminPage.addJobTitle(driver);
    }

    @Test(enabled = true,priority = 23)
    public void deleteJobTitleTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        AdminPage adminPage=new AdminPage(driver);
        adminPage.deleteJobTitle(driver);
    }

    @Test(enabled = true,priority = 24)
    public void validatePIMPageTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        PIMPage pimPage=new PIMPage(driver);
        pimPage.validatePIMPage(driver);

    }

    @Test(enabled = true,priority = 25)
    public void addEmployeeTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        PIMPage pimPage=new PIMPage(driver);
        pimPage.addEmployee(driver);
    }

    @Test(enabled = true,priority = 26)
    public void searchEmployeeTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        PIMPage pimPage=new PIMPage(driver);
        pimPage.searchEmployee(driver);
    }

    @Test(enabled = true,priority = 27)
    public void validateLeavePageTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        LeavePage leavePage=new LeavePage(driver);
        leavePage.validateLeavePage(driver);
    }

    @Test(enabled = true,priority = 28)
    public void assignListTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        LeavePage leavePage=new LeavePage(driver);
        leavePage.assignAList(driver);
    }

    @Test(enabled = true,priority = 29)
    public void searchLeaveListTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        LeavePage leavePage=new LeavePage(driver);
        leavePage.searchLeaveList(driver);
    }

    @Test(enabled = true,priority = 30)
    public void validateTimePageTest()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        TimePage timePage=new TimePage(driver);
        timePage.validateTimePage(driver);

    }
    }

