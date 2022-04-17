package cucumbersteps;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CarWaleSteps;

import java.util.List;

public class NewCarSteps {
    @Steps
    CarWaleSteps carWaleSteps;

    @Given("user navigate to the website")
    public void user_navigate_to_the_website() {
        carWaleSteps.navigate();
    }

    @When("user choose menu as new car")
    public void user_choose_menu_as_new_car() {
        // Write code here that turns the phrase above into concrete actions
carWaleSteps.navigateToFindNewCar();
    }

    @Then("user click on find new cars")
    public void user_click_on_find_new_cars(String brandName) {
        // Write code here that turns the phrase above into concrete actions
carWaleSteps.findNewCars(brandName);    }

    @And("^user search for (.*) car$")
    public void userSearchForBrandCar(String brandCar) {
        System.out.println("@And -- user search for new cars: " + brandCar);
    }

    @And("user validate car title")
    public void user_validate_car_title() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@And -- user validate car title");
    }
}
