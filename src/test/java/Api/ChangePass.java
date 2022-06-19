package Api;

import org.junit.Test;

public class ChangePass extends Base{
    public ChangePass() {
    	super("changepass");
    }
    @Test
    public void T01() {
    	Object[] keys = {"old_pass", "new_pass", "re_pass"};
    	Object[] values = {"12345", "123456", "123456"};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
}