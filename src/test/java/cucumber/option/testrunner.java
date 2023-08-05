package cucumber.option;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature",glue={"stepdefination","helper"},tags="@Reg",
plugin={"pretty","html:target/reports/test3.html","json:target/reports/test4.json"})
public class testrunner {

}
