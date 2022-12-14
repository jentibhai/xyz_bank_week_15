package com.xyzbank.pages;

import com.aventstack.extentreports.Status;

import com.xyzbank.customlisteners.CustomListeners;
import com.xyzbank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='manager()']")
    WebElement clickOnBankManagerLoginTab;
    public void clickOnBankManagerLoginTab(){
        Reporter.log("clickOnBankManagerLoginTab" + clickOnBankManagerLoginTab.toString());
        clickOnElement(clickOnBankManagerLoginTab);
        CustomListeners.test.log(Status.PASS,"clickOnBankManagerLoginTab");
    }
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click = 'deposit()']")
    WebElement clickOnDeposit;

    public void clickOnDeposit(){
        Reporter.log("clickOnDeposit" + clickOnDeposit.toString());
        clickOnElement(clickOnDeposit);
        CustomListeners.test.log(Status.PASS,"clickOnDeposit");
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterAmount100;

    public void enterAmount100(String amount){
        Reporter.log("enterAmount100" + amount+enterAmount100.toString());
        sendTextToElement(enterAmount100,amount);
        CustomListeners.test.log(Status.PASS,"enterAmount100"+amount);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement clickOnDepositButton;

    public void clickOnDepositButton(){
        Reporter.log("clickOnDepositButton" + clickOnDepositButton.toString());
        clickOnElement(clickOnDepositButton);
        CustomListeners.test.log(Status.PASS,"clickOnDepositButton");
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifyMessageDepositSuccessfully;

    public String verifyMessageDepositSuccessfully(){
        Reporter.log("verifyMessageDepositSuccessfully" + verifyMessageDepositSuccessfully.toString());
        CustomListeners.test.log(Status.PASS,"verifyMessageDepositSuccessfully");
        return getTextFromElement(verifyMessageDepositSuccessfully);

    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement clickOnWithdrawButton;

    public void clickOnWithdrawButton(){
        Reporter.log("clickOnWithdrawButton" + clickOnWithdrawButton.toString());
        clickOnElement(clickOnWithdrawButton);
        CustomListeners.test.log(Status.PASS,"clickOnWithdrawButton");
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterAmount;

    public void enterAmount(String amount){
        Reporter.log("enterAmount" + amount+ enterAmount.toString());
        sendTextToElement(enterAmount,amount);
        CustomListeners.test.log(Status.PASS,"enterAmount" + amount);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement clickOnWithdraw;

    public void clickOnWithdraw(){
        Reporter.log("clickOnWithdraw" + clickOnWithdraw.toString());
        clickOnElement(clickOnWithdraw);
        CustomListeners.test.log(Status.PASS,"clickOnWithdraw");
    }
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifyMessageTransactionSuccessful;

    public String verifyMessageTransactionSuccessful(){

        return getTextFromElement(verifyMessageTransactionSuccessful);
    }
}
