package cucumber.option;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature",glue={"stepdefination","helper"},tags="@Reg",
plugin={"pretty","html:target/htmlreport/test.html","json:target/jsonReports/test4.json"})
public class testrunner {

}
