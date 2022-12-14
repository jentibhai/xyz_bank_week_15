package com.xyzbank.pages;

import com.aventstack.extentreports.Status;

import com.xyzbank.customlisteners.CustomListeners;
import com.xyzbank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click ='openAccount()']")
    WebElement clickOnOpenAccountLink;

    public void clickOnOpenAccountLink() {
        Reporter.log("clickOnOpenAccountLink" + clickOnOpenAccountLink.toString());
        clickOnElement(clickOnOpenAccountLink);
        CustomListeners.test.log(Status.PASS,"clickOnOpenAccountLink");
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement clickCustomerNameList;

    public void customerNameList() {
        Reporter.log("customerNameList" + clickCustomerNameList.toString());
        selectByVisibleTextFromDropDown(clickCustomerNameList,"Harry Potter");
        CustomListeners.test.log(Status.PASS,"customerNameList");

    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement clickOnCurrency;

    public void currencyList() {
        Reporter.log("currencyList" + clickOnCurrency.toString());
        selectByVisibleTextFromDropDown(clickOnCurrency,"Pound");
        CustomListeners.test.log(Status.PASS,"currencyList");
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcessButton;

    public void clickOnProcessButton() {
        clickOnElement(clickOnProcessButton);
        driver.switchTo().alert();
        String text = driver.switchTo().alert().getText();// Getting the text from alert
        System.out.println(text);
        driver.switchTo().alert().accept();
    }
        }
