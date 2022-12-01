import Pages.HomePageScooter;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionTest {
    private WebDriver driver;

    @Test
    public void checkTextEqual() {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooter objHomePage = new HomePageScooter(driver);

        objHomePage.clickCookieButton();
        objHomePage.equalTextAccordion0();
        objHomePage.equalTextAccordion1();
        objHomePage.equalTextAccordion2();
        objHomePage.equalTextAccordion3();
        objHomePage.equalTextAccordion4();
        objHomePage.equalTextAccordion5();
        objHomePage.equalTextAccordion6();
        objHomePage.equalTextAccordion7();
    }

    @After
   public void tearDown() {
        driver.quit();
    }
}
