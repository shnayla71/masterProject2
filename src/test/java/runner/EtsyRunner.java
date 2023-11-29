package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "json:target/cucumber1.json",
		features = "/Users/aylasahin/IdeaProjects/masterProject2/src/test/resources/features/EtsySearch.feature",
		glue = "step_definition/EtsySearchFeature.java",
		dryRun= false,
		strict = true,
		tags = "@estyAll"
)

public class EtsyRunner {
}
