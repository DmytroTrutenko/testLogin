package com.sawebDevSauledev.logIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class LoginTestPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginTestPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//input[@placeholder ='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder ='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement buttonLogIn;

    private By h3Text = By.xpath("//h3[contains(text(),'We are sorry')]");


    public void open() {
        driver.get("https://saweb.dev.sauledev.com/en");
    }

    public void getStarted() {
        //create a unique login and password
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        String login = "Kessel" + n;
        String pass = "qwerty" + n + "qwerty";

        username.sendKeys(login);
        password.sendKeys(pass);
        buttonLogIn.click();
        //after sendKeys and wrong login-password, we'll see this h3.
        wait.until(ExpectedConditions.visibilityOfElementLocated(h3Text));
    }

}
