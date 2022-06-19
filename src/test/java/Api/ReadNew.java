package Api;

import org.junit.Test;

public class ReadNew extends Base {
    public ReadNew (){
        super("news/read/1"); //Setup Base Path
    }
    
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	GET();
    }
}
