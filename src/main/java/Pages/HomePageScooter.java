package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class HomePageScooter {
    private WebDriver driver;
    private final By cookieButton = By.className("App_CookieButton__3cvqF");

    //Вопросы о важном
    private final By Accordion0= By.xpath(".//div[@id='accordion__heading-0']");
    private final By Accordion1= By.xpath(".//div[@id='accordion__heading-1']");
    private final By Accordion2= By.xpath(".//div[@id='accordion__heading-2']");
    private final By Accordion3= By.xpath(".//div[@id='accordion__heading-3']");
    private final By Accordion4= By.xpath(".//div[@id='accordion__heading-4']");
    private final By Accordion5= By.xpath(".//div[@id='accordion__heading-5']");
    private final By Accordion6= By.xpath(".//div[@id='accordion__heading-6']");
    private final By Accordion7= By.xpath(".//div[@id='accordion__heading-7']");
    private final By answerText0 = By.xpath(".//div[@id='accordion__panel-0']");
    private final By answerText1 = By.xpath(".//div[@id='accordion__panel-1']");
    private final By answerText2 = By.xpath(".//div[@id='accordion__panel-2']");
    private final By answerText3 = By.xpath(".//div[@id='accordion__panel-3']");
    private final By answerText4 = By.xpath(".//div[@id='accordion__panel-4']");
    private final By answerText5 = By.xpath(".//div[@id='accordion__panel-5']");
    private final By answerText6 = By.xpath(".//div[@id='accordion__panel-6']");
    private final By answerText7 = By.xpath(".//div[@id='accordion__panel-7']");
    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookieButton(){
        driver.findElement(cookieButton).click();
    }
    public void equalTextAccordion0() {
        driver.findElement(Accordion0).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText0));
        String actualString = driver.findElement(answerText0).getText();
        assertTrue(actualString.contains("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }
    public void equalTextAccordion1() {
        driver.findElement(Accordion1).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText1));
        String actualString = driver.findElement(answerText1).getText();
        assertTrue(actualString.contains("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }
    public void equalTextAccordion2() {
        driver.findElement(Accordion2).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText2));
        String actualString = driver.findElement(answerText2).getText();
        assertTrue(actualString.contains("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }
    public void equalTextAccordion3() {
        driver.findElement(Accordion3).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText3));
        String actualString = driver.findElement(answerText3).getText();
        assertTrue(actualString.contains("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }
    public void equalTextAccordion4() {
        driver.findElement(Accordion4).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText4));
        String actualString = driver.findElement(answerText4).getText();
        assertTrue(actualString.contains("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }
    public void equalTextAccordion5() {
        driver.findElement(Accordion5).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText5));
        String actualString = driver.findElement(answerText5).getText();
        assertTrue(actualString.contains("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }
    public void equalTextAccordion6() {
        driver.findElement(Accordion6).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText6));
        String actualString = driver.findElement(answerText6).getText();
        assertTrue(actualString.contains("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }
    public void equalTextAccordion7() {
        driver.findElement(Accordion7).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(answerText7));
        String actualString = driver.findElement(answerText7).getText();
        assertTrue(actualString.contains("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
}
