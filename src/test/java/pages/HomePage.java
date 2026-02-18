package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By inventoryTitle = By.className("title");

    public String getPageTitle() {
        return driver.findElement(inventoryTitle).getText();
    }
}
