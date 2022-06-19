package Api;

import org.junit.Test;

public class InfoAuction extends Base{
	public InfoAuction() {
		super("auctions/info/1");
	}
    
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	GETau();
    }
}
