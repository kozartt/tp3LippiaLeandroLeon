package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static lippia.web.constants.myAccountConstants.*;

public class myAccountService extends ActionManager {

    public static void clickMyAccount() {WebActionManager.click(MYACCOUNT_MENU_BUTTON);}

    public static void clickOrders() {WebActionManager.click(ORDERS_BUTTON);}
}
