package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.registerConstants;


import static lippia.web.constants.registerConstants.*;


public class registerService extends ActionManager {

    public static void clickRegisterButton() {WebActionManager.click( REGISTER_BUTTON );}

    public static void ingresaUsername(String username) {setInput(registerConstants.RUSERNAME_TEXTBOX, username);}

    public static void ingresaPassword(String password) {setInput(registerConstants.RPASSWORD_TEXTBOX, password);}

}