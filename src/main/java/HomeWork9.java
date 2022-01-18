import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

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
//
//        String result = driver.findElement(By.id("title")).getText();
//        Assert.assertEquals("You double clicked", result);
//    }


    @AfterClass
    public static void quit(){
//        driver.quit();
    }

}
