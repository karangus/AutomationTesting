package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageobject.HomePage;
import pageobject.OfferPage;
import utils.GenericUtils;
import utils.TestContextSetup;

public class OfferPageSreachStepDef {

	public TestContextSetup testContextSetup;
    

	public OfferPageSreachStepDef(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("^User search with same Shortname (.+) in offer page to check if product exists$")
	public void user_search_with_same_shortname_in_offer_page_to_check_if_product_exists(String ShortName)
			throws InterruptedException {

		switchToOfferpage();
		
		OfferPage offerpage = testContextSetup.pageobjectmanager.getofferpage();
		offerpage.searchItem(ShortName);

		Thread.sleep(2000);
		testContextSetup.offerproductName = offerpage.getproductname();

		System.out.println(testContextSetup.offerproductName);

	}

	public void switchToOfferpage() {
		
		
		HomePage homepage=testContextSetup.pageobjectmanager.gethomepage();
		homepage.topDealsButton();

		testContextSetup.genericutils.switchwindowtochild();
	}

	@Then("Validate the product name in the offer page and homepage")
	public void validate_the_product_name_in_the_offer_page_and_homepage() {

		assertEquals(testContextSetup.productname, testContextSetup.offerproductName);

	}

}
