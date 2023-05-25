import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSetup {

    public static WebDriver driver;

    public static WebDriver startChromeDriver() {
        //Criando o Objeto do ChromeDriver

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("--start-maximized");
        driver.manage().window().maximize();
        return driver;
    }
}
