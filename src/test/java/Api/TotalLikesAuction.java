package Api;

import org.junit.Test;

public class TotalLikesAuction extends Base {
    public TotalLikesAuction (){
        super("totalLikes/1");
    }
    
    @Test
    public void T01() {
    	Object[] keys = {""};
    	Object[] values = {""};
    	apiBase().setJson(keys, values, appendMode);
    	GETau();
    }
}
