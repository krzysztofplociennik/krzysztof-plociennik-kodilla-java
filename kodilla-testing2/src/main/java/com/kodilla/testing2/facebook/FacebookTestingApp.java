package com.kodilla.testing2.facebook;
import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"5k\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"5k\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"5k\")]/span/span/select[3]";


    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement firstnameField = driver.findElement(By.name("firstname"));
        firstnameField.sendKeys("Jan");
        WebElement lastnameField = driver.findElement(By.name("lastname"));
        lastnameField.sendKeys("Kowalski");
        WebElement emailField = driver.findElement(By.name("reg_email__"));
        emailField.sendKeys("jankowal@gmail.com");

        while (!driver.findElement(By.name("reg_email_confirmation__")).isDisplayed());

        WebElement emailConfirmationField = driver.findElement(By.name("reg_email_confirmation__"));
        emailConfirmationField.sendKeys("jankowal@gmail.com");

        WebElement passwordField = driver.findElement(By.name("reg_passwd__"));
        passwordField.sendKeys("password");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDayBoard = new Select(selectDay);
        selectDayBoard.selectByIndex(16);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonthBoard = new Select(selectMonth);
        selectMonthBoard.selectByIndex(4);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYearBoard = new Select(selectYear);
        selectYearBoard.selectByIndex(62);

        WebElement genderCheck = driver.findElement(By.id("u_0_7"));
        genderCheck.click();
    }
}
