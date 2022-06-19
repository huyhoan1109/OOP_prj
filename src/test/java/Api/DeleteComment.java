package Api;

import org.junit.Test;

public class DeleteComment extends Base {
    public DeleteComment (){
        super("comments/delete/1"); //Setup Base Path
    }
    
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	POSTau();
    }
}
