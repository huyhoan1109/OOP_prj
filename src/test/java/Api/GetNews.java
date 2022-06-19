package Api;

import org.junit.Test;

public class GetNews extends Base{
    public GetNews(){
        super("news"); 
    }
    @Test
    public void T01() {
    	Object[] keys = {"index", "count"};
    	Object[] values = {2, 1};
    	apiBase().setJson(keys, values, appendMode);
    	GET();
    }
}
