//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    //Open goole
    //Going to home page
    public static void main(String[] args) {

        //first method - System.setProperty()
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\User St\\Downloads\\Driver\\chromedriver-win64\\chromedriver.exe");

//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");




    }
}
