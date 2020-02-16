package com.sawebDevSauledev.joinNow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;


public class JoinNowTestPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public JoinNowTestPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "join")
    private WebElement joinNow;

    private By divText = By.xpath("//div[contains(text(),'Create Your Account')]");
    private By divText2 = By.xpath("//div[contains(text(),'Welcome To Betolimp')]");

    @FindBy(xpath = "//input[@name ='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//select[@id='region']/option[@value='Gauteng']")
    private WebElement province;

    @FindBy(xpath = "//input[@name ='login']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name ='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name ='phone_number']")
    private WebElement phone_number;

    @FindBy(xpath = "//input[@name ='surname']")
    private WebElement surname;

    @FindBy(xpath = "//select[@id='bday']/option[@value='3']")
    private WebElement bday;

    @FindBy(xpath = "//select[@id='bmonth']/option[@value='12']")
    private WebElement bmonth;

    @FindBy(xpath = "//select[@id='byear']/option[@value='1992']")
    private WebElement byear;

    @FindBy(xpath = "//input[@name ='address']")
    private WebElement address;

    @FindBy(xpath = "//input[@name ='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name ='secretnumber']")
    private WebElement secretnumber;

    @FindBy(xpath = "//input[@id ='confirm']")
    private WebElement checkBox;

    @FindBy(xpath = "//label[@for ='confirm']")
    private WebElement labelCheckbox;

    @FindBy(xpath = "//button[contains(text(),'Create My Account')]")
    private WebElement createMyAcc;


    public void open() {
        driver.get("https://saweb.dev.sauledev.com/en");
    }

    public void getStarted() {
        //create a unique login and password
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        String login = "Kessel" + n;
        String pass = "Qwerty" + n + "qwerty";
        String mail = "test" + n +"@mail.com";

        joinNow.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(divText));

        firstName.sendKeys("Dima");
        province.click();
        userName.sendKeys(login);
        password.sendKeys(pass);
        phone_number.sendKeys("58138525");
        surname.sendKeys("Trutenko");
        bday.click();
        bmonth.click();
        byear.click();
        address.sendKeys("Kivila tn 14");
        email.sendKeys(mail);
        secretnumber.sendKeys("0000");

        labelCheckbox.click();

        createMyAcc.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(divText2));
    }
}
