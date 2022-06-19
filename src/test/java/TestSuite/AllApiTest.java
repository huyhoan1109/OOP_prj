package TestSuite;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import Api.*;
import Utils.*; 

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Login.class,
	Logout.class,
}) 
public class AllApiTest {
	@BeforeClass
    public static void Begin() {
	}
	@AfterClass
    public static void End() {
		Helpers.deleteAll();
    }
}