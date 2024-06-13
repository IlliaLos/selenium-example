package homework17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends BasePage {

    private static final By CHECK_BOX_TITLE = By.className("text-center");
    private static final By HOME_CHECK_BOX = By.className("rct-checkbox");
    private static final By HOME_CHECK_BOX_RESULT = By.id("result");

    WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCheckBoxTitle() {
        WebElement checkBoxTitle = driver.findElement(CHECK_BOX_TITLE);
        return checkBoxTitle.getText();
    }

    public void clickOnCheckBox() {
        WebElement clickOnCheckBox = driver.findElement(HOME_CHECK_BOX);
        clickOnCheckBox.click();
    }

    public String getAfterClickOnCheckBoxMessage() {
        WebElement afterClickOnCheckBoxMessage = driver.findElement(HOME_CHECK_BOX_RESULT);
        return afterClickOnCheckBoxMessage.getText();
    }
}
