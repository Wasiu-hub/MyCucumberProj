package com.next;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = ".", dryRun = true)
@CucumberOptions(

//      features = ".",
        features = "src/test/java/com/next/feature/searchWithScenarioOutline.feature",
        dryRun = false,
//      tags = "@SmokeTest",
        plugin = {"pretty", "html:reports.html"})

public class NextRunner {

}
