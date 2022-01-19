package steps;

import pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStep {

    GooglePage google = new GooglePage();

    @Given("I am on the google search page")
    public void iAmOnTheGoogleSearchPage() {
        google.navigateToGoogle();
    }

    @When("I enter a search criteria")
    public void iEnterASearchCriteria() {
    }


    @And("click on the search button")
    public void clickOnTheSearchButton() {
    }


    @Then("the result match the criteria")
    public void theResultMatchTheCriteria() {
    }
}
