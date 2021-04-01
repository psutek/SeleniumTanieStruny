import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class BrowserTest {

    public static void main(String[] args) throws InterruptedException {

        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath :" + projectPath);

        System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


        driver.get("https://www.google.pl");
        driver.manage().window().maximize();



        // wyszukiwarka

        WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        search.sendKeys("Seba");
        search.click();
        Thread.sleep(3000);
        search.sendKeys(Keys.ENTER);


        // wyszukiwarka


        WebElement menuStruny = driver.findElement(By.xpath("//a[@title='Struny do gitary']"));
        menuStruny.click();

        WebElement podemnuStrunyDoGitaryElektryczenj = driver.findElement(By.xpath("//a[@title='Struny do gitary elektrycznej']"));
        podemnuStrunyDoGitaryElektryczenj.click();

        WebElement firstProduct = driver.findElement(By.xpath("//h2/a"));
        firstProduct.click();

        Thread.sleep(2000);

        Actions action = new Actions(driver);
        WebElement daneTechniczne = driver.findElement(By.xpath("//a[@data-target='dane-techniczne']/h2"));
        action.moveToElement(daneTechniczne).click().build().perform();

        Thread.sleep(2000);

        WebElement symbol = driver.findElement(By.xpath("(//div[@class='product-specification']//td[contains(text(),'symbol')]/../td)[2]"));
        String symbolText = symbol.getText();

        System.out.println(symbolText);

        Assert.assertEquals("2k20_EXL110-3D", symbolText);




        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}
