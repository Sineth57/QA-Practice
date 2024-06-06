import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkExample {
    //declaring webdriver driver to use in any method
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage(){
        WebDriver driver = new ChromeDriver();
        //increasing size of the browser to dekstop size
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
    }

    @Test
    public void LinkTest(){
        //    1--> take me to the dashboard

        WebElement homelink = driver.findElement(By.linkText("Go to Dashboard"));
        homelink.click();
        driver.navigate().back(); 

//    2--> am i a broken link?
//    3--> duplicate link
//    4--> count page links
//    5--> count layout links
    }


}
