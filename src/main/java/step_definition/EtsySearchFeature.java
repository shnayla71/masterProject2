package step_definition;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EtsyHomePages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class EtsySearchFeature {

	EtsyHomePages etsyHomePages=new EtsyHomePages();

	@Given("User is on the Etsy home page")
	public void user_is_on_the_Etsy_home_page() {

		Driver.getDriver().get("https://www.etsy.com");
	}


	@When("User searchs {string} in the Etsy page")
	public void userSearchsInTheEtsyPage(String arg0) {
		etsyHomePages.searchbox.sendKeys(arg0);

	}
	@Then("User clicks to search button")
	public void userClicksToSearchButton() {

		etsyHomePages.searchButton.click();
	}



	@Then("User should see {string} in the Etsy title")
	public void userShouldSeeInTheEtsyTitle(String expectedInTitle) throws InterruptedException{
		String actualInTitle= Driver.getDriver().getTitle();
		Thread.sleep(3000);

		Assert.assertTrue(actualInTitle.contains(expectedInTitle));
	}

	@Then("User should see {string} in the Etsy")
	public void userShouldSeeInTheEtsy(String arg0) throws InterruptedException{
		String actualInTitle= Driver.getDriver().getTitle();
		Thread.sleep(3000);

		Assert.assertTrue(actualInTitle.contains(arg0));
	}


}
