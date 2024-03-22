package co.com.certifications.banistmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/download.feature",
        glue = "co.com.certifications.banistmo.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class DownloadRunner {
}
