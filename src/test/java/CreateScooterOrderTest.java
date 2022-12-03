import Pages.HomePageScooter;
import Pages.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class CreateScooterOrderTest {
    private WebDriver driver;
    private final  String userName;
    private final String userSecondName;
    private final String userAddress;
    private final String userMetroStation;
    private final String userPhone;
    private final String userDate;
    private final String userPeriod;
    private final String userComment;

    public CreateScooterOrderTest(String userName, String userSecondName, String userAddress, String userMetroStation, String userPhone, String userDate, String userPeriod, String userComment) {
        this.userName = userName;
        this.userSecondName = userSecondName;
        this.userAddress = userAddress;
        this.userMetroStation = userMetroStation;
        this.userPhone = userPhone;
        this.userDate = userDate;
        this.userPeriod = userPeriod;
        this.userComment = userComment;
    }
    @Parameterized.Parameters
    public static Object[][] getDataForOrder() {
        return new Object[][]{
                {"Кристина", "Пугачева", "Вавилова", "Преображенская площадь ", "89679979677", "22.12.2022", "сутки", "нет"},
                {"Анатолий", "Пушкин", "Красная площадь", "Преображенская площадь ", "89671179611", "21.12.2022", "сутки", "нет"},
        };
    }
    @Before
    public void accessSite() {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    @Test
    public void createOrderTest() {
        HomePageScooter objHomePage = new HomePageScooter(driver);
        OrderPage objOrderPage = new OrderPage(driver);

        objHomePage.clickCookieButton();
        objOrderPage.clickOrderButtonUp();

        objOrderPage.fillFirstForm(userName, userSecondName, userAddress, userMetroStation, userPhone);
        objOrderPage.fillSecondForm(userDate, userPeriod, userComment);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        objOrderPage.getOrderCompletedConfirmation();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}