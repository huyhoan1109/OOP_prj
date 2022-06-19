package Api;

import org.junit.Test;

public class GetDetailAuction extends Base{
	public GetDetailAuction() {
		super("auctions/detail");
	}
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
        GET();
    }
}