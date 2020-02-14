package testTask;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    private static WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\IT\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saweb.dev.sauledev.com/en");

        WebElement userName = driver.findElement(By.xpath("//input[@placeholder ='Username']"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder ='Password']"));
        WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));

        userName.sendKeys("Kessel");
        password.sendKeys("12344321");
        login.click();
    }

    @Test
    public void firstTest() {

    }

    @AfterEach
    public void tearDown() {

    }

}
