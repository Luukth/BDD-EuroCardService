package org.example.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class EuroCardServiceStepDefinitions {

    private EuroCardService euroCardService;
    private boolean result;

    @Given("I have a EuroCard Service")
    public void i_have_a_euro_card_service() {
        euroCardService = new EuroCardService();
    }

    @When("I validate a card with number {int}")
    public void i_validate_a_card_with_number(Integer cardNumber) {
        result = euroCardService.validate(cardNumber);
    }

    @Then("the card should be valid")
    public void the_card_should_be_valid() {
        assertThat(result).isTrue();
    }

    @Then("the card should be invalid")
    public void theCardShouldBeInvalid() {
        assertThat(result).isFalse();
    }
}
