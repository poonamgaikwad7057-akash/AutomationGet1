package stepDefinitions;

import static org.hamcrest.Matchers.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utils.BaseClass;

public class GetStepDefinitions {

	Response response;
	
	@Given("User sends GET request")
	public void user_sends_get_request() {
		
		BaseClass.setup();
		
		response = BaseClass.request
				.when()
				.get("posts/1");	
	}
	
	@Then("Status code should be 200")
	public void status_code_should_be_200() {
	
		response.then().statusCode(200);
	}
	
	@Then("Response should contain user id")
	public void response_should_contain_title() {
		
		response.then()
				.body("title", 
						equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
	}
	
}
