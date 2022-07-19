package stepsForBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/backGroundDemo.feature",glue= {"abcd"},
monochrome=true, 
plugin= {"pretty", "html:reports/htmlReport/html", 
"json:reports/JsonReport/Cucumber.json",
"junit:reports/junitReport/report.xml"}
)
public class testRunnerForBackground {

}
