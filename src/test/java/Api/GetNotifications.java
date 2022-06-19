package Api;

import org.junit.Test;

public class GetNotifications extends Base {
    public GetNotifications (){
        super("notifications"); 
    }
    
    @Test
    public void T01() {
    	Object[] keys = {"index", "count"};
    	Object[] values = {2, 1};
    	apiBase().setJson(keys, values, appendMode);
    	GETau();
    }
}
