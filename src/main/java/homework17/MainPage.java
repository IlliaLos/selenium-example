package homework17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    private static final By ELEMENTS_CARD = By.xpath("//div[@class='card-body']/h5[text()='Elements']");
    private static final By FORMS = By.xpath("//div[@class='card-body']/h5[text()='Forms']");
    private static final By ALERTS_FRAMES_AND_WINDOWS = By.xpath("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']");
    private static final By WINDERS = By.xpath("//div[@class='card-body']/h5[text()='Widgets']");
    private static final By INTERACTIONS = By.xpath("//div[@class='card-body']/h5[text()='Interactions']");
    private static final By BOOK_STORE_APPLICATIONS = By.xpath("//div[@class='card-body']/h5[text()='Book Store Application']");

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElementsCard() {
        WebElement elementsCard = driver.findElement(ELEMENTS_CARD);
        elementsCard.click();
    }

    public void clickForms() {
        WebElement elementsCard = driver.findElement(FORMS);
        elementsCard.click();
    }

    public void clickAlertsFramesAndWindows() {
        WebElement elementsCard = driver.findElement(ALERTS_FRAMES_AND_WINDOWS);
        elementsCard.click();
    }

    public void clickWinders() {
        WebElement elementsCard = driver.findElement(WINDERS);
        elementsCard.click();
    }

    public void clickInteractions() {
        WebElement elementsCard = driver.findElement(INTERACTIONS);
        elementsCard.click();
    }

    public void clickBookStoreApplications() {
        WebElement elementsCard = driver.findElement(BOOK_STORE_APPLICATIONS);
        elementsCard.click();
    }
}
