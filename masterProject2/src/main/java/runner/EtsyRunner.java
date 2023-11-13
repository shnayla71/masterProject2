package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "json:target/cucumber1.json",
		features = "/Users/aylasahin/IdeaProjects/masterProject2/src/main/resources/features/EtsySearch.feature",
		glue = "step_definition.AddToCardFeature",
		dryRun= false,
		strict = true,
		tags = "@etsyCard"
)

public class EtsyRunner {
}
