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
        //enter username
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        Assert.assertTrue(!objRepo.username.getText().equals(null));
        waitForElementVisible(driver, objRepo.password);
        //enter password
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        Assert.assertTrue(!objRepo.password.getText().equals(null));
        waitForElementVisible(driver,objRepo.loginButton);
        highlightElements(driver,objRepo.loginButton);
        //click login button
        findButtonClick(objRepo.loginButton);
        sleep(1);
        highlightElements(driver,objRepo.loggedInDashboardPage);
        Assert.assertTrue(objRepo.loggedInDashboardPage.isDisplayed());
        Reporter.log("Logged in Successfully");
    }

    public void logout(WebDriver driver)
    {
        Reporter.log("Start logging out from the Application");
        waitForElementVisible(driver,objRepo.welcomeLink);
        highlightElements(driver,objRepo.welcomeLink);
        findButtonClick(objRepo.welcomeLink);
        Assert.assertTrue(objRepo.aboutLink.isDisplayed());
        Assert.assertTrue(objRepo.logoutLink.isDisplayed());
        waitForElementVisible(driver,objRepo.logoutLink);
        highlightElements(driver,objRepo.logoutLink);
        //click logout button
        findButtonClick(objRepo.logoutLink);
        highlightElements(driver,objRepo.loginPanel);
        Assert.assertTrue(objRepo.loginPanel.isDisplayed());
        highlightElements(driver,objRepo.loginLog);
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
        //reset password
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
        sleep(1);
        highlightElements(driver,objRepo.warningMessage);
        Assert.assertTrue(objRepo.warningMessage.isDisplayed());
        Reporter.log("'resetting password request sent' confirmation message is displayed ");
    }

    public void invalidPasswordLogin(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Logging using valid username with invalid password ");
        //entering username
        waitForElementVisible(driver, objRepo.username);
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        sleep(1);
        //entering password
        waitForElementVisible(driver, objRepo.password);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_InvalidPassword);
        //clicking login button
        highlightElements(driver,objRepo.loginButton);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        highlightElements(driver,objRepo.errorMessage);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
        Reporter.log("cannot login with invalid password");
    }

    public void invalidUsername(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Logging using invalid Username with valid password");
        //enter username
        waitForElementVisible(driver, objRepo.username);
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_InvalidUsername);
        //enter password
        waitForElementVisible(driver, objRepo.password);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        //click login button
        highlightElements(driver,objRepo.loginButton);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        highlightElements(driver,objRepo.errorMessage);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
        Reporter.log("cannot login with invalid username ");
    }

    public void emptyUsername(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Logging with empty username");
        //enter username
        waitForElementVisible(driver, objRepo.password);
        //enter password
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        highlightElements(driver,objRepo.loginButton);
        //click login button
        findButtonClick(objRepo.loginButton);
        sleep(1);
        highlightElements(driver,objRepo.errorMessage);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
        Reporter.log("cannot login with empty username ");
    }

    public void emptyPassword(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Logging with empty password");
        //enter username
        waitForElementVisible(driver, objRepo.username);
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        //click login button
        highlightElements(driver,objRepo.loginButton);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        highlightElements(driver,objRepo.errorMessage);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
        Reporter.log("cannot login with invalid password");
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
        highlightElements(driver,objRepo.warningMessage);
        Assert.assertTrue(objRepo.warningMessage.isDisplayed());
        Reporter.log("cannot find user message is displayed");
    }

    public void passwordResettingErrorWithSpecialCharacter(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Reporter.log("Requesting password using special Character");
        //click request password link
        waitForElementVisible(driver,objRepo.requestPasswordLink);
        highlightElements(driver,objRepo.requestPasswordLink);
        findButtonClick(objRepo.requestPasswordLink);
        Assert.assertTrue(objRepo.forgetPasswordHeader.isDisplayed());
        //enter SpecialCharacter in authentication_userName input field
        waitForElementVisible(driver, objRepo.authentication_userName);
        highlightElements(driver, objRepo.authentication_userName);
        inputTextField(driver, objRepo.authentication_userName, CommonVariables.orangeHRM_SpecialCharacter);
        //click reset password button
        highlightElements(driver,objRepo.resetPasswordButton);
        findButtonClick(objRepo.resetPasswordButton);
        sleep(1);
        highlightElements(driver,objRepo.resetPasswordErrorMessage);
        Assert.assertTrue(objRepo.resetPasswordErrorMessage.isDisplayed());
        Reporter.log("cannot reset password with special characters");

    }

    public void validateLoginPageText(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Reporter.log("Application started");
        Reporter.log("Validating all the Texts and links display on the login page");
        //validate links and text
        validatePage(driver,objRepo.loginLog);
        validatePage(driver,objRepo.loginInfo);
        validatePage(driver, objRepo.loginPanel);
        validatePage(driver, objRepo.requestPasswordLink);
        validatePage(driver,objRepo.loginPageFooter);
        Reporter.log("All the links and text are validated");

    }






}
