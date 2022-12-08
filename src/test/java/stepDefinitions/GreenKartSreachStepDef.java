package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.HomePage;
import utils.TestContextSetup;

public class GreenKartSreachStepDef {
	
	public TestContextSetup testContextSetup;
	HomePage homepage;
	
	
	
public GreenKartSreachStepDef(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
	this.homepage=testContextSetup.pageobjectmanager.gethomepage();
}
	
	@Given("User is on Greenkart Landing page")
	public void user_is_on_greenkart_landing_page() {

    homepage.getTitleLandingPage();
    
   Assert.assertTrue(homepage.getTitleLandingPage().contains("GreenKart"));

	}

	@When("^User search with Shortname (.+) and extract with actual name$")
	public void user_search_with_shortname_and_extract_with_actual_name(String Shortname) throws InterruptedException {
        
        homepage.searchItem(Shortname);
		Thread.sleep(2000);

		 testContextSetup.productname=homepage.getproductname().split("-")[0].trim();

		System.out.println(testContextSetup.productname + " is extracted from Home page");

	}
	@When("Added {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product(String quantity)
	{
		homepage.increamentvalue(Integer.parseInt(quantity));
		homepage.addToCart();
	}

	
		
		
		
		
	}

