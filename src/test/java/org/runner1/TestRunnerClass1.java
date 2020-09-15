package org.runner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Eclipse\\Cucumber1\\src\\test\\resources\\Features", glue = {
		"org.stepdef1" }, dryRun = false, plugin = {"pretty", "json:D:\\Eclipse\\Cucumber1\\src\\test\\resources\\Reporting\\rep.json"}, tags = { "not @Sanity", "not @Smoke" })
public class TestRunnerClass1 {

}
