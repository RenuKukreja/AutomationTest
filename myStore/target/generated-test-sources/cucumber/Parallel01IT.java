import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/soniyajaisinghani/workspace2/myStore/src/test/resources/features/mystore/login.feature:19"},
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm", "rerun:C:/Users/soniyajaisinghani/workspace2/myStore/target/generated-test-sources/cucumber/rerun/1.txt", "json:C:/Users/soniyajaisinghani/workspace2/myStore/target/generated-test-sources/cucumber/json/1.json"},
        monochrome = true,
        glue = {"com.org.steps.myStore"})
public class Parallel01IT {
}
