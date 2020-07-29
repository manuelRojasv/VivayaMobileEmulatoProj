package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By click_Hamburger = By.cssSelector("img.open");
    By select_Login = By.cssSelector("li.hidden-lg.login > a");

    public HomePage(WebDriver driver){this.driver = driver; }

    public void press_Hamburger_Menu(){
        driver.findElement(click_Hamburger).click();
    }

    public void press_Login_Option(){
        driver.findElement(select_Login).click();
    }
}
