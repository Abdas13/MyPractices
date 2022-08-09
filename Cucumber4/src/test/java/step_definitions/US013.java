package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MainPageBooking;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US013 {


    MainPageBooking mainPageBooking=new MainPageBooking();
    @Given("user enter the homepage")
    public void userEnterTheHomepage() {
        Driver.getDriver().get("https://www.booking.com/");
    }

    @When("user select  stays")
    public void userSelectStays() {
        mainPageBooking.stays.click();
    }

    @And("user selects {string} from the location")
    public void userSelectsFromTheLocation(String location) {

        mainPageBooking.whereAreYouGoing.sendKeys(location);
        mainPageBooking.newYork.click();
    }
    @And("user select checkin {string} and checkout {string} dates")
    public void userSelectCheckinAndCheckoutDates(String checkin, String checkout) {
        Driver.getDriver().findElement(By.xpath("//div[contains(@data-mode,'checkin')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]")).sendKeys(checkin);

    }

//    @And("user select checkin and checkout dates")
//    public void userSelectCheckinAndCheckoutDates() {
//
//        mainPageBooking.getcheckin.click();
//        mainPageBooking.getcheckout.click();
//    }

    @And("user select the number of residents")
    public void userSelectTheNumberOfResidents() {
        mainPageBooking.guestsSelect.click();
     //   mainPageBooking.adultsPlus.click();
        mainPageBooking.childrenPlus.click();
    }


}
