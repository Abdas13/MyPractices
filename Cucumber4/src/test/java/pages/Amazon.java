package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon extends BasePage {
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

}
