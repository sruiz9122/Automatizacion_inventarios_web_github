package prueba.inventariosweb.definition;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import prueba.inventariosweb.steps.LoginInventariosSteps;

public class LoginInventariosDefinition {
	
	@Steps
	LoginInventariosSteps stepsLogin;
	
	@Given("^Ingresar a inventarios$")
	public void ingresar_a_inventarios() {
	   stepsLogin.loginInventarios();
	}
}
