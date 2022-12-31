import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;





public class HelloSelenium2Test {
    @BeforeClass
    public static void setupClass(){

        WebDriverManager.chromedriver().setup();



    }
    @Test
    public void smarterTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com/");
        driver.quit();
    }
}
