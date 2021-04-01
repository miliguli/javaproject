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
        sleep(1);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        Assert.assertTrue(!objRepo.username.getText().equals(null));
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        Assert.assertTrue(!objRepo.username.getText().equals(null));
        findButtonClick(objRepo.loginButton);
        sleep(1);
        //driver.switchTo().alert().dismiss();
        Assert.assertTrue(objRepo.loggedInDashboardPage.isDisplayed());
    }

    public void logout(WebDriver driver)
    {
        findButtonClick(objRepo.welcomeLink);
        Assert.assertTrue(objRepo.aboutLink.isDisplayed());
        Assert.assertTrue(objRepo.logoutLink.isDisplayed());
        findButtonClick(objRepo.logoutLink);
        Assert.assertTrue(objRepo.loginPanel.isDisplayed());
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
    }

    public void resetPassword(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        findButtonClick(objRepo.passwordRestLink);
        Assert.assertTrue(objRepo.forgetPasswordHeader.isDisplayed());
        inputTextField(driver, objRepo.authentication_userName, CommonVariables.orangeHRM_Username);
        Assert.assertTrue(objRepo.authentication_userName.isDisplayed());
        findButtonClick(objRepo.resetPasswordButton);
        sleep(2);
        Assert.assertTrue(objRepo.restConfirmation.isDisplayed());
    }

    public void invalidPasswordLogin(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_InvalidPassword);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
    }

    public void invalidUsername(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_InvalidUsername);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
    }

    public void emptyUsername(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
    }

    public void emptyPassword(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        findButtonClick(objRepo.loginButton);
        sleep(1);
        Assert.assertTrue(objRepo.errorMessage.isDisplayed());
    }

    public void passwordResettingError(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        findButtonClick(objRepo.requestPasswordLink);
        Assert.assertTrue(objRepo.forgetPasswordHeader.isDisplayed());
        findButtonClick(objRepo.resetPasswordButton);
        sleep(1);
        //Assertion: invisibleElement
    }

    public void passwordResettingErrorWithSpecialCharacter(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        findButtonClick(objRepo.requestPasswordLink);
        Assert.assertTrue(objRepo.forgetPasswordHeader.isDisplayed());
        inputTextField(driver, objRepo.authentication_userName, CommonVariables.orangeHRM_SpecialCharacter);
        findButtonClick(objRepo.resetPasswordButton);
        sleep(1);
        //Assertion: invisibleElement
    }

    public void validateLoginPageText(WebDriver driver)
    {
        Reporter.log("Initializing Chrome Browser");
        driver.get(CommonVariables.orangeHRM_Url);
        Assert.assertTrue(objRepo.loginLog.isDisplayed());
        Assert.assertTrue(objRepo.loginInfo.isDisplayed());
        Assert.assertTrue(objRepo.loginPanel.isDisplayed());
        Assert.assertTrue(objRepo.requestPasswordLink.isDisplayed());
        Assert.assertTrue(objRepo.loginPageFooter.isDisplayed());

    }






}
