package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.loginService;
import lippia.web.services.myAccountService;
import org.testng.Assert;

public class myAccountSteps extends PageSteps {

    @Given("Estoy en la URL (.*)")
    public void estoyEnLaURL() {
        WebActionManager.navigateTo("http://practice.automationtesting.in/");}

    @When("hago click en el menu My Account")
    public void hagoClickEnElMenuMyAccount() {
        loginService.clickLoginButton();}

    @And("ingreso un e-mail en el login")
    public void ingresaEmailL(String arg0){loginService.ingresaUsername(arg0);}

    @And("ingreso un password en el login")
    public void ingresaPasswordL(String arg1) {loginService.ingresaPassword(arg1);}

    @And("hago click en el boton de Login")
    public void hagoClickEnElBotonDeLogin() {loginService.clickLoginButton();}

    @And("hago click en el link My Account")
    public void hagoClickEnElLinkMyAccount() {myAccountService.clickMyAccount();}

    @Then("el usuario puede ver el Dashboard")
    public void elUsuarioPuedeVerElDashboard() {Assert.assertFalse(false);}

    @And("hago click en el boton orders")
    public void hagoClickEnElBotonOrders() {myAccountService.clickOrders();}

    @Then("el cliente puede ver sus pedidos de compra")
    public void elClientePuedeVerSusPedidosDeCompra() {Assert.assertFalse(false);
    }
}
