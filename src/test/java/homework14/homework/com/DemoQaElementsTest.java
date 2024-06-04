package homework14.homework.com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoQaElementsTest {

    private static final By ELEMENTS_CARD = By.xpath("//div[@class='card-body']/h5[text()='Elements']");
    private static final By CHECK_BOX_MENU_ITEM = By.id("item-1");
    private static final By CHECK_BOX_TITLE = By.className("text-center");
    private static final By HOME_CHECK_BOX = By.className("rct-checkbox");
    private static final By HOME_CHECK_BOX_RESULT = By.id("result");
    private static final String EXPECTED_MESSAGE_HOME_CHECK_BOX = "You have selected :\n" + "home\n" + "desktop\n" +
            "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" +
            "public\n" + "private\n" + "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile";
    private static final By BUTTONS_MENU_ITEM = By.id("item-4");
    private static final By DOUBLE_CLICK_BUTTON = By.id("doubleClickBtn");
    private static final By MESSAGE_DOUBLE_CLICK_BUTTON = By.id("doubleClickMessage");
    private static final String EXPECTED_MESSAGE_DOUBLE_CLICK_BUTTON = "You have done a double click";
    private static final By RIGHT_CLICK_BUTTON = By.id("rightClickBtn");
    private static final By MESSAGE_RIGHT_CLICK_BUTTON = By.id("rightClickMessage");
    private static final String EXPECTED_MESSAGE_RIGHT_CLICK_BUTTON = "You have done a right click";
    private static final By LINKS_MENU_ITEM = By.id("item-5");
    private static final By NOT_FOUND_LINK = By.id("invalid-url");
    private static final By MESSAGE_NOT_FOUND_LINK = By.id("linkResponse");
    private static final String EXPECTED_MESSAGE_NOT_FOUND_LINK = "Link has responded with staus 404 and status text Not Found";
    private static final By WEB_TABLES_MENU_ITEM = By.id("item-3");
    private static final By ADD_NEW_RECORD_BUTTON = By.id("addNewRecordButton");
    private static final By PERMANENT_FIRST_NAME = By.id("firstName");
    private static final String FIRST_NAME = "Thomas";
    private static final By PERMANENT_LAST_NAME = By.id("lastName");
    private static final String LAST_NAME = "Andersen";
    private static final By PERMANENT_USER_EMAIL = By.id("userEmail");
    private static final String USER_EMAIL = "andersen@gmail.com";
    private static final By PERMANENT_USER_AGE = By.id("age");
    private static final String USER_AGE = "34";
    private static final By PERMANENT_SALARY = By.id("salary");
    private static final String SALARY = "55000";
    private static final By PERMANENT_DEPARTMENT = By.id("department");
    private static final String DEPARTMENT = "qa automation";
    private static final By SUBMIT_NEW_RECORD_TABLE_BUTTON = By.id("submit");
    private static final By ADDED_RECORD = By.cssSelector("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div");
    private static final String EXPECTED_ADDED_RECORD = "Thomas\n" + "Andersen\n" + "34\n" + "andersen@gmail.com\n" + "55000\n" + "qa automation";

    WebDriver driver;
    @Test
    void checkBoxTest() {
        WebElement checkBoxMenuItem = driver.findElement(CHECK_BOX_MENU_ITEM);
        checkBoxMenuItem.click();

        WebElement textBoxTitle = driver.findElement(CHECK_BOX_TITLE);
        String actualText = textBoxTitle.getText();
        assertEquals("Check Box", actualText);

        WebElement homeCheckBox = driver.findElement(HOME_CHECK_BOX);
        homeCheckBox.click();

        WebElement homeCheckBoxResult = driver.findElement(HOME_CHECK_BOX_RESULT);
        String actualTextResult = homeCheckBoxResult.getText();
        assertEquals(EXPECTED_MESSAGE_HOME_CHECK_BOX, actualTextResult);
    }

    @Test
    void buttonDoubleClickTest() {
        WebElement buttonsMenuItem = driver.findElement(BUTTONS_MENU_ITEM);
        buttonsMenuItem.click();

        WebElement doubleClickButton = driver.findElement(DOUBLE_CLICK_BUTTON);
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement messageDoubleClickButton = driver.findElement(MESSAGE_DOUBLE_CLICK_BUTTON);
        String actualMessageDoubleClickButton = messageDoubleClickButton.getText();
        assertEquals(EXPECTED_MESSAGE_DOUBLE_CLICK_BUTTON, actualMessageDoubleClickButton);
    }

    @Test
    void buttonRightClickTest() {
        WebElement buttonsMenuItem = driver.findElement(BUTTONS_MENU_ITEM);
        buttonsMenuItem.click();

        WebElement rightClickButton = driver.findElement(RIGHT_CLICK_BUTTON);
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).perform();

        WebElement messageRightClickButton = driver.findElement(MESSAGE_RIGHT_CLICK_BUTTON);
        String actualMessageRightClickButton = messageRightClickButton.getText();
        assertEquals(EXPECTED_MESSAGE_RIGHT_CLICK_BUTTON, actualMessageRightClickButton);
    }

    @Test
    void notFoundLinkTest(){
        WebElement linksMenuItem = driver.findElement(LINKS_MENU_ITEM);
        linksMenuItem.click();

        WebElement notFoundLink = driver.findElement(NOT_FOUND_LINK);
        notFoundLink.click();

        WebElement messageNotFoundLink = driver.findElement(MESSAGE_NOT_FOUND_LINK);
        String actualMessageNotFoundLink = messageNotFoundLink.getText();
        assertEquals(EXPECTED_MESSAGE_NOT_FOUND_LINK, actualMessageNotFoundLink);
    }

    @Test
    void webTablesTest(){
        WebElement webTablesMenuItem = driver.findElement(WEB_TABLES_MENU_ITEM);
        webTablesMenuItem.click();

        WebElement addNewRecordButton = driver.findElement(ADD_NEW_RECORD_BUTTON);
        addNewRecordButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement permanentFirstName = driver.findElement(PERMANENT_FIRST_NAME);
        permanentFirstName.sendKeys(FIRST_NAME);

        WebElement permanentLastName = driver.findElement(PERMANENT_LAST_NAME);
        permanentLastName.sendKeys(LAST_NAME);

        WebElement permanentUserEmail = driver.findElement(PERMANENT_USER_EMAIL);
        permanentUserEmail.sendKeys(USER_EMAIL);

        WebElement permanentUserAge = driver.findElement(PERMANENT_USER_AGE);
        permanentUserAge.sendKeys(USER_AGE);

        WebElement permanentSalary = driver.findElement(PERMANENT_SALARY);
        permanentSalary.sendKeys(SALARY);

        WebElement permanentDepartment = driver.findElement(PERMANENT_DEPARTMENT);
        permanentDepartment.sendKeys(DEPARTMENT);

        WebElement addSubmitNewRecordTableButton = driver.findElement(SUBMIT_NEW_RECORD_TABLE_BUTTON);
        addSubmitNewRecordTableButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement addedRecord = driver.findElement(ADDED_RECORD);
        String actualRecordTable = addedRecord.getText();
        assertEquals(EXPECTED_ADDED_RECORD, actualRecordTable);
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement elementsCard = driver.findElement(ELEMENTS_CARD);
        elementsCard.click();
    }

    @AfterEach
    void cleanup() {
        driver.quit();
    }
}