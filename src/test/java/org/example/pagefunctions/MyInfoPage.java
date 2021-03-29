package org.example.pagefunctions;

import org.example.commonfunctions.CommonFunctions;
import org.example.commonvariables.CommonVariables;
import org.example.objectrepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class MyInfoPage extends CommonFunctions {

    OrangeHRM_ObjRepo objRepo;

    public MyInfoPage(WebDriver driver)
    {
        objRepo= PageFactory.initElements(driver,OrangeHRM_ObjRepo.class);
    }

    public void validateMyInfo(WebDriver driver)
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.successfulLogin(driver);
        findButtonClick(objRepo.myInfoLink);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        Assert.assertTrue(objRepo.personDetailsLink.isDisplayed());
        Assert.assertTrue(objRepo.contactDetailsLink.isDisplayed());
        Assert.assertTrue(objRepo.emergencyContactsLink.isDisplayed());
        Assert.assertTrue(objRepo.dependentsLink.isDisplayed());
        Assert.assertTrue(objRepo.immigrationLink.isDisplayed());
        Assert.assertTrue(objRepo.jobLinkinMyInfoPage.isDisplayed());
        Assert.assertTrue(objRepo.taxExemptionsLink.isDisplayed());
        Assert.assertTrue(objRepo.reportToLink.isDisplayed());
        Assert.assertTrue(objRepo.qualificationsLinkInAdminPage.isDisplayed());
        Assert.assertTrue(objRepo.membershipsLink.isDisplayed());
    }

    public void editMyInfoPage(WebDriver driver)
    {
        validateMyInfo(driver);
        findButtonClick(objRepo.editMyInfoButton);
        inputTextField(driver,objRepo.firstNameInputBox, CommonVariables.orangeHRM_MyInfo_EmployeeFirstName);
        inputTextField(driver,objRepo.lastnameInputBox,CommonVariables.orangeHRM_MyInfo_EmployeeLastName);
        inputTextField(driver,objRepo.employeeIdInputBox,CommonVariables.orangeHRM_MyInfo_EmployeeId);
        findButtonClick(objRepo.licenseExpDatePicker);
        //date picker
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementById('personal_txtLicExpDate').value='2023-09-01'");
        findButtonClick(objRepo.genderButtonForFemale);
        //select marital status
        Select selectMaritalStatus=new Select(objRepo.maritalStatusSelector);
        List<WebElement> listOfOptions=selectMaritalStatus.getOptions();
        for (WebElement webElement:listOfOptions)
        {
            System.out.println("marital Status Options:"+webElement.getText());
        }
        selectMaritalStatus.selectByVisibleText("Single");
        sleep(1);
        //select nationalities
        Select selectNationality=new Select(objRepo.nationalitySelector);
        selectNationality.selectByVisibleText("American");
        List<WebElement> nationalitiesOptions=selectNationality.getOptions();
        for (WebElement webElement:nationalitiesOptions)
        {
            System.out.println("nationalities Options:"+webElement.getText());
        }
        findButtonClick(objRepo.myInfoSaveButton);
        sleep(1);
        //Custom fields( blood type )
        findButtonClick(objRepo.customFieldEditButton);
        Select selectBloodType=new Select(objRepo.bloodTypeSelector);
        selectBloodType.selectByVisibleText("O+");
        List<WebElement> listOfBloodOptions=selectBloodType.getOptions();
        for (WebElement element:listOfBloodOptions)
        {
            System.out.println("Blood Options: "+element.getText());
        }
        sleep(1);
    }
}
