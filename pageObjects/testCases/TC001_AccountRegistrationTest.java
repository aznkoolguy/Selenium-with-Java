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
      HomePage hp=new HomePage();

  }
