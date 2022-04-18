package steps;



import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.NewCarsPage;

public class CarWaleSteps {
	
	
	HomePage home;
	NewCarsPage newCar;
	
	
	@Step("Navigating to website HomePage")
	public CarWaleSteps navigate() {
		
		home.open();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return this;
		
	}
	
	@Step("Navigate to New Car menu")
	public void navigateToNewCars() throws InterruptedException {
		
		home.navigateToNewCars();
	}
	
	
	@Step("Navigate to Find New Car menu")
	public void navigateToFindNewCar() {
		
		home.navigateTofindNewCars();
	}
	
	
	
	@Step("Finding Car Brand")
	public void findNewCars(String brandName) {
		
		newCar.chooseCarBrand(brandName);
		//Assert.assertTrue(home.getCarPageHeading().contains(brandName));
		
	}
	
	@Step("Validating brand name")
	public boolean validateBrandName(String title) {
		
		return home.getCarPageHeading().contains(title);
	}
	
	
	@Step("Finding Car name and price")
	public void findNameandPrice() {
		
		home.getCarNameAndPrice();
		
	}
	@Step("Update Car price in a file")
	public void updateCarPriceInFile(String fileName) {
		home.getCarNameAndPrice();
		home.updateCarPriceInFile(fileName);
	}

}
