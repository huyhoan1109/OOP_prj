package Api;

import Utils.Helpers;
import Utils.RestUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.rules.TestName;

import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Base extends RestUtil{
	private Response res = null;
    private RestUtil api = new RestUtil(); 
    private String token = "";
    public boolean appendMode = false;
    
    public Base(String path) {
    	api.setBasePath(path);
    }
    public RestUtil apiBase() {
    	return api;
    }
    public void setappendMode(boolean mode) {
    	this.appendMode = mode;
    }
    public String getToken() {
    	try {
			byte[] data = Files.readAllBytes(Paths.get("./token.out"));
			token = new String(data);
    	} catch(Exception e) {
    	}
    	return token;
    }
    public void setToken(String token) {
    	this.token = token;
    }
    public void POST() {
    	res = given()
                .contentType("application/json")
                .and()
                .body(api.getJson().toString())
                .when()
                .post()
                .then()
                .extract().response();
    	System.out.println(name.getMethodName() + " : " + res.jsonPath().getString("code"));
    	Helpers.checkStatusIs(res);
    }
    public Response response() {
    	return this.res;
    }
    public void GET() {
    	res = given()
                .contentType("application/json")
                .and()
                .body(api.getJson().toString())
                .when()
                .get()
                .then()
                .extract().response();
    	System.out.println(name.getMethodName() + " : " + res.jsonPath().getString("code"));
    	Helpers.checkStatusIs(res);
    }
    public void POSTau() {
    	res = given()
    			.header("authorization", "Bearer " + token)
                .contentType("application/json")
                .and()
                .body(api.getJson().toString())
                .when()
                .post()
                .then()
                .extract().response();
    	System.out.println(name.getMethodName() + " : " + res.jsonPath().getString("code"));
    	Helpers.checkStatusIs(res);
    }
    
    public void GETau() {
    	res = given()
    			.header("authorization", "Bearer " + token)
                .contentType("application/json")
                .and()
                .body(api.getJson().toString())
                .when()
                .get()
                .then()
                .extract().response();
    	System.out.println(name.getMethodName() + " : " + res.jsonPath().getString("code"));
    	Helpers.checkStatusIs(res);
    }
    
    @Rule 
	public TestName name = new TestName();
    
	@Before
    public void initT(){
        //api.setBaseURL();
        getToken();
    }
	
	@After
    public void endT(){
        //api.resetBaseURL();
        api.resetBasePath();
    }
}