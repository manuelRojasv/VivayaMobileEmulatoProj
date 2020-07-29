package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    By select_User_Icon = By.cssSelector("#Layer_1");
    By select_Logout = By.cssSelector("#accountNav > ul > li > ul > li:nth-child(3) > form > button");

    public DashboardPage(WebDriver driver){this.driver = driver; }

    public void perform_Logout(){
       driver.findElement(select_User_Icon).click();
       driver.findElement(select_Logout).click();
    }


}
