import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Framework {

    public static WebDriver driver;
    public static String url = "https://www.google.co.in";

    @Parameters({"browser"})
    @Test
    public static void browsers(String browser) {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get(url);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.get(url);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.get(url);
                break;
            default:
                System.out.println("-----Invalid browser-----");
                break;
        }
    }

    public static void waitForVisibility(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static Select selectValue(WebElement webElement) {
        waitForVisibility(webElement);
        Select selectValue = new Select(webElement);
        return selectValue;
    }

    public static void selectByVisibleText(WebElement webElement, String text) {
        waitForVisibility(webElement);
        Select selectValue = new Select(webElement);
        selectValue.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement webElement, int index) {
        waitForVisibility(webElement);
        Select selectValue = new Select(webElement);
        selectValue.selectByIndex(index);
    }

    public static void selectByText(WebElement webElement, String text) {
        waitForVisibility(webElement);
        Select selectValue = new Select(webElement);
        selectValue.selectByVisibleText(text);
    }

    public static void launchApp()
    {
        driver.get(url);
    }

    public static void closeApp()
    {
        driver.quit();
    }

}



