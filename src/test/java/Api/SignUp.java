package Api;

import org.junit.*;

public class SignUp extends Base{
	public SignUp() {
		super("signup");
	}
    @Test
    public void T01() {
    	Object[] keys = {"email", "password", "re_pass", "address", "name","phone","avatar"};
    	Object[] values = {"", "", "", "", "", "",""};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    @Test
    public void T02() {
    	Object[] keys = {"email", "password","re_pass", "address", "name","phone","avatar"};
    	Object[] values = {"huyhoan@gmail.com", "1".repeat(300),"2".repeat(23),"","hoan","392108",""};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    
    @Test
    public void T03() {
    	Object[] keys = {"email", "password","re_pass", "address", "name","phone","avatar"};
    	Object[] values = {"huyhoan@gmail.com", "1".repeat(12),"2".repeat(12),"","hoan","392108",""};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    
    @Test
    public void T04() {
    	Object[] keys = {"email", "password","re_pass", "address", "name","phone","avatar"};
    	Object[] values = {"huyhoan@gmail.com", "1".repeat(300),"2".repeat(23),"","hoan","",""};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    
//    @Test
//    public void T05() {
//    	Object[] keys = {"email", "password", "re_pass", "address", "name","phone","avatar"};
//    	Object[] values = {"huyhoan@gmail.com", "123456","123456","","hoan","392108",""};
//    	apiBase().setJson(keys, values,appendMode);
//    	res = given()
//                .contentType("application/json")
//                .and()
//                .body(apiBase().getJson().toString())
//                .when()
//                .post()
//                .then()
//                .extract().response();
//    	Helpers.checkStatusIs(res);
//    }
}