package Api;

import org.junit.Test;

public class GetSlider extends Base{
    public GetSlider() {
    	super("/slider");
    }
    @Test
    public void T01() {
    	apiBase().setJson("", "", appendMode);
    	GET();
    }
}
