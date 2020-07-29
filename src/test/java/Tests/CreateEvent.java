package Tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import Pages.LoginPage;
import Pages.HomePage;
import Pages.DashboardPage;
import java.util.HashMap;
import java.util.Map;
import Common.BaseClass;

public class CreateEvent {
    WebDriver driver;
    @BeforeClass
    @Parameters({"URL"})
    public void initial_Setup_Emulator(String url) throws InterruptedException {

        /*BaseClass baseClass = new BaseClass(driver);
        baseClass.initial_Setup_Emulator(url);*/

        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "iPhone X");
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(capabilities);
        driver.get(url);
    }

    @Test
    public void create_Single_Event() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);
        Thread.sleep(9000);
        homePage.press_Hamburger_Menu();
        homePage.press_Login_Option();
        Thread.sleep(2000);
        loginPage.set_Credentials("manurex@manu.com", "perrodelmal");


    }


}
