package Api;

import org.junit.Test;

public class CreateItem extends Base{
    public CreateItem (){
    	super("/items/create/1");
    }    
    @Test
    public void T01() {
    	Object[] keys = {"name", "starting_price", "brand_id", "description", "series", "images"};
    	Object[] values = {"Samsung Note 8","10000000", "Samsung", "Trang bi cho thoi dai 4.0", "", ""};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
}
