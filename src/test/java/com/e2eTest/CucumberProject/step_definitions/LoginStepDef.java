package com.e2eTest.CucumberProject.step_definitions;

import com.e2eTest.CucumberProject.page_objects.LoginPage;
//import com.e2eTest.CucumberProject.page_objects.LoginPage;
import com.e2eTest.CucumberProject.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	public LoginPage loginPage; 

	public LoginStepDef() {
		loginPage = new LoginPage();
	}

	/* login valid */
	@Given("Je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() {
		Setup.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		LoginPage.getEmail().clear();
		LoginPage.getEmail().sendKeys(email);
	}

	@When("Je saisis le login {string}")
	public void jeSaisisLeLogin(String login) {
		LoginPage.getPassword().clear();
		LoginPage.getPassword().sendKeys(login);
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();
	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	}

	/* login invalid */
	@Then("Je verifie le message d'erreur")
	public void jeVerifieLeMessageDErreur() {
	}

}