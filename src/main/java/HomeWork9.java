import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class HomeWork9 {
    private static ChromeDriver driver;


    @BeforeClass
    public static void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "/Users/cupra/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Actions/");

    }

//    @Test
//    public void test01_dimensions(){
//        System.out.println(driver.findElement(By.id("seven")).getRect().getHeight());
//        System.out.println(driver.findElement(By.id("seven")).getRect().getWidth());
//        System.out.println(driver.findElement(By.id("seven")).getRect().getX());
//        System.out.println(driver.findElement(By.id("seven")).getRect().getY());
//        System.out.println(driver.findElement(By.id("six")).isDisplayed());
//        driver.findElement(By.id("four")).click();
//        driver.findElement(By.id("add")).click();
//        driver.findElement(By.id("six")).click();
//        driver.findElement(By.id("equal")).click();
//        String expectedResult = "10";
//        assertEquals(expectedResult,"10");
//    }

//    @Test
//    public void test02_ggl_assert() {
//        String gglURL = "https://www.google.com/";
//        Assert.assertEquals(driver.getCurrentUrl(), gglURL);
//    }

//    @Test
//    public void test03_ggl_assertTitle() {
//        String googleTitle = "ynet - חדשות, כלכלה, ספורט ובריאות - דיווחים שוטפים מהארץ ומהעולם";
//        driver.manage().window().maximize();
//        driver.navigate().refresh();
//        Assert.assertEquals(driver.getTitle(), googleTitle);
//    }

//    @Test
//    public void test04_extension() {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--disable-extensions");
//        driver = new ChromeDriver(chromeOptions);
//    }

//    @Test
//    public void elementScreenshotTest() {
//        takeElementScreenshot(driver.findElement(By.id("div1")));
//    }
//
//    private void takeElementScreenshot(WebElement element) {
//        File screenShotFile = element.getScreenshotAs(OutputType.FILE);
//        try{
//            FileUtils.copyFile(screenShotFile, new File("element-screenshot.png"));
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void test052_doubleClick() {
//        WebElement doubleClickElement = driver.findElement(By.id("title"));
//        Actions myAction = new Actions(driver);
//        myAction.doubleClick(doubleClickElement);
//        myAction.perform();
//        String result = driver.findElement(By.id("title")).getText();
//        Assert.assertEquals("Actions", result);
//    }

//    @Test
//    public void test053_mouseHover() {
//        WebElement buttonElement = driver.findElement(By.id("close"));
//        Actions myAction = new Actions(driver);
//        myAction.moveToElement(buttonElement);
//        myAction.build().perform();
//    }

//    @Test
//    public void test054_select() {
//        List<WebElement> elementsList = driver.findElement(By.name("option"));
//        Actions hold = new Actions(driver);
//        hold.clickAndHold(elementsList.get(0)).clickAndHold(elementsList.get(2)).click();
//        hold.build().perform();
//    }

//    @Test
//    public void test055_upload() {
//
//
//    }

//    @Test
//    public void test056_scrollToElement() throws InterruptedException {
//        Thread.sleep(2000);
//        WebElement element = driver.findElement(By.id("clickMe"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//    }

//    @Test
//    public void test056_scrollToLocation() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("javascript:window.scrollBy(250,350)");
//
//    }

    @Test
    public void test056_scrollToLocation()  {
        WebElement uploadF = driver.findElement(By.name("pic"));
        uploadF.sendKeys("Users/cupra/IdeaProjects/class9M/element-screenshot");

    }




    @AfterClass
    public static void quit(){
//        driver.quit();
    }

}
