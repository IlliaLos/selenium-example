package homework17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends BasePage {

    private static final By DOUBLE_CLICK_ME_BUTTON = By.id("doubleClickBtn");
    private static final By MESSAGE_DOUBLE_CLICK_ME_BUTTON = By.id("doubleClickMessage");
    private static final By RIGHT_CLICK_ME_BUTTON = By.id("rightClickBtn");
    private static final By MESSAGE_RIGHT_CLICK_ME_BUTTON = By.id("rightClickMessage");
    private static final By CLICK_ME_BUTTON = By.xpath("//button[text()='Click Me']");
    private static final By CLICK_ME_BUTTON_MESSAGE = By.id("dynamicClickMessage");

    WebDriver driver;

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnDoubleClickMeButton() {
        WebElement doubleClickMeButton = driver.findElement(DOUBLE_CLICK_ME_BUTTON);
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickMeButton).perform();
    }

    public String getAfterDoubleClickMessage() {
        WebElement doubleClickMeButtonMessage = driver.findElement(MESSAGE_DOUBLE_CLICK_ME_BUTTON);
        return doubleClickMeButtonMessage.getText();
    }

    public void clickOnRightClickMeButton() {
        WebElement rightClickMeButton = driver.findElement(RIGHT_CLICK_ME_BUTTON);
        Actions action = new Actions(driver);
        action.contextClick(rightClickMeButton).perform();
    }

    public String getAfterRightClickMessage() {
        WebElement rightClickMeButtonMessage = driver.findElement(MESSAGE_RIGHT_CLICK_ME_BUTTON);
        return rightClickMeButtonMessage.getText();
    }

    public void clickOnClickMeButton() {
        WebElement clickMeButton = driver.findElement(CLICK_ME_BUTTON);
        clickMeButton.click();
    }

    public String getAfterClickMessage() {
        WebElement clickMeButtonMessage = driver.findElement(CLICK_ME_BUTTON_MESSAGE);
        return clickMeButtonMessage.getText();
    }
}
