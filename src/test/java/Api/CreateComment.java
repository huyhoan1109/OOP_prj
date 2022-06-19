package Api;

import java.util.*;
import org.junit.Test;

public class CreateComment extends Base{
	public CreateComment (){
        super("/comments/create/1");
    }
    
    @Test
    public void T01() {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	System.out.print("Your comment: ");
    	String content = sc.nextLine();
    	Object[] keys = {"content","comment_last_id"};
    	Object[] values = {content, "0"};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
}
