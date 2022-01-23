import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.time.Duration;


public class Tst {
    private static ChromeDriver driver;


    @BeforeClass
    public static void beforClass(){
        System.setProperty("webdriver.chrome.driver", "/Users/cupra/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Controllers/");

    }

//    @Test
//    public static void upld(){
//        driver.findElement(By.name("pic")).sendKeys("C:\\Users\\cupra\\Desktop/ss.txt");
//    }

    @Test
    public void test06_Controllers()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/input[3]")).click();
        Select oneOption = new Select(driver.findElement(By.name("dropdownmenu")));
        oneOption.selectByVisibleText("Cheese");
        System.out.println("The Optins In The Dropdown Menu is:\n");
        for (int i = 0; i < oneOption.getOptions().size(); i++) {
            System.out.println( oneOption.getOptions().get(i).getText());
        }
    }

//    @Test
//    public void test07_Deminsions()  {
//        driver.get("https://dgotlieb.github.io/WebCalculator/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("two")));
//        System.out.println(driver.findElement(By.id("two")).getRect().getHeight());
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("six")));
//        System.out.println(driver.findElement(By.id("six")).getRect().getWidth());
//    }





    @AfterClass
    public static void quit(){
//        driver.quit();
    }
}
