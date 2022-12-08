package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobject.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String productname;
	public String offerproductName;
	public TestBase testbase;
	public String checkoutpageprouctname;
	
	public GenericUtils genericutils;
	public PageObjectManager pageobjectmanager;
	
	public TestContextSetup() throws IOException
	{
		testbase=new TestBase();
		pageobjectmanager =new PageObjectManager(testbase.webDriverManager());
		genericutils=new GenericUtils(testbase.webDriverManager());
		
		
	}
	
	

}
