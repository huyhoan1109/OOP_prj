package Api;

import org.junit.*;

public class DeleteAuction extends Base{
    public DeleteAuction (){
    	super("auctions/deleteAuction/1");
    }
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	POSTau();
    }
}
