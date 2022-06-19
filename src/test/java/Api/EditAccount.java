package Api;

import org.junit.*;

public class EditAccount extends Base{
    public EditAccount(){
        super("edit");
    }
    @Test
    public void T01() {
    	String[] keys = {"email"};
    	String[] values = {"huyhoangmail.com"};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
    
    @Test
    public void T02() {
		Object[] keys = {"email","address", "name","phone","avatar"};
    	Object[] values = {"huyhoan@gmail.com","dada", "huyhoan", "021313",""};
    	apiBase().setJson(keys, values, appendMode);
        POSTau();
    }
}
