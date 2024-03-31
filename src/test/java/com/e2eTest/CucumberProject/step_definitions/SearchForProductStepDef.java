package com.e2eTest.CucumberProject.step_definitions;

import com.e2eTest.CucumberProject.page_objects.SearchProductPage;

import io.cucumber.java.en.When;

public class SearchForProductStepDef {

	public SearchProductPage searchProductPage;

	public SearchForProductStepDef() {
			searchProductPage = new SearchProductPage();
		}

	@When("Je clique sur Catalog")
	public void jeCliqueSurCatalog() {
		SearchProductPage.getMenuCatalog().click();
	}

	@When("Je clique sur Products")
	public void jeCliqueSurProducts() {
	}

	@When("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String string) {
	}

	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
	}

}
