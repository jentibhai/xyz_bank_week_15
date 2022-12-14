package com.xyzbank.testsuite;

import com.xyzbank.pages.AccountPage;
import com.xyzbank.pages.AddCustomerPage;
import com.xyzbank.pages.CustomerPage;
import com.xyzbank.pages.OpenAccountPage;
import com.xyzbank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerPage customerPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerPage = new CustomerPage();
        accountPage = new AccountPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void BankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        accountPage.clickOnBankManagerLoginTab();
        addCustomerPage.clickOnAddCustomerTab();
        addCustomerPage.sendTextToFirstName("Krish");
        addCustomerPage.sendTextToLastName("Desai");
        addCustomerPage.sendTextToPostCode("WD24 7PA");
        addCustomerPage.clickOnAddCustomer();
    }

    @Test(groups = {"smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        accountPage.clickOnBankManagerLoginTab();
        openAccountPage.clickOnOpenAccountLink();
        openAccountPage.customerNameList();
        openAccountPage.currencyList();
        Thread.sleep(5000);
        openAccountPage.clickOnProcessButton();
    }

    @Test(groups = "regression")
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {

        customerPage.clickCustomerLoginLink();
        customerPage.clickOnYourNameList();
        Thread.sleep(2000);
        customerPage.clickOnLogin();
        customerPage.verifyLogoutButtonDisplayed();
        customerPage.verifyWelcomeMessage();
        Assert.assertEquals(customerPage.verifyWelcomeMessage(),"Welcome Harry Potter !!");
        customerPage.clickOnLogout();
    }
    @Test(groups = "regression")
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        customerPage.clickCustomerLoginLink();
        customerPage.clickOnYourNameList();
        Thread.sleep(10000);
        customerPage.clickOnLogin();
        accountPage.clickOnDeposit();
        accountPage.enterAmount100("1000");
        accountPage.clickOnDepositButton();
        accountPage.verifyMessageDepositSuccessfully();
        Assert.assertEquals(accountPage.verifyMessageDepositSuccessfully(),"Deposit Successful");
    }
    @Test(groups = "regression")
    public void customerShouldWithdrawMoneySuccessful()  {
        customerPage.clickCustomerLoginLink();
        customerPage.clickOnYourNameList();
        customerPage.clickOnLogin();
        accountPage.clickOnDeposit();
        accountPage.enterAmount100("1000");
        accountPage.clickOnDepositButton();
        accountPage.clickOnWithdrawButton();
        accountPage.enterAmount("500");
        accountPage.clickOnWithdraw();

//        accountPage.verifyMessageTransactionSuccessful();
//        Assert.assertEquals(accountPage.verifyMessageTransactionSuccessful(),"Transaction successful");

    }

}
