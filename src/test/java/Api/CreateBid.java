package Api;

import org.junit.Test;

public class CreateBid extends Base{
	public CreateBid (){
        super("bids/create/1");
    }
    
    @Test
    public void T01() {
    	Object[] keys = {"price","bid_last_id"};
    	Object[] values = {"200000",1};
    	apiBase().setJson(keys, values, appendMode);
        POSTau();	
    }
}
