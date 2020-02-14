package com.sawebDevSauledev.logIn;

import com.sawebDevSauledev.WebDriverSettings;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;



public class LoginTest extends WebDriverSettings {

    @Test
    public void loginTest() {
        LoginTestPage loginTestPage = PageFactory.initElements(driver, LoginTestPage.class);

        loginTestPage.open();
        loginTestPage.getStarted();
    }
}

