package Api;

import org.junit.Test;

public class EditItem extends Base{
    public EditItem (){
        super("items/edit/1"); //Setup Base Path
    } 
    @Test
    public void T01() {
    	String[] imgs = {"no", "no", "no", "no"};
    	Object[] keys = {"name","starting_price", "brand_id", "description", "series", "images"};
    	Object[] values = {"Oppo A 10", "5000000", "326187", "Một sản phẩm có cải tiến vượt bậc xứng tầm thời đại", "Oppo A", imgs};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();	
    }
}
