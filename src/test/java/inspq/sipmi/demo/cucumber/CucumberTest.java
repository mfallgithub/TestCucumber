package inspq.sipmi.demo.cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "inspq.sipmi.demo.cucumber.stepDefs")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber/cucumber.html, json:target/cucumber/cucumber.json, usage:target/cucumber/usage.jsonx, junit:target/cucumber/junit.xml")
@ConfigurationParameter(key=FEATURES_PROPERTY_NAME, value = "src/test/java/inspq/sipmi/demo/resources/features/inspq/sipmi/demo")
public class CucumberTest {
}
