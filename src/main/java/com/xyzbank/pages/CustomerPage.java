package com.xyzbank.pages;

import com.aventstack.extentreports.Status;

import com.xyzbank.customlisteners.CustomListeners;
import com.xyzbank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
    WebElement clickCustomerLoginLink;

    public void clickCustomerLoginLink(){
        Reporter.log("clickCustomerLoginLink" + clickCustomerLoginLink.toString());
        clickOnElement(clickCustomerLoginLink);
        CustomListeners.test.log(Status.PASS,"clickCustomerLoginLink");
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement clickOnYourNameList;

    public void clickOnYourNameList(){
        Reporter.log("clickOnYourNameList" + clickOnYourNameList.toString());
        selectByVisibleTextFromDropDown(clickOnYourNameList,"Harry Potter");
        CustomListeners.test.log(Status.PASS,"clickOnYourNameList");
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLogin;

    public void clickOnLogin(){
        Reporter.log("clickOnLogin" + clickOnLogin.toString());
        clickOnElement(clickOnLogin);
        CustomListeners.test.log(Status.PASS,"clickOnLogin");
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement verifyLogoutButtonDisplayed;

    public String verifyLogoutButtonDisplayed(){
        Reporter.log("verifyLogoutButtonDisplayed" + verifyLogoutButtonDisplayed.toString());
        CustomListeners.test.log(Status.PASS,"verifyLogoutButtonDisplayed");
        return getTextFromElement(verifyLogoutButtonDisplayed);
    }
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/strong[1]")
    WebElement verifyWelcomeMessage;

    public String verifyWelcomeMessage(){
        Reporter.log("verifyWelcomeMessage" + verifyWelcomeMessage.toString());
        CustomListeners.test.log(Status.PASS,"verifyWelcomeMessage");
        return getTextFromElement(verifyWelcomeMessage);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement clickOnLogout;

    public void clickOnLogout(){
        Reporter.log("clickOnLogout" + clickOnLogout.toString());
        clickOnElement(clickOnLogout);
        CustomListeners.test.log(Status.PASS,"clickOnLogout");
    }
}
