package com.next.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// contains all search related step definitions
public class Search extends CommonFunctions{

    @Given("I am on the next home page")
    public void i_am_on_the_next_home_page() {

    }

    @When("I enter {string} as a product type in the search box")
    public void i_enter_as_a_product_type_in_the_search_box(String prototype) {
        driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']")).sendKeys(prototype);
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        driver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button/img")).click();
    }

    @Then("I should be able to see {string} as a result title")
    public void i_should_be_able_to_see_as_a_result_title(String resultTitle) {

        String expectedResult = "\"" + resultTitle + "\"";
//        Thread.sleep(200);// needed for safari browser
        String actualResult = driver.findElement(By.xpath("//*[@id=\"plp-results-title-container\"]/div/h1/span")).getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("I enter {string} as a brand in the search box")
    public void i_enter_as_a_brand_in_the_search_box(String brandTitle) {
        driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']")).sendKeys(brandTitle);
    }
}
