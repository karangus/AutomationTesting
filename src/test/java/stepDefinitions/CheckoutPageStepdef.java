package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CheckoutPage;
import pageobject.HomePage;
import utils.TestContextSetup;

public class CheckoutPageStepdef {
	public TestContextSetup testContextSetup;
	public CheckoutPage checkout;
	public HomePage homepage;
	

	public CheckoutPageStepdef(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	   this.checkout= testContextSetup.pageobjectmanager.getcheckoutpage();
	   this.homepage=testContextSetup.pageobjectmanager.gethomepage();

	}
	
	 @Then("Verify the user as ability to enter the promo code and place the order")
		public void  Verify_the_user_as_ability_to_enter_the_promo_code() throws InterruptedException
	   {
		 Thread.sleep(5000);
			Assert.assertTrue(checkout.verifyPromobtn());
			Assert.assertTrue(checkout.verifyPlaceorder());
	   }
	    


	@Then("^User proceeds to checkout and validate (.+) items in checkout page$")
	public void user_proceed_to_checkout_and_validate_item_in_checkoutpage(String Vegtables)
	{
		checkout.checkoutclick();
		testContextSetup.productname=homepage.getproductname().substring(0,3);

		
		assertEquals(testContextSetup.productname,Vegtables);
		
	}
   

}
