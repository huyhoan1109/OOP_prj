package Api;

import org.junit.Test;

public class GetListBids extends Base{
    public GetListBids (){
        super("bids/1"); 
    }  
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	GET();	
    }
}