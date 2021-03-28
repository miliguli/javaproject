package org.example.commonfunctions;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class CommonFunctions {

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


    public void findButtonClick(WebElement buttonElement) {

        try {
            buttonElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void waitForElement(WebDriver driver, WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

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
