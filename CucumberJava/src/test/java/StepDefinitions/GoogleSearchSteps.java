package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;


public class GoogleSearchSteps {
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		System.getProperty("webdriver.chrome.driver","C:/Users/CSI/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step - user is on google search page");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("user enters a text in search box");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside step - hits enter");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step - user is navigated to search results");
	}


}
