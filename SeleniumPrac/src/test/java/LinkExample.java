import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LinkExample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");


    }


    @Test
    public void linkTests(){

        //01)take me to dashboard
        WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();

        //02)find my destination
        WebElement wheretoGo = driver.findElement(By.partialLinkText("Find the URL without"));
        String path = wheretoGo.getAttribute("href");
        System.out.println("This link is goint to : " + path);

        //03)am i a broken link?
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();

        String title = driver.getTitle();
        if (title.contains("404")){
            System.out.println("The link is broken");
        }else{
            System.out.println("Not broken");
        }
        driver.navigate().back();

        //04)duplicate link
        WebElement homeLink1 = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink1.click();
        driver.navigate().back();

        //05)count page links
        List<WebElement> countFullPageLinks = driver.findElements(By.tagName("a"));
        int pageLinkCount = countFullPageLinks.size();
        System.out.println(pageLinkCount);

        //06)count layout links
        WebElement layoutElement = driver.findElement(By.className("layout-main-content"));
        List<WebElement> countOfLayoutLink = layoutElement.findElements(By.tagName("a"));
        System.out.println(countOfLayoutLink.size());
    }
}
