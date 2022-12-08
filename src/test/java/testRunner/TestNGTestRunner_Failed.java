package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"@failedscenarios/failed_scenarios"}, 
glue = "stepDefinitions",
monochrome = true, 
dryRun = false,
plugin= {"html:target1/cucumber.html","json:target1/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestNGTestRunner_Failed extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
