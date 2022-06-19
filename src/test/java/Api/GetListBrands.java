package Api;

import org.junit.Test;

public class GetListBrands extends Base{
    public GetListBrands (){
        super("/brands"); //Setup Base Path
    }
    
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	GET();	
    }
}
