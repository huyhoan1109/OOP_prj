package Api;

import org.junit.Test;

public class ReadNotifications extends Base{
    public ReadNotifications (){
        super("notifications/read/1"); 
    }
    
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	GETau();
    }
}
