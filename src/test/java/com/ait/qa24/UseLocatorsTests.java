package com.ait.qa24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

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
}
