package inspq.sipmi.demo.cucumber.stepDefs;

import inspq.sipmi.demo.cucumber.CucumberSpringConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.ResponseEntity;

@CucumberContextConfiguration
public class DemoSteps extends CucumberSpringConfiguration {
    private String username;
    private ResponseEntity response;

    @Given("client wants to write username")
    public void clientWantsToWriteGreeting() {
        username = "user001";
    }

    @When("client calls greeting endpoint")
    public void clientCallsToGreetingEndpoint() {
        response = testRestTemplate.getForEntity("/greeting/" + username, String.class);
    }

    @Then("client receives hello text and username")
    public void clientReceivesHelloTextAndGreeting() {
        Assertions.assertEquals("Hello " + username, response.getBody());
    }

}
