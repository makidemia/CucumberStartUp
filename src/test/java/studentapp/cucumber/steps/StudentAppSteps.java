package studentapp.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import studentapp.cucumber.serenity.StudentImpl;

public class StudentAppSteps {

    @Steps
    StudentImpl student;

    @When("^student get request is hit$")
    public void studentGetRequestIsHit() {
        student.provideUrl();
    }


    @Given("^a student app url$")
    public void a_student_app_url()  {
       student.getRequest();
    }

    @Then("response code should return {string} status code")
    public void response_code_should_return_status_code(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
}
