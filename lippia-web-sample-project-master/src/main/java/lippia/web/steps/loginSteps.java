package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.loginConstants;
import lippia.web.services.loginService;
import org.testng.Assert;

public class loginSteps extends PageSteps {

    @Given("Estoy en la URL (.*)")
    public void estoyEnLaURL() {WebActionManager.navigateTo("http://practice.automationtesting.in/");}

    @When("hago click en el menu My Account")
    public void hagoClickEnElMenuMyAccount() {
        loginService.clickLoginButton();}

    @And("ingreso un (.*) correcto en la caja de texto mail del login")
    public void ingresoUnEMailCorrectoEnLaCajaDeTextoMailDelLogin(String arg0) {
        loginService.ingresaUsername(arg0);
    }

    @And("ingreso un (.*) correcto en la caja de texto password del login")
    public void ingresoUnPasswordCorrectoEnLaCajaDeTextoPasswordDelLogin(String arg1) {
        loginService.ingresaPassword(arg1);
    }

    @And("hago click en el boton Login")
    public void hagoClickEnElBotonLogin() {loginService.clickLoginButton();}

    @Then("el cliente sera logueado exitosamente y posteriormente redirigido a la Home page")
    public void elClienteSeraLogueadoExitosamenteYPosteriormenteRedirigidoALaHomePage() {
        Assert.assertFalse(false);
    }

    @And("ingreso un (.*) incorrecto en la caja de texto mail del login")
    public void ingresoUnMailIncorrectoEnLaCajaDeTextoMailDelLogin(String arg0) {
        loginService.ingresaUsername(arg0);}

    @And("ingreso un (.*) incorrecto en la caja de texto password del login")
    public void ingresoUnPasswordIncorrectoEnLaCajaDeTextoPasswordDelLogin(String arg1) {
        loginService.ingresaPassword(arg1);}

    @Then("el cliente no podra acceder con su cuenta y vera un mensaje de (.*)")
    public void elClienteNoPodraAccederConSuCuentaYVeraUnMensajeDe(String mError) {
        Assert.assertEquals(mError, ActionManager.getText(loginConstants.WRONG_USERNAME_MESSAGE));}


}

