import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LinkExample {
    //declaring webdriver driver to use in any method
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage(){
        WebDriver driver = new ChromeDriver();
        //increasing size of the browser to dekstop size
        //driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
    }

    @Test
    public void LinkTest(){
        //    1--> take me to the dashboard

        WebElement homelink = driver.findElement(By.linkText("Go to Dashboard"));
        homelink.click();

//        river.findElement(By.linkText("Go to Dashboard")).click();
        driver.navigate().back();

//    2--> find my destination

        WebElement wheretoGo = driver.findElement(By.partialLinkText("Find the URL without clicking me."));
        String path = wheretoGo.getAttribute("href");
        System.out.println("This link is going to:" + path);

//        3 --> am i a broken link?

        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();

        String title = driver.getTitle();
        if (title.contains("404")){
            System.out.println("The link is broken");
        }else{
            System.out.println("Not broken ");
        }

        driver.navigate().back();


//    4--> duplicate link

        WebElement homelink1 = driver.findElement(By.linkText("Go to Dashboard"));
        homelink1.click();
        driver.navigate().back();


//    5--> count page links

        List<WebElement> countpagelinks = driver.findElements(By.tagName("a"));
        int pageLinkConut = countpagelinks.size();
        System.out.println("Count full page links:" + pageLinkConut);


//    6--> count layout links

        WebElement layoutElement = driver.findElement(By.className("layout-main-content"));
        List<WebElement> countofLayoutElemtns = layoutElement.findElements(By.tagName("a"));
        System.out.println("Count of layout elements:" + countofLayoutElemtns.size() );
    }


}
