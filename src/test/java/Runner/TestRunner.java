package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "/Cucumber-Mini-Project/src/test/java/login.feature", glue = {
		"LoginStepDefinitionsFiles" }, plugin = { "pretty", "html:target/cucumber-reports",
				"json:target/cucumber.json" }, monochrome = true, publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
