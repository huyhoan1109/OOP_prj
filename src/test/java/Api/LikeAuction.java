package Api;

import org.junit.Test;

public class LikeAuction extends Base {
	public LikeAuction() {
		super("updateLike/1");
	} 
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	POSTau();
    }
}
