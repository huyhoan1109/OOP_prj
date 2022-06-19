package Api;

import org.junit.*;


public class EditAuction extends Base{
	public EditAuction() {
		super("auctions/edit/1");
	}
	
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	POSTau();
    }
    @Test
    public void T02() {
		Object[] keys = {"start_date", "end_date", "",""};
    	Object[] values = {"30-6-2022", "22-6-2022","",""};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
}
