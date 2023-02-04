package lesson0402;

import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

public class FormPage {
    @FindBy(id = "input-name-consultation")
    WebElement name;
    @FindBy(id = "input-email-consultation")
    WebElement mail;
    @FindBy(id = "input-tel-consultation")
    WebElement tel;
    @FindBy(xpath = "//*[contains(@class,\"socials-input-triggers_btn\") and contains(@class,\"btn-icon-only\")]")
    List<WebElement> messengers;
    @FindBy(id = "listbox-btn-input-course-consultation")
    WebElement courseName;

    @FindBy(className = "listbox_search-input")
    WebElement search;
    @FindBy(className = "checkbox_checkmark")
    WebElement submit;

    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void selectMessenger(Massengers massenger) {
        System.out.println(messengers.size());
        for (WebElement l : messengers) {
            if (l.getAttribute("data-name").equals(massenger.dataName)) {
                l.click();
            }

        }
    }

    private void putCourseName(CourseNames courseNames) {
        courseName.click();
        search.sendKeys(courseNames.getCourseName());
        search.sendKeys(Keys.DOWN);
        search.sendKeys(Keys.ENTER);
    }

    public void sentForm(User user, Massengers massengers, CourseNames courseNames, boolean b) {
        name.sendKeys(user.getName());
        mail.sendKeys(user.getEmail());
        tel.sendKeys(user.getTelephone());
        selectMessenger(massengers);
        putCourseName(courseNames);
        if (b) {
            submit.click();
        }
    }

    public boolean isButtonConfirmEnabled() {
        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//form[@id=\"form-consultation\"]//div[@class=\"form-footer_group\"]/button[@type=\"submit\"and contains(@disabled,\"disabled\") and contains(@class,\"btn\") and contains(@class,\"btn-submit\") and contains(@class,\"form-footer_btn\")and contains(@class,\"-submit\")]"))
                    .isEnabled();
        } catch (Exception e) {
             return true;
        }
        return false;


    }
}
