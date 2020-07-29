package Tests;

import Common.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.HomePage;
import Pages.DashboardPage;

import java.util.HashMap;
import java.util.Map;


public class LoginTest{
    WebDriver driver;

    @BeforeClass
    public void initial_Setup_Emulator() throws InterruptedException {
        BaseClass baseClass = new BaseClass(driver);
        baseClass.initial_Setup_Emulator("url");
    }

    @AfterClass

    public void Teardown (){
        driver.close();
        driver.quit();
    }

    @Test
    public void login_as_Guide() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        homePage.press_Hamburger_Menu();
        homePage.press_Login_Option();
        Thread.sleep(2000);
        loginPage.set_Credentials("manurex@manu.com", "perrodelmal");
        Thread.sleep(2000);
        dashboardPage.perform_Logout();

    }

    @Test (enabled = false)
    public void login_as_Seeker() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        homePage.press_Hamburger_Menu();
        homePage.press_Login_Option();
        loginPage.set_Credentials("tester@uno.com", "perrodelmal");
        Thread.sleep(2000);
        dashboardPage.perform_Logout();
    }
}
