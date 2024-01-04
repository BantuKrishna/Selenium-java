package Step_Definitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature Files",glue={"Step_Definitions"},
monochrome = true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
"html:target/HtmlReports/report.html",
"json:target/JsonReports/report.json"},
tags="@SmokeTest"
		)
public class TestRunner {
	  
	
}
