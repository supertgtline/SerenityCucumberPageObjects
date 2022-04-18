package cucumbersteps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import steps.CarWaleSteps;

public class CarNameandPriceSteps {
    @Before
    public void beforeHook(){
        System.out.println("Before hook");
    }
    @After
    public void afterHook(){
        System.out.println("After hook");
    }
    @Steps
    CarWaleSteps carWaleSteps;
    @And("user find car name and price")
    public void user_find_car_name_and_price() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@And -- user find car name and price: ");    }

    @And("user updates the name and price in a file for each (.*)$")
    public void userUpdatesTheNameAndPriceInAFileForEach(String brandName) {
        carWaleSteps.updateCarPriceInFile(brandName);
    }
}
