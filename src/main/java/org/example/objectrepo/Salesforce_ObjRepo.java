package org.example.objectrepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Salesforce_ObjRepo {

    // All objects or elements should be located and stored in this class , for example:


    @FindBy(xpath = "")
    public WebElement randomElemName;

    @FindBy(css = "")
    public WebElement randomElemName2;

    @FindBy(id = "")
    public WebElement randomElemName3;

    public By randomElemName4 = By.xpath("");

    public By randomElemName5 = By.id("");

}
