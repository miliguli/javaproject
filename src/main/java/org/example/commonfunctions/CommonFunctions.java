package org.example.commonfunctions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;

public class CommonFunctions {
    //input text field
    public void inputTextField(WebDriver driver, WebElement inputElem, String inputValue) {

        try {
            inputElem.click();
            inputElem.clear();
            inputElem.sendKeys(inputValue);
        } catch (Exception e) {
            e.printStackTrace();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('value','" + inputValue + "')",inputValue );
        }

    }

        //click button
    public void findButtonClick(WebElement buttonElement) {

        try {
            buttonElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //highlight Elements
    public void highlightElements(WebDriver driver, WebElement highlightElement)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid blue;');",
                highlightElement);
    }

    //scroll into view
    public void scrollIntoView(WebDriver driver, WebElement scrollElement)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrollElement);
    }

    //select form doropdown list
    public void selectFromDropDownList(WebElement element, String VisibleText){
        Select select = new Select(element);
        select.selectByVisibleText(VisibleText);
    }

    //upload files
    public void uploadFile(WebDriver driver, By locator, String path){
        driver.findElement(locator).sendKeys(path);
    }

    //input date
    public void inputDate(WebDriver driver, WebElement inputElem, String inputDate) {
        try {
            inputElem.click();
            inputElem.clear();
            inputElem.sendKeys(inputDate);
            inputElem.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('value','" + inputDate + "')",inputDate );
        }
    }

    //validate pages
    public void validatePage(WebDriver driver, WebElement element)
    {
        waitForElementVisible(driver,element);
        highlightElements(driver,element);
        Assert.assertTrue(element.isDisplayed());
        sleep(1);

    }

    //wait elements method
    public void waitForElementVisible(WebDriver driver, WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    //sleep method
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //take screen shoot
    public void takeScreenShot(WebDriver driver,String pathName)
    {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File(pathName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
