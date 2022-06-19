package Api;

import org.junit.Test;

public class InfoItem extends Base {
    public InfoItem(){
        super("items/info/1");
    }    
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
        GETau();
    }
}
