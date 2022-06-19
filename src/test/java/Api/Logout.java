package Api;

import org.junit.*;

public class Logout extends Base{
	public Logout() {
		super("logout");
	}
    @Test
    public void T01(){
         apiBase().setJson("", "", appendMode);
         POSTau();
    }
}
