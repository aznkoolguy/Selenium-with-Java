package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    WebDriver driver;

    public HomePage(WebDriver driver)
  {
        super(driver);
  }

@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement InkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement InkRegister;



public void clickMyAccount()
  {
    InkMyaccount.click();
  }

public void clickRegister()
  {
    InkRegister.click();
  }
