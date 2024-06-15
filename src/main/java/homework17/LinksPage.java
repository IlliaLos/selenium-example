package homework17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage extends BasePage {

    private static final By CREATED_LINK = By.id("created");
    private static final By NO_CONTENT_LINK = By.id("no-content");
    private static final By MOVED_LINK = By.id("moved");
    private static final By BAD_REQUEST_LINK = By.id("bad-request");
    private static final By UNAUTHORIZED_LINK = By.id("unauthorized");
    private static final By FORBIDDEN_LINK = By.id("forbidden");
    private static final By NOT_FOUND_LINK = By.id("invalid-url");
    private static final By LINK_MESSAGE = By.id("linkResponse");

    WebDriver driver;

    public LinksPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCreatedLink() {
        WebElement createdLink = driver.findElement(CREATED_LINK);
        createdLink.click();
    }

    public void clickOnNoContentLink() {
        WebElement noContentLink = driver.findElement(NO_CONTENT_LINK);
        noContentLink.click();
    }

    public void clickOnMovedLink() {
        WebElement movedLink = driver.findElement(MOVED_LINK);
        movedLink.click();
    }

    public void clickOnBadRequestLink() {
        WebElement badRequestLink = driver.findElement(BAD_REQUEST_LINK);
        badRequestLink.click();
    }

    public void clickOnUnauthorizedLink() {
        WebElement unauthorizedLink = driver.findElement(UNAUTHORIZED_LINK);
        unauthorizedLink.click();
    }

    public void clickOnForbiddenLink() {
        WebElement forbiddenLink = driver.findElement(FORBIDDEN_LINK);
        forbiddenLink.click();
    }

    public void clickOnNotFoundLink() {
        WebElement notFoundLink = driver.findElement(NOT_FOUND_LINK);
        notFoundLink.click();
    }

    public String getLinkMessage() {
        WebElement linkMessage = driver.findElement(LINK_MESSAGE);
        return linkMessage.getText();
    }
}
