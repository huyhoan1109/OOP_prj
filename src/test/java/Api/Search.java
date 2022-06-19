package Api;

import org.junit.Test;

public class Search extends Base{
	public Search() {
		super("search");
	}
    @Test
    public void T01() {
    	Object[] keys = {"type", "key"};
    	Object[] values = {"1", "1"};
    	apiBase().setJson(keys, values, appendMode);
    	GET();
    }
}
