package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By set_Email = By.id("loginform-email");
    By set_Pass = By.id("loginform-password");
    By press_Login_Button = By.name("login-button");

    public LoginPage(WebDriver driver){this.driver = driver; }

    public void set_Credentials(String email, String password){
        driver.findElement(set_Email).sendKeys(email);
        driver.findElement(set_Pass).sendKeys(password);
        driver.findElement(press_Login_Button).click();
    }
}
