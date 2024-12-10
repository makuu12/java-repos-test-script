import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class webStart {


    @Test
    void Setup (){
        //ref for chromedriver: https://googlechromelabs.github.io/chrome-for-testing/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://trytestingthis.netlify.app");


        WebElement Main = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main")));
        WebElement sda; // Find the element
        sda = Main.findElement(By.id("fname"));
        sda.sendKeys("Mark"); // Send keys to the element
        Main.findElement(By.id("fname")).sendKeys("Test1");
    }

//    @Test
//    void inputField (){
//        Main.findElement(By.id("fname")).sendKeys("Mark");
//        Main.findElement(By.id("fname")).sendKeys("Test1");
//    }
//
//    @Test
//    void radioButton (){
//        WebElement radioButton = Main.findElement(By.id("male"));
//        if (!radioButton.isSelected()) {
//            radioButton.click(); // Click to select the radio button
//        }
//    }

    @Test
    void dropDown (){

    }




//    void newTab (){
//        ((JavascriptExecutor) driver).executeScript("window.open();");
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    @Test
//    void Test2 () {
//        driver.get("https://demoqa.com/auto-complete");
//        WebElement field1 = driver.findElement(By.id("autoCompleteMultipleInput"));
//        for (int i = 0; i < 3; i++) {
//            field1.sendKeys("a");
//            field1.sendKeys(Keys.ENTER);
//        }
//        WebElement field2 = driver.findElement(By.id("autoCompleteSingleInput"));
//        field2.sendKeys("gr");
//        field2.sendKeys(Keys.ENTER);
//    }
}
