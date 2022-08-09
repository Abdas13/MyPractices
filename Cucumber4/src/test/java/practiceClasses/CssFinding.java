package practiceClasses;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import utilities.Driver;

public class CssFinding {

    @Test
    public void test(){
        //How can you find the color of an element?
        Driver.getDriver().get("https://www.amazon.com");
        WebElement signInElement=Driver.getDriver().findElement(By.xpath("//span[@id='nav-cart-count']"));
        String colorCode=signInElement.getCssValue("color");
        System.out.println(colorCode);
        String colorCodeAsHex= Color.fromString(colorCode).asHex();
        System.out.println(colorCodeAsHex);

    }
}
