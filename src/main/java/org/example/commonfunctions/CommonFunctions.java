package org.example.commonfunctions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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


    public void highlightElements(WebDriver driver, WebElement highlightElement)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid blue;');",
                highlightElement);
    }


    public void scrollIntoView(WebDriver driver, WebElement scrollElement)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrollElement);

    }



    public void selectFromDropDownList(WebElement element, String VisibleText){
        Select select = new Select(element);
        select.selectByVisibleText(VisibleText);
    }


    public void uploadFile(WebDriver driver, By locator, String path){
        driver.findElement(locator).sendKeys(path);
    }

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


    public void waitForElementVisible(WebDriver driver, WebElement element) {
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
