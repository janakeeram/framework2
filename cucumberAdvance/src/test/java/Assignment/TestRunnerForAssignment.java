package Assignment;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Assignment.feature", glue = {
		"Assignment" }, monochrome = true, tags = "@accenture or @capgemini", plugin = { "pretty", "html:Reports/htmlReportPara/html",
				"json:Reports/JsonReportPara/Cucumber.json", "junit:Reports/JunitReportPara/report.xml" })
public class TestRunnerForAssignment {

}
