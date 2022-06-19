package Api;

import org.junit.Test;

public class Info extends Base{
	public Info() {
		super("info");
	}    
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
        GETau();
    }
}