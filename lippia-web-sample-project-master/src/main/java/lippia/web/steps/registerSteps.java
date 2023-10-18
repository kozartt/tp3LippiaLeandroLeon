package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.registerConstants;
import lippia.web.services.loginService;
import lippia.web.services.registerService;
import org.testng.Assert;

public class registerSteps extends PageSteps {

    @Given("Estoy en la URL (.*)")
    public void estoyEnLaURL() {WebActionManager.navigateTo("http://practice.automationtesting.in/");}

    @When("hago click en el menu My Account")
    public void hagoClickEnElMenuMyAccount() {
        loginService.clickLoginButton();}

    @And("ingreso un (.*) correcto en la caja de texto mail del register")
    public void ingresoUnEMailCorrectoEnLaCajaDeTextoMailDelRegister(String arg0) {
        registerService.ingresaUsername(arg0);
    }

    @And("ingreso un (.*) correcto en la caja de texto password del register")
    public void ingresoUnPasswordCorrectoEnLaCajaDeTextoPasswordDelRegister(String arg1) {
        registerService.ingresaPassword(arg1);
    }

    @And("hago click en el boton Register")
    public void hagoClickEnElBotonRegister() {registerService.clickRegisterButton();}

    @Then("el cliente sera registrado exitosamente")
    public void elClienteSeraRegistradoExitosamente() {
        Assert.assertFalse(false);
    }

    @And("ingreso un (.*) incorrecto en la caja de texto mail del register")
    public void ingresoUnMailIncorrectoEnLaCajaDeTextoMailDelRegister(String arg0) {
        registerService.ingresaUsername(arg0);
    }

    @And("ingreso un (.*) incorrecto en la caja de texto mail del register")
    public void ingresoUnEMailIncorrectoEnLaCajaDeTextoMailDelRegister(String arg1) {
        registerService.ingresaPassword(arg1);
    }

    @Then("El cliente vera que su registro fue fallido, junto con el siguiente mensaje: {string}")
    public void elClienteVeraQueSuRegistroFueFallidoJuntoConElSiguienteMensaje(String mError) {
        Assert.assertEquals(mError, ActionManager.getText(registerConstants.ACCOUNT_REGISTERED_ERROR));
    }

}

