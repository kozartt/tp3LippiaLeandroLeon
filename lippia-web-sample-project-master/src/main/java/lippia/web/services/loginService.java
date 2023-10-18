package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.loginConstants;


import static lippia.web.constants.loginConstants.*;


public class loginService extends ActionManager {

    public static void clickLoginButton() {WebActionManager.click( LOGIN_BUTTON );}

    public static void ingresaUsername(String username) {setInput(loginConstants.LUSERNAME_TEXTBOX, username);}

    public static void ingresaPassword(String password) {setInput(loginConstants.LPASSWORD_TEXTBOX, password);}

}
