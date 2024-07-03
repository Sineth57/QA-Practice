//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    public static void main(String[] args) {

//        Open google
//        Got to google home page

       // System.setProperty("webdriver.chrome.driver","C:\\Users\\User St\\Downloads\\Driver\\chromedriver-win64\\chromedriver.exe");


       // WebDriverManager.chromedriver().setup();

        // webdriver is the major component of selenium
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }
}
