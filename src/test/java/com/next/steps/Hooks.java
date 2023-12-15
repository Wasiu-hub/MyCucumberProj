package com.next.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class Hooks {

    public WebDriver driver;

    @Before
    public void preAction() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @After
    public void postAction() {
        driver.close();
    }
}
