package Api;

import io.restassured.response.Response;

import org.junit.*;
import java.util.*;
import java.io.*;  
import java.io.IOException;

public class Login extends Base {
	public Login() {
		super("login");
	}
    @Test
    public void T01() {
    	Object[] keys = {"email", "password"};
    	Object[] values = {"", ""};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    @Test
    public void T02() {
    	Object[] keys = {"email", "password"};
    	Object[] values = {"huyhoan", ""};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    @Test
    public void T03() {
    	Object[] keys = {"email", "password"};
    	Object[] values = {"huyhoan@gmail.com", ""};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    @Test
    public void T04() {
    	Object[] keys = {"email", "password"};
    	Object[] values = {"", "123456"};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    @Test
    public void T05() {
    	Object[] keys = {"email", "password"};
    	Object[] values = {"", "123456"};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    }
    
    @Test
    public void T06() throws IOException, NullPointerException {
    	Object[] keys = {"email", "password"};
    	Object[] values = {"huyhoan@gmail.com", "123456"};
    	apiBase().setJson(keys, values, appendMode);
    	POST();
    	Response res = response();
        if(res.jsonPath().getString("code").equals("1000")) {
        	Map<Object, Object> obj = res.jsonPath().getMap("data");
            byte[] data = obj.get("access_token").toString().getBytes();
            try (FileOutputStream fos = new FileOutputStream("./token.out")) {
                fos.write(data);
                System.out.println("Token saved");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
