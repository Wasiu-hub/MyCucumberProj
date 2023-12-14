package com.next;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = ".", dryRun = true)
@CucumberOptions(features = ".", dryRun = false, tags = "@Wasiu")
public class NextRunner {
}
