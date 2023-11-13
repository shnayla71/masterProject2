package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.EtsyHomePages;

public class TabAccess {

    EtsyHomePages etsyHomePages=new EtsyHomePages();

    @Given("User clicks each tab at the Etsy page")
    public void user_clicks_each_tab_at_the_etsy_page() {

        etsyHomePages.firstTab.click();
    }

    @Then("User navigates to related tab page")
    public void user_navigates_to_related_tab_page() {

        etsyHomePages.secondTab.click();

    }


    }
