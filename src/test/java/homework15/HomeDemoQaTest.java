package homework15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.demoqa.ConfigFileReader.getBaseUrl;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeDemoQaTest {

    private static final By ELEMENTS_CARD = By.xpath("//div[@class='card-body']/h5[text()='Elements']");
    private static final By RADIO_BUTTON_MENU_ITEM = By.id("item-2");
    private static final By RADIO_BUTTON_TITLE = By.className("text-center");
    private static final String EXPECTED_RADIO_BUTTON_TITLE = "Radio Button";
    private static final By YES_RADIO_BUTTON = By.className("custom-control-label");
    private static final By YOU_HAVE_SELECTED = By.className("mt-3");
    private static final String EXPECTED_YOU_HAVE_SELECTED_TEXT = "You have selected Yes";
    private static final By ELEMENTS_FRAME_AND_WINDOWS_CARD = By.xpath("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']");
    private static final By ALERT_MENU_ITEM = By.xpath("//span[text()='Alerts']");
    private static final By CONFIRM_BOX_BUTTON = By.id("confirmButton");
    private static final By CONFIRM_RESULT = By.id("confirmResult");
    private static final String EXPECTED_CONFIRM_RESULT_TEXT = "You selected Ok";
    private static final By WIDGETS_CARD = By.xpath("//div[@class='card-body']/h5[text()='Widgets']");
    private static final By SLIDER_MENU_ITEM = By.xpath("//span[contains(@class, 'text') and text()='Slider']");
    private static final By SLIDER = By.xpath("//div[contains(@class, 'range-slider__tooltip__label')]");
    private static final By SLIDER_TOOLTIP_LABLE = By.className("range-slider__tooltip__label");

    WebDriver driver;

    @Test
    void radioButtonTest(){
        WebElement elementsCard = driver.findElement(ELEMENTS_CARD);
        elementsCard.click();

        WebElement radioButtonMenuItem = driver.findElement(RADIO_BUTTON_MENU_ITEM);
        radioButtonMenuItem.click();

        WebElement radioButtonTitle = driver.findElement(RADIO_BUTTON_TITLE);
        String actualRadioButtonText = radioButtonTitle.getText();
        assertEquals(EXPECTED_RADIO_BUTTON_TITLE, actualRadioButtonText);

        WebElement yesRadioButton = driver.findElement(YES_RADIO_BUTTON);
        Wait <WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(yesRadioButton));
        yesRadioButton.click();

        WebElement youHaveSelected = driver.findElement(YOU_HAVE_SELECTED);
        String actualYouHaveSelectedText = youHaveSelected.getText();
        assertEquals(EXPECTED_YOU_HAVE_SELECTED_TEXT, actualYouHaveSelectedText);
    }

    @Test
    void alertConfirmBoxTest() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement alertsFrameAndWindowsCard = driver.findElement(ELEMENTS_FRAME_AND_WINDOWS_CARD);
        alertsFrameAndWindowsCard.click();

        WebElement alertsMenuItem = driver.findElement(ALERT_MENU_ITEM);
        alertsMenuItem.click();

        WebElement confirmBoxButton = driver.findElement(CONFIRM_BOX_BUTTON);
        confirmBoxButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement confirmResult = driver.findElement(CONFIRM_RESULT);
        String actualConfirmResultText = confirmResult.getText();
        assertEquals(EXPECTED_CONFIRM_RESULT_TEXT, actualConfirmResultText);
    }

    @Test
    void sliderTooltipLableTest() {
        WebElement widgetsCard = driver.findElement(WIDGETS_CARD);
        widgetsCard.click();

        WebElement sliderMenuItem = driver.findElement(SLIDER_MENU_ITEM);
        sliderMenuItem.click();

        WebElement slider = driver.findElement(SLIDER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].mouseover();", slider);

        WebElement sliderTooltipLable = driver.findElement(SLIDER_TOOLTIP_LABLE);
        String actualSliderTooltipLable = sliderTooltipLable.getText();
        assertEquals("25", actualSliderTooltipLable);
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get(getBaseUrl());
    }

    @AfterEach
    void cleanup() {
        driver.quit();
    }
}

