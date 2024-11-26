package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility extends BaseTest {
    // method for mouse hover on menu
    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void  mouseHoverToElement(By by){
        Actions actions = new Actions(driver);
    }


    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }


    // Method to select a product filter by name
    public void selectSortByFilter(By by,String text) {
        WebElement sortByDropdown = driver.findElement(by); // locate the dropdown
        sortByDropdown.click(); // open the sortByDropdown

        // Find the filter option by the text and click on it
        WebElement filterOption = driver.findElement(By.xpath("//option[text()='" + text + "']"));
        filterOption.click();
}


    public void sendTextToElement (By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public void  verifyText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

}
