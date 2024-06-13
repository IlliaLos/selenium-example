package homework17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMenuBar {

    private static final By TEXT_BOX_MENU_ITEM = By.id("item-0");
    private static final By CHECK_BOX_MENU_ITEM = By.id("item-1");
    private static final By RADIO_BUTTON_MENU_ITEM = By.id("item-2");
    private static final By WEB_TABLES_MENU_ITEM = By.id("item-3");
    private static final By BUTTONS_MENU_ITEM = By.id("item-4");
    private static final By LINKS_MENU_ITEM = By.id("item-5");
    private static final By BROKEN_LINKS_IMAGES_MENU_ITEM = By.id("item-6");
    private static final By UPLOAD_AND_DOWNLOAD_MENU_ITEM = By.id("item-7");
    private static final By DYNAMIC_PROPERTIES_MENU_ITEM = By.id("item-8");

    WebDriver driver;

    public SideMenuBar(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTextBoxMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(TEXT_BOX_MENU_ITEM);
        buttonsMenuItem.click();
    }

    public void clickCheckBoxMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(CHECK_BOX_MENU_ITEM);
        buttonsMenuItem.click();
    }

    public void clickRadioButtonsMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(RADIO_BUTTON_MENU_ITEM);
        buttonsMenuItem.click();
    }

    public void clickWebTablesMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(WEB_TABLES_MENU_ITEM);
        buttonsMenuItem.click();
    }

    public void clickButtonsMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(BUTTONS_MENU_ITEM);
        buttonsMenuItem.click();
    }

    public void clickLinksMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(LINKS_MENU_ITEM);
        buttonsMenuItem.click();
    }

    public void clickBrokenLinksImagesMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(BROKEN_LINKS_IMAGES_MENU_ITEM);
        buttonsMenuItem.click();
    }

    public void clickUploadAndDownloadMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(UPLOAD_AND_DOWNLOAD_MENU_ITEM);
        buttonsMenuItem.click();
    }

    public void clickDynamicPropertiesMenuItem() {
        WebElement buttonsMenuItem = driver.findElement(DYNAMIC_PROPERTIES_MENU_ITEM);
        buttonsMenuItem.click();
    }
}
