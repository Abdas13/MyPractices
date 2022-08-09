package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.OpenqaStudentRegistr;
import utilities.Driver;

public class StudentRegistration extends OpenqaStudentRegistr {
    @Given("user navigates to {string}")
    public void userNavigatesTo(String urlDemoqa) {
        Driver.getDriver().get(urlDemoqa);
    }

    @When("user enters with valid credentials into related boxes  {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}, {string} , {string} , {string}")
    public void userEntersWithValidCredentialsIntoRelatedBoxes(String name, String lastName, String email, String gender, String mobileNumber, String dateOfBirth, String subjects, String hobbies, String picture, String currentAddress, String state, String city) throws InterruptedException {
    getName().sendKeys(name);
    getLastName().sendKeys(lastName);
    getEmail().sendKeys(email);
    getMobileNumber().sendKeys(mobileNumber);
    getAddress().sendKeys(currentAddress);
    getDateOfBirth().click();
//    Select selectYear=new Select(year);
//    Select selectMonth=new Select(month);
//    Select selectDay=new Select(day);
//    selectYear.selectByValue("1978");
//    selectMonth.selectByIndex(4);
//    selectDay.selectByValue("20");



//    Thread.sleep(2000);
//    getDateOfBirth().clear();
//        Thread.sleep(2000);
//    getDateOfBirth().sendKeys(dateOfBirth);
    getSubjects().sendKeys(subjects);
    getState().sendKeys(state);
    getCity().sendKeys(city);


    }





    @And("user clicks the submit button")
    public void userClicksTheSubmitButton() {
    }

    @Then("user asserts the success message")
    public void userAssertsTheSuccessMessage() {
    }


}
