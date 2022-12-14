package com.xyzbank.pages;

import com.aventstack.extentreports.Status;

import com.xyzbank.customlisteners.CustomListeners;
import com.xyzbank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;



public class AddCustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class = 'btnClass1']")
    WebElement clickOnAddCustomerTab;

    public void clickOnAddCustomerTab(){
        Reporter.log("clickOnAddCustomerTab" + clickOnAddCustomerTab.toString());
        clickOnElement(clickOnAddCustomerTab);
        CustomListeners.test.log(Status.PASS,"clickOnAddCustomerTab");
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement sendTextToFirstName;

    public void sendTextToFirstName(String firstName){
        Reporter.log("sendTextToFirstName" + firstName + sendTextToFirstName.toString());
        sendTextToElement(sendTextToFirstName, firstName);
        CustomListeners.test.log(Status.PASS,"sendTextToFirstName"+firstName);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement sendTextToLastName;

    public void sendTextToLastName(String lastName){
        Reporter.log("sendTextToLastName" +lastName+ sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastName);
        CustomListeners.test.log(Status.PASS,"sendTextToLastName"+lastName);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement sendTextToPostCode;

    public void sendTextToPostCode(String postCode){
        Reporter.log("sendTextToPostCode" +postCode+ sendTextToPostCode.toString());
        sendTextToElement(sendTextToPostCode, postCode);
        CustomListeners.test.log(Status.PASS,"sendTextToPostCode"+postCode);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement clickOnAddCustomer;

    public void clickOnAddCustomer(){
        clickOnElement(clickOnAddCustomer);
        driver.switchTo().alert();
        String text = driver.switchTo().alert().getText();// Getting the text from alert
        System.out.println(text);
        driver.switchTo().alert().accept();
    }
}
