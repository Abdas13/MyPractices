package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class OpenqaStudentRegistr {
    public OpenqaStudentRegistr(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getMobileNumber() {
        return mobileNumber;
    }

    public WebElement getDateOfBirth() {
        return dateOfBirth;
    }

    public WebElement getSubjects() {
        return subjects;
    }

    public WebElement getUpload() {
        return upload;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getName() {
        return name;
    }

    @FindBy (xpath = "//input[@id='firstName']")
    private WebElement name;

    @FindBy (xpath = "//input[@id='lastName']" )
    private WebElement lastName;

    @FindBy (xpath = "//label[@for='gender-radio-1']")
    private WebElement genderMale;

    @FindBy (xpath = "//label[@for='gender-radio-2']")
    private WebElement genderFemale;

    @FindBy (xpath = "//label[@for='gender-radio-3']")
    private WebElement genderOther;

    @FindBy (id = "userEmail" )
    private WebElement email;

    @FindBy (id="userNumber")
    private WebElement mobileNumber;

    @FindBy (id="dateOfBirthInput")
    private WebElement dateOfBirth;

    @FindBy (className="react-datepicker__month-select")
    public WebElement month;

    @FindBy (className = "react-datepicker__year-select")
    public WebElement year;

    @FindBy (className = "react-datepicker__day react-datepicker__day--021")
    public WebElement day;

    @FindBy (xpath = "//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
    private WebElement subjects;

    @FindBy  (xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement sports;

    @FindBy  (xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement reading;

    @FindBy  (xpath = "//label[@for='hobbies-checkbox-3']")
    private WebElement music;

    @FindBy (xpath = "//input[@id=\"uploadPicture\"]")
    private WebElement upload;

    @FindBy (id="currentAddress")
    private WebElement address;

    @FindBy (xpath = "//div[text()='Select State']")
    private WebElement state;

    @FindBy (xpath = "\"Haryana\"")
    private WebElement selectedState;

    @FindBy (xpath = "//div[text()='Select City']")
    private WebElement city;

//    @FindBy (xpath = "\"Karnal\"")
//    private WebElement selectedCity;

    @FindBy (xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public void setGenderMale(WebElement genderMale) {
        this.genderMale = genderMale;
    }

    public void setGenderFemale(WebElement genderFemale) {
        this.genderFemale = genderFemale;
    }

    public void setGenderOther(WebElement genderOther) {
        this.genderOther = genderOther;
    }

    public void setMobileNumber(WebElement mobileNumber) {
        mobileNumber.click();
    }

    public void setDateOfBirth(WebElement dateOfBirth) {
        dateOfBirth.click();
    }

    public void setSubjects(WebElement subjects) {
        subjects.click();
    }

    public void setSports(WebElement sports) {
        this.sports = sports;
    }

    public void setReading(WebElement reading) {
        this.reading = reading;
    }

    public void setMusic(WebElement music) {
        this.music = music;
    }

    public void setUpload(WebElement upload) {
        upload.click();
    }

    public void setAddress(WebElement address) {
        address.click();
    }

    public void setState(WebElement state) {
        state.click();


    }

    public void setSelectedState(WebElement selectedState) {
        this.selectedState = selectedState;
    }

    public void setCity(WebElement city) {
        city.click();
    }

    public void setSubmitButton(WebElement submitButton) {
        submitButton.click();
    }

    public void setName(WebElement name) {
      name.click();
    }

    public void setLastName(WebElement lastName) {
        lastName.click();
    }

    public void setEmail(WebElement email) {
        email.click();
    }

}
