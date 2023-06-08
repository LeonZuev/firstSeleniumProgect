package com.ait.qa24;

import jdk.internal.icu.text.UnicodeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableTest {
    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.navigate().to("https://www.w3schools.com/css/css_table.asp");//with history
        //maximize browser to window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @Test
    public void tableTests() {
        List<WebElement> elements = driver.findElements(By.cssSelector("table"));
        System.out.println(elements.size());
    }


}
