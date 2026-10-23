package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.chromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TC001_AccountRegistrationTest {

    public WebDriver driver;
  
    @BeforeClass
    Public void setup()
  {
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://localhost/opencart/upload/index.php");
        driver.manage().window().maximize();
  }

  @AfterClass
  Public void tearDown()
  {
      driver.quit();
  }
  @Test
  Run | Debug
  public void verify_account_registration()
  {
      HomePage hp=new HomePage(driver);
      hp.clickMyAccount();
      hp.clickRegister();

      AccountRegistrationPage regpage=new AccountRegistrationPage(driver);

      regpage.setFirstName(randomeString().toUpperCase());
      regpage.setLastName(randomeString().toUpperCase());
      regpage.setEmail(randomeString()+"@gmail.com");// randomly generated
      regpage.setTelephone(randomeNumber());

      String password=randomAlphaNumeric();

      regpage.setPassword(password);
      regpage.setConfirmPassword(password);

      regpage.setPrivacyPolicy();
      regpage.clickContinue();

      String confmsg=regpage.getConfirmationMsg();

      Assert.assertEquals(confmsg,"Your Account Has Been Created!");
  }

    public String randomeString()
    {
        String generatedstring=RandomStringUtils.randomAlphabetic(5);
        return generatedstring;
    }

    
