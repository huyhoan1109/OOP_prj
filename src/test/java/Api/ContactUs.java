package Api;

import org.junit.Test;

public class ContactUs extends Base{
    public ContactUs (){
        super("auctions/1");
       
    }
    @Test
    public void T01() {
    	Object[] keys = {"name","phone", "email", "content", "file", "report_type"};
    	Object[] values = {"hoan","0391203128", "huyhoan@gmail.com", "...", "", "Câu hỏi sử dụng"};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
}
