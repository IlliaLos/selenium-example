package homework16;

import com.demoqa.NonStaticConfigFileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeDemoQaTest {

    private static final By ELEMENTS_FRAME_AND_WINDOWS_CARD = By.xpath("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']");
    private static final By ALERT_MENU_ITEM = By.xpath("//span[text()='Alerts']");
    private static final By TIMER_ALLERT_BUTTON = By.id("timerAlertButton");
    private static final String EXPECTED_ALLERT_TEXT = "This alert appeared after 5 seconds";
    private static final By FRAMES_MENU_ITEM = By.xpath("//span[text()='Frames']");
    private static final By SMALL_IFRAME = By.id("frame2");
    private static final By HEADER = By.id("sampleHeading");
    private static final String EXPECTED_SMALL_IFRAME_TEXT = "This is a sample page";

    WebDriver driver;

    @Test
    void timerAllertButtonTest() {
        WebElement alertsFrameAndWindowsCard = driver.findElement(ELEMENTS_FRAME_AND_WINDOWS_CARD);
        alertsFrameAndWindowsCard.click();

        WebElement alertsMenuItem = driver.findElement(ALERT_MENU_ITEM);
        alertsMenuItem.click();

        WebElement timerAllertButton = driver.findElement(TIMER_ALLERT_BUTTON);
        new Actions(driver)
                .click(timerAllertButton)
                .pause(Duration.ofSeconds(5))
                .perform();

        Alert alert = driver.switchTo().alert();
        String actualAllertText = alert.getText();
        assertEquals(EXPECTED_ALLERT_TEXT, actualAllertText);
    }

    @Test
    void smallIFrameTest() {
        WebElement alertsFrameAndWindowsCard = driver.findElement(ELEMENTS_FRAME_AND_WINDOWS_CARD);
        alertsFrameAndWindowsCard.click();

        WebElement nestedFramesMenuItem = driver.findElement(FRAMES_MENU_ITEM);
        nestedFramesMenuItem.click();

        WebElement smallIFrame = driver.findElement(SMALL_IFRAME);
        driver.switchTo().frame(smallIFrame);

        WebElement header = driver.findElement(HEADER);
        String smallIFrameText = header.getText();
        assertEquals(EXPECTED_SMALL_IFRAME_TEXT, smallIFrameText);
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        var configFileReader = new NonStaticConfigFileReader();
        driver.get(configFileReader.getBaseUrl());
    }

    @AfterEach
    void cleanup() {
        driver.quit();
    }
}
