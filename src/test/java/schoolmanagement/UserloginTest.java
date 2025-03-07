package schoolmanagement;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class UserloginTest {
	    WebDriver driver;

	    public void setup() {
	        // WebDriver setup
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
	        driver = new ChromeDriver();
	        driver.get("http://your-school-management-system-url");
	    }

	    public void login() {
	        // Login functionality
	        System.out.println("Logging in...");
	    }

	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }

	    public static void main(String[] args) {
	        UserloginTest test = new UserloginTest();
	        test.setup();
	        test.login();
	        test.tearDown();
	    }
	}



