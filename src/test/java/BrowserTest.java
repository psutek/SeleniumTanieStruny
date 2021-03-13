import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

    public static void main(String[] args){

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath :" + projectPath);

        System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


        driver.get("https://taniestruny.pl/");

        driver.close();
        driver.quit();
    }
}
