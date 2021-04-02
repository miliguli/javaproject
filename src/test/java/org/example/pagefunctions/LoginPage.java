package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.commonvariables.CommonVariables;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends CommonFunctions {
    OrangeHRM_ObjRepo  objRepo;


    public LoginPage(WebDriver driver) {
        objRepo = PageFactory.initElements(driver, OrangeHRM_ObjRepo.class);

    }

    public void successfulLogin(WebDriver driver) {

        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        sleep(1);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        waitForElementVisible(driver,objRepo.username);
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        Assert.assertTrue(!objRepo.username.getText().equals(null));
        waitForElementVisible(driver, objRepo.password);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        Assert.assertTrue(!objRepo.password.getText().equals(null));
        waitForElementVisible(driver,objRepo.loginButton);
        highlightElements(driver,objRepo.loginButton);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        highlightElements(driver,objRepo.loggedInDashboardPage);
        Assert.assertTrue(objRepo.loggedInDashboardPage.isDisplayed());
        Reporter.log("Logged in Successfully");
    }

    public void logout(WebDriver driver)
    {
        Reporter.log("Logging out from the Application");
        waitForElementVisible(driver,objRepo.welcomeLink);
        highlightElements(driver,objRepo.welcomeLink);
        findButtonClick(objRepo.welcomeLink);
        Assert.assertTrue(objRepo.aboutLink.isDisplayed());
        Assert.assertTrue(objRepo.logoutLink.isDisplayed());
        waitForElementVisible(driver,objRepo.logoutLink);
        highlightElements(driver,objRepo.logoutLink);
        findButtonClick(objRepo.logoutLink);
        Assert.assertTrue(objRepo.loginPanel.isDisplayed());
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        sleep(1);
        Reporter.log("Logged out successfully");
    }

    public void resetPassword(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Resetting password");
        waitForElementVisible(driver,objRepo.passwordRestLink);
        highlightElements(driver,objRepo.passwordRestLink);
        findButtonClick(objRepo.passwordRestLink);
        sleep(1);
        highlightElements(driver,objRepo.forgetPasswordHeader);
        Assert.assertTrue(objRepo.forgetPasswordHeader.isDisplayed());
        sleep(1);
        waitForElementVisible(driver, objRepo.authentication_userName);
        inputTextField(driver, objRepo.authentication_userName, CommonVariables.orangeHRM_Username);
        Assert.assertTrue(objRepo.authentication_userName.isDisplayed());
        sleep(1);
        highlightElements(driver,objRepo.resetPasswordButton);
        findButtonClick(objRepo.resetPasswordButton);
        sleep(2);
        Assert.assertTrue(objRepo.restConfirmation.isDisplayed());
    }

    public void invalidPasswordLogin(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Logging using valid username with invalid password ");
        waitForElementVisible(driver, objRepo.username);
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        sleep(1);
        waitForElementVisible(driver, objRepo.password);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_InvalidPassword);
        highlightElements(driver,objRepo.loginButton);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
    }

    public void invalidUsername(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Logging using invalid Username with valid password");
        waitForElementVisible(driver, objRepo.username);
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_InvalidUsername);
        waitForElementVisible(driver, objRepo.password);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        highlightElements(driver,objRepo.loginButton);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
    }

    public void emptyUsername(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Logging with empty username");
        waitForElementVisible(driver, objRepo.password);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        highlightElements(driver,objRepo.loginButton);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
    }

    public void emptyPassword(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Logging with empty password");
        waitForElementVisible(driver, objRepo.username);
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        highlightElements(driver,objRepo.loginButton);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
    }


    public void passwordResettingError(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Requesting new password ");
        waitForElementVisible(driver,objRepo.requestPasswordLink);
        highlightElements(driver,objRepo.requestPasswordLink);
        findButtonClick(objRepo.requestPasswordLink);
        Assert.assertTrue(objRepo.forgetPasswordHeader.isDisplayed());
        highlightElements(driver,objRepo.resetPasswordButton);
        findButtonClick(objRepo.resetPasswordButton);
        sleep(1);
        //Assertion: invisibleElement
    }

    public void passwordResettingErrorWithSpecialCharacter(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Requesting password using special Character");
        waitForElementVisible(driver,objRepo.requestPasswordLink);
        highlightElements(driver,objRepo.requestPasswordLink);
        findButtonClick(objRepo.requestPasswordLink);
        Assert.assertTrue(objRepo.forgetPasswordHeader.isDisplayed());
        waitForElementVisible(driver, objRepo.authentication_userName);
        highlightElements(driver, objRepo.authentication_userName);
        inputTextField(driver, objRepo.authentication_userName, CommonVariables.orangeHRM_SpecialCharacter);
        highlightElements(driver,objRepo.resetPasswordButton);
        findButtonClick(objRepo.resetPasswordButton);
        sleep(1);
        //Assertion: invisibleElement
    }

    public void validateLoginPageText(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Reporter.log("Validating all the Texts and links display on the login page");
        sleep(1);
        highlightElements(driver,objRepo.loginLog);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        sleep(1);
        highlightElements(driver,objRepo.loginInfo);
        Assert.assertTrue(objRepo.loginInfo.isDisplayed());
        sleep(1);
        highlightElements(driver,objRepo.loginPanel);
        Assert.assertTrue(objRepo.loginPanel.isDisplayed());
        sleep(1);
        highlightElements(driver,objRepo.requestPasswordLink);
        Assert.assertTrue(objRepo.requestPasswordLink.isDisplayed());
        sleep(1);
        scrollIntoView(driver,objRepo.loginPageFooter);
        highlightElements(driver,objRepo.loginPageFooter);
        Assert.assertTrue(objRepo.loginPageFooter.isDisplayed());
        sleep(1);

    }






}
