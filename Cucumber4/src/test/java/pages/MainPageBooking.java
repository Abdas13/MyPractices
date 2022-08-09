package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPageBooking {

    public MainPageBooking(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//span[@class='bui-tab__text'])[1]")
    public WebElement stays;

    @FindBy(id="ss")
    public WebElement whereAreYouGoing;

    @FindBy(xpath = "//span[text()='New York']")
    public WebElement newYork;

    @FindBy (xpath = "//td[@data-date='2022-01-22']")
    public WebElement getcheckin;

    @FindBy (xpath ="//td[@data-date='2022-01-25']" )
    public WebElement getcheckout;

    @FindBy (xpath = "//label[@class='xp__input']")
    public WebElement guestsSelect;


    @FindBy (xpath = "//button[@aria-label='Increase number of Adults']")
    public WebElement adultsPlus;

    @FindBy (xpath = "//button[@aria-label='Increase number of Children']")
    public WebElement childrenPlus;








}
