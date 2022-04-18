package pages;

import base.BasePage;

public class HomePage extends BasePage{
	
	String newCarMenu = "xpath=//div[contains(text(),'NEW CARS')]";
	String findNewCar = "xpath=//div[contains(text(),'Find New Cars')]";
	
	
	public void navigateToNewCars() {
		moveMouseTo(newCarMenu);
	}
	
	public NewCarsPage navigateTofindNewCars() {
		
		
		click(findNewCar);
		
		return  new NewCarsPage();
	}

	
	
	public void findUsedCars() {
		
		
		
	}
	
	
	public void doLogin() {
		
		
	}
	
	
	public void checkOnRoadPrice() {
		
		
	}
}
