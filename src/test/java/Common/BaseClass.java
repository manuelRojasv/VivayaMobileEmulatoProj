package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.Map;

public class BaseClass {
    WebDriver driver;
    public BaseClass(WebDriver driver){this.driver = driver; }

    @Parameters({"URL"})
    public void initial_Setup_Emulator(String url) throws InterruptedException {
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
}
