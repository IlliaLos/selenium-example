package homework17;

import com.demoqa.ConfigFileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static com.demoqa.ConfigFileReader.getConfigFileReader;

public abstract class BaseTest {

    ConfigFileReader appProperties = getConfigFileReader();
    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }

    @AfterEach
    void cleanup() {
        driver.quit();
    }
}
