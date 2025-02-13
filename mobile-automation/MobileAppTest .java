import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileAppTest {
    public AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        // Set desired capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554"); // Change if using a real device
        caps.setCapability(MobileCapabilityType.APP, "C:\\path\\to\\your\\app.apk"); // Replace with actual APK path
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        // Initialize the AndroidDriver
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
    }

    @Test
    public void testLoginFlow() throws InterruptedException {
        // Locate elements (update with actual element IDs using Appium Inspector)
        MobileElement usernameField = driver.findElementById("com.example.app:id/username");
        MobileElement passwordField = driver.findElementById("com.example.app:id/password");
        MobileElement loginButton = driver.findElementById("com.example.app:id/login");

        // Perform login actions
        usernameField.sendKeys("testuser");
        passwordField.sendKeys("password123");
        loginButton.click();

        // Wait for login to process
        Thread.sleep(3000);

        // Validate login success (update with correct ID)
        MobileElement homeScreen = driver.findElementById("com.example.app:id/home");
        Assert.assertTrue(homeScreen.isDisplayed(), "Login failed!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
