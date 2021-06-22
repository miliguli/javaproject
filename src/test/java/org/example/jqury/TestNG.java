package org.example.jqury;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestNG {
    WebDriver driver;

    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);


    }
    @Test(enabled = true, priority =0)
    public void draggableTest()
    {
        driver.get("https://jqueryui.com/draggable/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement draggablePage = driver.findElement(By.tagName("iframe"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid blue;');",
                draggablePage);
        waitForElement(driver, draggablePage);
        driver.switchTo().frame(draggablePage);
        sleep(1);
        WebElement draggableObject = driver.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));
        js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid blue;');",
                draggableObject);
        //Actions actions = new Actions(driver);
        Point beforeDrag = draggableObject.getLocation();
        int beforeDragToX = beforeDrag.getX();
        Actions actions=new Actions(driver);
        actions.clickAndHold(draggableObject).moveByOffset(100, 0).release();
        actions.build().perform();
        Point afterLocation = draggableObject.getLocation();
        int afterDragToX = afterLocation.getX();
        Assert.assertTrue(afterDragToX>beforeDragToX);
        //Reporter.log(String.format("Test, passed, object has dragged to another location"));
        sleep(2);
    }
    @Test(enabled = true, priority = 1)
    public void droppableTest()
    {
        driver.get("https://jqueryui.com/droppable/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement droppablePage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(droppablePage);
        WebElement draggable = driver.findElement(By.id("draggable"));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid blue;');",
                draggable);
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(draggable, droppable).build().perform();
        WebElement confirmationMessage = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
        Assert.assertTrue(confirmationMessage.isDisplayed());
        sleep(2);
    }

    @Test(enabled = true, priority =3)
    public void resizableTest()
    {
        driver.get("https://jqueryui.com/resizable/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement resizablePage = driver.findElement(By.tagName("iframe"));
        waitForElement(driver, resizablePage);
        driver.switchTo().frame(resizablePage);
        WebElement resizableElement = driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
        Point beforeResize = resizableElement.getLocation();
        int beforeResizeY = beforeResize.getY();
        System.out.println(beforeResize.x);
        Actions actionsResize = new Actions(driver);
        actionsResize.clickAndHold(resizableElement).moveByOffset(50, 30).release().build().perform();
        Point afterResize = resizableElement.getLocation();
        int afterResizeY = afterResize.getY();
        Assert.assertTrue(afterResizeY>beforeResizeY);
        sleep(2);
    }

    @Test(enabled = true, priority =4)
    public void selectableTest()
    {
        driver.get("https://jqueryui.com/selectable/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement selectablePage = driver.findElement(By.tagName("iframe"));
        waitForElement(driver, selectablePage);
        driver.switchTo().frame(selectablePage);
        WebElement item1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
        waitForElement(driver, item1);
        item1.click();
        WebElement item1Selected = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
        Assert.assertTrue(item1Selected.isDisplayed());
        sleep(1);
        //select multiple items
        WebElement item2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
        WebElement item3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
        waitForElement(driver, item3);
        Actions actions=new Actions(driver);
        actions.dragAndDrop(item2, item3).release();
        actions.build().perform();
        WebElement item2Selected = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
        WebElement item3Selected = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
        Assert.assertTrue(item2Selected.isDisplayed());
        Assert.assertTrue(item3Selected.isDisplayed());
        sleep(2);
    }

    @Test(enabled = true, priority =5)
    public void sortableTest()
    {
        driver.get("https://jqueryui.com/sortable/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement sortablePage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(sortablePage);
        WebElement sortableItem1 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
        Point beforeSort = sortableItem1.getLocation();
        int beforeSortToY = beforeSort.getY();
        WebElement sortableItem2 = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[2]"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(sortableItem1).moveToElement(sortableItem2, 0, 50).release();
        actions.build().perform();
        Point afterSort = sortableItem1.getLocation();
        int afterSortToY = afterSort.getY();
        Assert.assertTrue(afterSortToY > beforeSortToY);
        sleep(2);
    }

    @Test(enabled = true, priority =6)
    public void accordionTest()
    {
        driver.get("https://jqueryui.com/accordion/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement accordionPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(accordionPage);
        WebElement section4 = driver.findElement(By.cssSelector("#ui-id-7"));
        waitForElement(driver, section4);
        Actions actions=new Actions(driver);
        actions.moveToElement(section4).release();
        actions.build().perform();
        sleep(1);
        section4.click();
        WebElement content = driver.findElement(By.xpath("//*[@id=\"ui-id-8\"]"));
        Assert.assertTrue(content.isDisplayed());
        sleep(2);
    }

    @Test(enabled = true, priority =7)
    public void autocompleteTest()
    {
        driver.get("https://jqueryui.com/autocomplete/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement autocompletePage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(autocompletePage);
        WebElement tagBox = driver.findElement(By.xpath("//*[@id=\"tags\"]"));
        tagBox.sendKeys("b");
        sleep(2);
        WebElement option = driver.findElement(By.xpath("//ul/li/div[text()='BASIC']"));
        option.click();
        WebElement confirmation = driver.findElement(By.xpath("//*[@id=\"tags\"]"));
        Assert.assertTrue(confirmation.isDisplayed());
        sleep(1);
    }

    @Test(enabled = true, priority =8)
    public void buttonTest()
    {
        driver.get("https://jqueryui.com/button/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement buttonPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(buttonPage);
        WebElement widgetButton = driver.findElement(By.xpath("/html/body/div/button"));
        waitForElement(driver, widgetButton);
        widgetButton.click();
        sleep(1);
        WebElement submitButton = driver.findElement(By.cssSelector("body > div > input"));
        waitForElement(driver, submitButton);
        submitButton.click();
        sleep(1);
        WebElement widgetAnchor = driver.findElement(By.linkText("An anchor"));
        waitForElement(driver, widgetAnchor);
        widgetAnchor.click();
        sleep(1);
        WebElement cssButton = driver.findElement(By.xpath("/html/body/button"));
        waitForElement(driver, cssButton);
        cssButton.click();
        sleep(1);
        WebElement cssSubmit = driver.findElement(By.cssSelector("body > input"));
        waitForElement(driver, cssSubmit);
        cssSubmit.click();
        sleep(1);
        WebElement cssAnchor = driver.findElement(By.cssSelector("body > a"));
        waitForElement(driver, cssAnchor);
        cssAnchor.click();
        Assert.assertTrue(cssAnchor.isDisplayed());
        sleep(2);
    }

    @Test(enabled = true, priority =9)
    public void radioButtonTest()
    {
        driver.get("https://jqueryui.com/checkboxradio/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement radioButtonPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(radioButtonPage);
        WebElement newYorkButton = driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]/span[1]"));
        waitForElement(driver, newYorkButton);
        newYorkButton.click();
        WebElement ratingButton = driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]/span[1]"));
        waitForElement(driver, ratingButton);
        ratingButton.click();
        WebElement bedType = driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[3]/span[1]"));
        waitForElement(driver, bedType);
        bedType.click();
        WebElement newYorkButtonChecked = driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]"));
        WebElement ratingChecked = driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]"));
        WebElement bedTypeChecked = driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[3]"));
        Assert.assertTrue(newYorkButtonChecked.isDisplayed());
        sleep(1);
    }

    @Test(enabled = true, priority =10)
    public void controlGroupTest()
    {
        driver.get("https://jqueryui.com/controlgroup/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");
        WebElement controlGroupPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(controlGroupPage);
        WebElement compactCar = driver.findElement(By.xpath("//*[@id=\"car-type-button\"]/span[1]"));
        waitForElement(driver, compactCar);
        compactCar.click();
        sleep(1);
        WebElement suv = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]"));
        waitForElement(driver, suv);
        suv.click();
        sleep(1);
        WebElement standard = driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[1]/span[1]"));
        standard.click();
        WebElement insurance = driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[3]/span[1]"));
        insurance.click();
        sleep(1);
        WebElement numbersOfCars = driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/span[2]/a[1]/span[1]"));
        numbersOfCars.click();
        sleep(1);
        WebElement bookButton = driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/button"));
        bookButton.click();
        WebElement suvSelected = driver.findElement(By.xpath("//*[@id=\"car-type-button\"]/span[2]"));
        WebElement standardChecked = driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[1]"));
        WebElement insuranceChecked = driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[3]"));
        WebElement numbersOfCarsChecked = driver.findElement(By.xpath("//*[@id=\"horizontal-spinner\"]"));
        Assert.assertTrue(suvSelected.isDisplayed());
        Assert.assertTrue(standardChecked.isDisplayed());
        Assert.assertTrue(insuranceChecked.isDisplayed());
        Assert.assertTrue(numbersOfCarsChecked.isDisplayed());
        sleep(1);
    }

    @Test(enabled = true, priority =11)
    public void datPickerTest()
    {
        driver.get("https://jqueryui.com/datepicker/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement datePickerPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(datePickerPage);
        WebElement dataBox = driver.findElement(By.id("datepicker"));
        dataBox.click();
        WebElement prevMonthButton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span"));
        prevMonthButton.click();
        WebElement day10 = driver.findElement(By.linkText("10"));
        day10.click();
        WebElement monthSelected = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]"));
        Assert.assertTrue(monthSelected.isDisplayed());
        sleep(1);
    }

    @Test(enabled = true, priority =12)
    public void dialogTest()
    {
        driver.get("https://jqueryui.com/dialog/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement dialogPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(dialogPage);
        WebElement dialogObject = driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(dialogObject, 110, 110);
        WebElement resize = driver.findElement(By.xpath("/html/body/div/div[8]"));
        actions.clickAndHold(resize).moveByOffset(-200, -200).release();
        actions.build().perform();
        WebElement closeDialog = driver.findElement(By.xpath("/html/body/div/div[1]/button/span[1]"));
        closeDialog.click();
        WebElement contentClosed = driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]"));
        Assert.assertTrue(!contentClosed.isDisplayed());
        sleep(1);
    }

    @Test(enabled = true, priority =13)
    public void menuTest()
    {
        driver.get("https://jqueryui.com/menu/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement menuPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(menuPage);
        WebElement musicList = driver.findElement(By.id("ui-id-9"));
        Actions actions=new Actions(driver);
        actions.moveToElement(musicList).build().perform();
        sleep(2);
        WebElement rock = driver.findElement(By.xpath("//ul/li/div[text()='Rock']"));
        actions.moveToElement(rock).build().perform();
        sleep(2);
        WebElement alternative = driver.findElement(By.xpath("//ul/li/div[text()='Alternative']"));
        alternative.click();
        sleep(1);
    }

    @Test(enabled = true, priority =14)
    public void selectMenuTest()
    {
        driver.get("https://jqueryui.com/selectmenu/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement selectMenuPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(selectMenuPage);
        WebElement speedButton = driver.findElement(By.xpath("//*[@id=\"speed-button\"]/span[1]"));
        speedButton.click();
        WebElement fast = driver.findElement(By.xpath("//ul/li/div[text()='Fast']"));
        fast.click();
        sleep(2);
        WebElement fileButton = driver.findElement(By.xpath("//*[@id=\"files-button\"]/span[1]"));
        fileButton.click();
        WebElement jquryUI = driver.findElement(By.xpath("//ul/li/div[text()='ui.jQuery.js']"));
        jquryUI.click();
        WebElement numberButton = driver.findElement(By.xpath("//*[@id=\"number-button\"]/span[1]"));
        numberButton.click();
        WebElement number5 = driver.findElement(By.xpath("//ul/li/div[text()='5']"));
        number5.click();
        sleep(2);
        WebElement titleButton = driver.findElement(By.xpath("//*[@id=\"salutation-button\"]/span[1]"));
        titleButton.click();
        WebElement title = driver.findElement(By.xpath("//ul/li/div[text()='Mr.']"));
        title.click();
        WebElement titleSelected = driver.findElement(By.xpath("//*[@id=\"salutation-button\"]/span[2]"));
        Assert.assertTrue(titleSelected.isDisplayed());
        sleep(1);
    }

    @Test(enabled = true, priority =15)
    public void sliderTest()
    {
        driver.get("https://jqueryui.com/slider/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement sliderPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(sliderPage);
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        Point beforeSlideLocation = slider.getLocation();
        int beforeSlideX = beforeSlideLocation.getX();
        Actions actions=new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(200, 0).moveByOffset(200, 0).release().build().perform();
        Point afterSlideLocation = slider.getLocation();
        int afterSlideX = afterSlideLocation.getX();
        Assert.assertTrue(afterSlideX > beforeSlideX);
        sleep(1);
    }

    @Test(enabled = true, priority =16)
    public void tabsTest()
    {
        driver.get("https://jqueryui.com/tabs/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        WebElement tabsPage = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(tabsPage);
        WebElement tab2 = driver.findElement(By.linkText("Proin dolor"));
        tab2.click();
        sleep(1);
        WebElement tab3 = driver.findElement(By.linkText("Aenean lacinia"));
        tab3.click();
        sleep(1);
        WebElement tab1 = driver.findElement(By.linkText("Nunc tincidunt"));
        tab1.click();
        sleep(1);
        WebElement tab1Clicked = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/p"));
        Assert.assertTrue(tab1Clicked.isDisplayed());
        sleep(1);
    }


    @AfterClass
    public void teardown()
    {
        driver.close();
        driver.quit();
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
}
