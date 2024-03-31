package com.e2eTest.CucumberProject.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import com.e2eTest.CucumberProject.utils.BasePage;
import com.e2eTest.CucumberProject.utils.Setup;

public class SearchProductPage extends BasePage {
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menuCatalog;

	public SearchProductPage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCatalog() {
		return menuCatalog;
	}

}
