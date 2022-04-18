package cucumbersteps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.NewCarsPage;
import steps.CarWaleSteps;

import java.util.List;

public class NewCarSteps {
    @Steps
    CarWaleSteps carWaleSteps;
    NewCarsPage newCarsPage;

    @Given("user navigate to the website")
    public void user_navigate_to_the_website() {
        carWaleSteps.navigate();
    }

    @When("user choose menu as new car")
    public void user_choose_menu_as_new_car() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        carWaleSteps.navigateToNewCars();
    }

    @Then("user click on find new cars")
    public void user_click_on_find_new_cars() {
        // Write code here that turns the phrase above into concrete actions
        carWaleSteps.navigateToFindNewCar();
    }

    @And("^user search for (.*) car$")
    public void userSearchForBrandCar(String brandCar) {
        System.out.println("@And -- user search for new cars: " + brandCar);
        newCarsPage.chooseCarBrand(brandCar);

    }

    @And("user validate car (.*)$")
    public void user_validate_car_title(String title) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(carWaleSteps.validateBrandName(title));
    }
}
