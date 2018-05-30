package stepDefinition;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue={"Cucumber.Cumber"},
		plugin = { "pretty", "html:target/cucumber-reports" }
		)
public class TestRunner {

}
