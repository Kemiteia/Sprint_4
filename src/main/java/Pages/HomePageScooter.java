package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePageScooter {
    private WebDriver driver;
    private final By cookieButton = By.className("App_CookieButton__3cvqF");
    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCookieButton(){
        driver.findElement(cookieButton).click();
    }
    public void clickOnQuestion(int index) {
        driver.findElement(By.xpath(".//div[@id='accordion__heading-"+ index +"']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@id='accordion__panel-" + index + "']")));
    }
    public String equalTextAccordion(int index) {
        return driver.findElement(By.xpath(".//div[@id='accordion__panel-" + index + "']")).getText();
    }
}
