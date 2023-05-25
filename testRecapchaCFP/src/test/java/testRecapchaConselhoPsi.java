import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testRecapchaConselhoPsi extends WebDriverSetup{

    @Test
    public void pegarRecaptchaComSucesso(){

        WebDriver driver = startChromeDriver();

        //Acessando a URL especifica do CFP de buscas
        driver.get("https://cadastro.cfp.org.br/");

        //Encontrando o Elemento do Recapcha
        WebElement iFrame =
                driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
                driver.switchTo().frame(iFrame);
        WebElement recaptchaToken =
                driver.findElement(By.id("recaptcha-token"));
                String token = recaptchaToken.getAttribute("value").trim();

        // Imprimindo o Token do Recaptcha
        System.out.println("O token do elemento recaptcha é: " + token);
        driver.quit();
    }
}