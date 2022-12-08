package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", 
glue = "stepDefinitions",
monochrome = true, 
dryRun = false,
tags="@PlaceOrder or @offersPage",
plugin= {"html:target1/cucumber.html","json:target1/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun: target/failed_scenarios"}
)

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
