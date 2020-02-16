package joinNow;

import com.sawebDevSauledev.WebDriverSettings;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class JoinNowTest extends WebDriverSettings {
    @Test
    public void joinNowTest() {
        JoinNowTestPage joinNowTestPage = PageFactory.initElements(driver, JoinNowTestPage.class);

        joinNowTestPage.open();
        joinNowTestPage.getStarted();
    }
}
