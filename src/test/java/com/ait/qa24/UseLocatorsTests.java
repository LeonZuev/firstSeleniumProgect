package com.ait.qa24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class UseLocatorsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        //wait for all elements on the site to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementTest() {
        // id (BEST STRATEGY)
        driver.findElement(By.id("city"));

        // classname
        driver.findElement(By.className("navigation-link"));

        // name By.name

        //linkText
        driver.findElement(By.linkText("Search"));

        // partialLinkText
        driver.findElement(By.partialLinkText("Terms"));
    }

    @Test
    public void findElementByCSS() {
        // id -> css(#)
        // driver.findElement(By.id("city"))
        driver.findElement(By.cssSelector("#city"));

        // className -> css(.)
        // driver/finalElement(By.className("navigation-link"))
        driver.findElement(By.cssSelector(".navigation-link"));

        // attribute -> css [attr='value']
        driver.findElement(By.cssSelector("[type='text']"));

        // contains -> *
        driver.findElement(By.cssSelector("[class*='offers']"));

        // start with -> ^
        driver.findElement(By.cssSelector("[class^='special']"));

        // end on -> $
        driver.findElement(By.cssSelector("[class$='container']"));
    }

    @Test
    public  void findElementByXpath() {
        // xpath - //*[@attr='value']

        driver.findElement(By.xpath("//*[@id='city']"));

        driver.findElement(By.xpath("//*[@class='navigation-link']"));

        // text -> //*[contains(.,'text')]
        driver.findElement(By.xpath("//*[contains(.,'Find your car')]"));

    }


}
