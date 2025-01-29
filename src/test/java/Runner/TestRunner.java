package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = "src/test/java/StepDefinations",
        plugin = "pretty",
        tags = "@Regression",
        dryRun = true
)
public class TestRunner {
}