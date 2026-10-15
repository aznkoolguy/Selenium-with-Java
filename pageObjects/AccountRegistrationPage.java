package pageObjects;

import org.openqa.selenium.WebDriver;

public class AccountRegistrationPage extends BasePage{

    public AccountRegistrationPage(WebDriver driver)
  {
        super(driver);
  }


@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement textLasttname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;
