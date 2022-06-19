package Api;

import org.junit.*;

public class CreateAuction extends Base{
    public CreateAuction(){
        super("auctions/create"); 
    }
    @Test
    public void T01() {
		Object[] keys = {};
    	Object[] values = {};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
    @Test
    public void T02() {
		Object[] keys = {"category_id", "start_date", "end_date", "title_ni"};
    	Object[] values = {"", "","",""};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
    @Test
    public void T03() {
		Object[] keys = {"category_id", "start_date", "end_date", "title_ni"};
    	Object[] values = {"", "17-6-2022","22-6-2022","open day"};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
    @Test
    public void T04() {
		Object[] keys = {"category_id", "start_date", "end_date", "title_ni"};
    	Object[] values = {"1", "","22-6-2022","open day"};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
    @Test
    public void T05() {
		Object[] keys = {"category_id", "start_date", "end_date", "title_ni"};
    	Object[] values = {"1", "17-6-2022","","open day"};
    	apiBase().setJson(keys, values, appendMode);
        POSTau();
    }
    @Test
    public void T06() {
		Object[] keys = {"category_id", "start_date", "end_date", "title_ni"};
    	Object[] values = {"1", "22-6-2022","17-6-2022","open day"};
    	apiBase().setJson(keys, values, appendMode);
    	POSTau();
    }
//    @Test
//    public void T07() {
//		Object[] keys = {"token","category_id", "start_date", "end_date", "title_ni"};
//    	Object[] values = {token,"1", "25-7-2022","28-7-2022","open day"};
//    	apiBase().setJson(keys, values, appendMode);
//    	res = given()
//                .contentType("application/json")
//                .and()
//                .body(apiBase().getJson().toString())
//                .when()
//                .post()
//                .then()
//                .extract().response();
//    	Helpers.checkStatusIs(1000, res, true);
//    }
}
