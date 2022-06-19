package Api;
import org.json.JSONObject;
import org.junit.Test;

public class GetListAuctions extends Base{
    public GetListAuctions(){
        super("auctions/0"); 
    }
    
    @Test
    public void T01() {
    	Object[] keys = {"index","count"};
    	Object[] values = {2, 1};
    	apiBase().setJson(keys, values, appendMode);
    	GET();	
    }
    @Test
    public void T02() {
    	Object[] keys = {"index","count"};
    	Object[] values = {2, 1};
    	apiBase().setJson(keys, values, appendMode);
    	JSONObject info = new JSONObject();
    	info.accumulate("user_id", 1);
    	apiBase().setJson("user", info, true);
    	GET();
    }
    @Test
    public void T03() {
    	Object[] keys = {"index","count", "type"};
    	Object[] values = {2, 1, 1};
    	apiBase().setJson(keys, values, appendMode);
    	GET();	
    }
    @Test
    public void T04() {
    	Object[] keys = {"index", "count", "category_id"};
    	Object[] values = {2, 1, 1};
    	apiBase().setJson(keys, values, appendMode);
    	GET();	
    }
}
