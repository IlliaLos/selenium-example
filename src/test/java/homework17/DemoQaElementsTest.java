package homework17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DemoQaElementsTest extends BaseTest {

    private static final String EXPECTED_BUTTON_CLICK_MESSAGE = "You have done a dynamic click";
    private static final String EXPECTED_DOUBLE_CLICK_BUTTON_MESSAGE = "You have done a double click";
    private static final String EXPECTED_RIGHT_CLICK_BUTTON_MESSAGE = "You have done a right click";
    private static final String EXPECTED_CHECK_BOX_TITLE = "Check Box";
    private static final String EXPECTED_HOME_CHECK_BOX_MESSAGE = "You have selected :\n" + "home\n" + "desktop\n" +
            "notes\n" + "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" +
            "public\n" + "private\n" + "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile";
    private static final String EXPECTED_CREATED_LINK_MESSAGE = "Link has responded with staus 201 and status text Created";
    private static final String EXPECTED_NO_CONTENT_LINK_MESSAGE = "Link has responded with staus 204 and status text No Content";
    private static final String EXPECTED_MOVED_LINK_MESSAGE = "Link has responded with staus 301 and status text Moved Permanently";
    private static final String EXPECTED_BAD_REQUEST_LINK_MESSAGE = "Link has responded with staus 400 and status text Bad Request";
    private static final String EXPECTED_UNAUTHORIZED_LINK_MESSAGE = "Link has responded with staus 401 and status text Unauthorized";
    private static final String EXPECTED_FORBIDDEN_LINK_MESSAGE = "Link has responded with staus 403 and status text Forbidden";
    private static final String EXPECTED_NOT_FOUND_LINK_MESSAGE = "Link has responded with staus 404 and status text Not Found";

    MainPage mainPage;
    SideMenuBar sideMenuBar;
    ButtonsPage buttonsPage;
    CheckBoxPage checkBoxPage;
    LinksPage linksPage;

    @BeforeEach
    void precondition() {
        driver.get(appProperties.getBaseUrl());
        mainPage = new MainPage(driver);
        sideMenuBar = new SideMenuBar(driver);
        buttonsPage = new ButtonsPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        linksPage = new LinksPage(driver);

        mainPage.clickElementsCard();
    }

    @Test
    void buttonDoubleClickTest() {
        sideMenuBar.clickButtonsMenuItem();

        buttonsPage.clickOnDoubleClickMeButton();

        String actualMessageDoubleClickButton = buttonsPage.getAfterDoubleClickMessage();
        assertEquals(EXPECTED_DOUBLE_CLICK_BUTTON_MESSAGE, actualMessageDoubleClickButton);
    }

    @Test
    void buttonRightClickTest() {
        sideMenuBar.clickButtonsMenuItem();

        buttonsPage.clickOnRightClickMeButton();

        String actualMessageRightClickButton = buttonsPage.getAfterRightClickMessage();
        assertEquals(EXPECTED_RIGHT_CLICK_BUTTON_MESSAGE, actualMessageRightClickButton);
    }

    @Test
    void buttonClickTest() {
        sideMenuBar.clickButtonsMenuItem();

        buttonsPage.clickOnClickMeButton();

        String actualMessageClickButton = buttonsPage.getAfterClickMessage();
        assertEquals(EXPECTED_BUTTON_CLICK_MESSAGE, actualMessageClickButton);
    }

    @Test
    void checkBoxTest() {
        sideMenuBar.clickCheckBoxMenuItem();

        String actualTextBoxTitle = checkBoxPage.getCheckBoxTitle();
        assertEquals(EXPECTED_CHECK_BOX_TITLE, actualTextBoxTitle);

        checkBoxPage.clickOnCheckBox();

        String actualTextResult = checkBoxPage.getAfterClickOnCheckBoxMessage();
        assertEquals(EXPECTED_HOME_CHECK_BOX_MESSAGE, actualTextResult);
    }

    @Test
    void createdLinkTest(){
        sideMenuBar.clickLinksMenuItem();

        linksPage.clickOnCreatedLink();

        String actualCreatedLinkMessage = linksPage.getLinkMessage();
        assertEquals(EXPECTED_CREATED_LINK_MESSAGE, actualCreatedLinkMessage);
    }

    @Test
    void noContentLinkTest(){
        sideMenuBar.clickLinksMenuItem();

        linksPage.clickOnNoContentLink();

        String actualNoContentLinkMessage = linksPage.getLinkMessage();
        assertEquals(EXPECTED_NO_CONTENT_LINK_MESSAGE, actualNoContentLinkMessage);
    }

    @Test
    void movedLinkTest(){
        sideMenuBar.clickLinksMenuItem();

        linksPage.clickOnMovedLink();

        String actualMovedLinkMessage = linksPage.getLinkMessage();
        assertEquals(EXPECTED_MOVED_LINK_MESSAGE, actualMovedLinkMessage);
    }

    @Test
    void badRequestLinkTest(){
        sideMenuBar.clickLinksMenuItem();

        linksPage.clickOnBadRequestLink();

        String actualBadRequestLinkMessage = linksPage.getLinkMessage();
        assertEquals(EXPECTED_BAD_REQUEST_LINK_MESSAGE, actualBadRequestLinkMessage);
    }

    @Test
    void unauthorizedLinkTest(){
        sideMenuBar.clickLinksMenuItem();

        linksPage.clickOnUnauthorizedLink();

        String actualUnauthorizedLinkMessage = linksPage.getLinkMessage();
        assertEquals(EXPECTED_UNAUTHORIZED_LINK_MESSAGE, actualUnauthorizedLinkMessage);
    }

    @Test
    void forbiddenLinkTest(){
        sideMenuBar.clickLinksMenuItem();

        linksPage.clickOnForbiddenLink();

        String actualForbiddenLinkMessage = linksPage.getLinkMessage();
        assertEquals(EXPECTED_FORBIDDEN_LINK_MESSAGE, actualForbiddenLinkMessage);
    }

    @Test
    void notFoundLinkTest(){
        sideMenuBar.clickLinksMenuItem();

        linksPage.clickOnNotFoundLink();

        String actualNotFoundLinkMessage = linksPage.getLinkMessage();
        assertEquals(EXPECTED_NOT_FOUND_LINK_MESSAGE, actualNotFoundLinkMessage);
    }
}