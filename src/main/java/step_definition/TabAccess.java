package step_definition;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EtsyHomePages;

public class TabAccess {

    EtsyHomePages etsyHomePages=new EtsyHomePages();





    @When("User clicks each tab at the Etsy page")
    public void user_clicks_each_tab_at_the_etsy_page() throws InterruptedException {
        Thread.sleep(2000);
        etsyHomePages.firstTab.click();
    }

    @Then("User navigates to related tab page")
    public void user_navigates_to_related_tab_page() throws InterruptedException {
        Thread.sleep(3000);
        etsyHomePages.secondTab.click();

    }


    }
