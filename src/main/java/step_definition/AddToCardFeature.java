package step_definition;

import Utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.EtsyHomePages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class AddToCardFeature {

    EtsyHomePages etsyHomePages=new EtsyHomePages();


    @When("User searchs {string} in the Etsy pages")
    public void userSearchsInTheEtsyPages(String arg0) throws Exception{

        etsyHomePages.searchbox.sendKeys(arg0);
        Thread.sleep(3000);
        etsyHomePages.searchButton.click();
        Thread.sleep(2000);
    }



    @Given("User clicks to the item")
    public void user_clicks_to_the_item() {
       etsyHomePages.selectItem.click();

    }

    @And("User selects the size")
    public void user_selects_the_size() throws Exception {

        etsyHomePages.dropdownMethod();

    }
    @And("User clicks to add to card button")
    public void user_clicks_to_add_to_card_button() throws InterruptedException {
        Thread.sleep(3000);
       etsyHomePages.addToCardMethod();
    }


}
