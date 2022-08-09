package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.Amazon;
import utilities.Driver;

public class US002 {
    Amazon pages=new Amazon();

    @Given("user enters {string} on browser")
    public void userEntersOnBrowser(String url2) {
        Driver.getDriver().get(url2);

    }

    @Then("user writes {string} at search box")
    public void userWritesAtSearchBox(String kelime) {
        pages.searchBox.sendKeys(kelime, Keys.ENTER);


    }
}
