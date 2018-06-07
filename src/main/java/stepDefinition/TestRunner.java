package stepDefinition;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue={"Cucumber.Cumber"},
		plugin ={"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

	    @AfterClass
	    public static void setup() {
	        Reporter.loadXMLConfig(new File("D:\\Springworkspace\\Cumber\\Feature\\extent-config.xml"));
	        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.7.0");
		    Reporter.setSystemInfo("Maven", "3.5.2");
		    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	    }
	
}


