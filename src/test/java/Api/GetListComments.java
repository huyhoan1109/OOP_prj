package Api;

import org.junit.Test;

public class GetListComments extends Base{
    public GetListComments (){
        super("comments/1"); //Setup Base Path
    }
    
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	GET();
    }
}
