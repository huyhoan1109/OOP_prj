package Api;

import org.junit.Test;

public class GetListCates extends Base {
    public GetListCates (){
        super("categories"); //Setup Base Path
    }
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	GET();	
    }
}
