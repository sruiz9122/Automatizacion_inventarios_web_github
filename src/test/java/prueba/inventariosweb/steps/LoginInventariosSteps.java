package prueba.inventariosweb.steps;

import net.thucydides.core.annotations.Step;
import prueba.inventariosweb.pageobjects.LoginInventariosObject;


public class LoginInventariosSteps {
	
	LoginInventariosObject objetosLogin;
	
	@Step
	public void loginInventarios() {
		objetosLogin.open();
		
	}
	
}
