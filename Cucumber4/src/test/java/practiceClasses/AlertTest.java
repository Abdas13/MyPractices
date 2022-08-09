package practiceClasses;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class AlertTest {
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://www.tutorialsteacher.com/codeeditor?cid=");

        Thread.sleep(2000);

        WebElement runlink=Driver.getDriver().findElement(By.xpath("//input[@id='btnRun']"));
        runlink.click();

    }
}
