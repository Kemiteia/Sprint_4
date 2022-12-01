package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class OrderPage {
    private WebDriver driver;
    private final By orderButtonUp = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']");
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    private final By secondNameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By buttonNext = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Далее']");
    private final By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By periodField = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By isBlackCheckbox = By.xpath(".//input[@id='black']");
    private final By isGreyCheckbox = By.xpath(".//input[@id='grey']");
    private final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    private final By buttonYes = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOrderButtonUp() {
        driver.findElement(orderButtonUp).click();
    }
    public void fillFirstForm(String userName, String userSecondName, String userAddress, String userMetroStation, String userPhone) {
        driver.findElement(nameField).sendKeys(userName);
        driver.findElement(secondNameField).sendKeys(userSecondName);
        driver.findElement(addressField).sendKeys(userAddress);
        driver.findElement(metroStationField).click();
        WebElement elementUserMetroStation = driver.findElement(By.cssSelector("div.select-search__select"));
        elementUserMetroStation.click();
        driver.findElement(phoneField).sendKeys(userPhone);
        driver.findElement(buttonNext).click();
    }
    public void fillSecondForm(String userDate, String userPeriod, String userComment){
        driver.findElement(dateField).click();
        driver.findElement(dateField).sendKeys(userDate);
        driver.findElement(dateField).sendKeys(Keys.ENTER);

        driver.findElement(periodField).click();
        driver.findElement(By.xpath(".//div[@class='Dropdown-menu']/div[text()='" + userPeriod + "']")).click();

        driver.findElement(isBlackCheckbox).click();
        driver.findElement(isGreyCheckbox).click();

        driver.findElement(commentField).click();
        driver.findElement(commentField).sendKeys(userComment);
        driver.findElement(buttonOrder).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(buttonYes).click();
    }
    public void getOrderCompletedConfirmation() {
        String elementText = driver.findElement(By.xpath(".//div[contains(text(),'Заказ оформлен')]")).getText();
        System.out.println(elementText);
        if (elementText.contains("Заказ оформлен")) {
            System.out.println("Right!");
        }
        else System.out.println("Wrong!");
    }
}
