package Testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature/RU_Simo12/RU_Simo12_1.feature",
		glue={"StepDefinition"},
		monochrome = true,
		plugin = {"json:target/MyReport/report.json","junit:target/MyReport/report.xml","html:target/MyReport/report.html"}

		)

		
public class TestRunner {

	
}
