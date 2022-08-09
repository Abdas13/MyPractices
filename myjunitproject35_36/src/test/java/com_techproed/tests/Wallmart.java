package com_techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wallmart {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.walmart.com/");
        driver.navigate().refresh();

        String actualTitle=driver.getTitle();
        String searchedWord="Save";

        if (actualTitle.contains(searchedWord)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        String expectedTitle="Walmart";

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title is matching");
        }else{
            System.out.println("Title is NOT matching");
        }

        String actualURL=driver.getCurrentUrl();
        String expectedURL="walmart.com";

        if (actualURL.contains(expectedURL)){
            System.out.println("URL Test Passed");
        }else{
            System.out.println("URL Test Failed");
        }

//        WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
//        searchBox.sendKeys("Kindle"+ Keys.ENTER);
//        WebElement resultSentence=driver.findElement(By.xpath("//h2[@class='f4 f3-m lh-title ma0 di']"));
//        System.out.println(resultSentence.getText());
        driver.close();








    }
}
