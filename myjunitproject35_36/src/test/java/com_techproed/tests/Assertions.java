package com_techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assertions {

        //1. https://bestbuy.com/
        //2. Page URL is https://bestbuy.com/   assert
        //3. titleTest not contains Rest
        //4. logoTest  BestBuy Logo disabled
        //5. FrancaisLinkTest disabled
        static WebDriver driver;
        @BeforeClass
        public static void setup(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://bestbuy.com/");
        }
        @Test
        public void urlTest() {
            String expextedURL = "https://www.bestbuy.com/";
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals("Failed", expextedURL, actualURL);
        }
        @Test
        public void titleTest(){
            String word1="Rest";
            String actualTitle= driver.getTitle();
            System.out.println(actualTitle.toString());
            Assert.assertFalse("Rest is included",actualTitle.contains(word1));
        }
        @Test
        public void logoTest(){
            WebElement logo= driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
            Assert.assertTrue("logo is not seen", logo.isDisplayed());
        }
        @Test
        public void frenchTest(){
            WebElement frenchLink= driver.findElement(By.xpath("//button[text()='Français']"));
            Assert.assertTrue("French link is not disabled", frenchLink.isDisplayed());
        }



        @Ignore
        public static void tearDown(){
            driver.close();
        }


}
