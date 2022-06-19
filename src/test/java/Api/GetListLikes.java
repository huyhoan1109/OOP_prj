package Api;

import org.junit.Test;

public class GetListLikes extends Base{
    public GetListLikes (){
        super("likes/0");
    }
    
    @Test
    public void T01() {
    	Object[] keys = {"index", "count"};
    	Object[] values = {2, 1};
    	apiBase().setJson(keys, values, appendMode);
    	GETau();
    }
}
