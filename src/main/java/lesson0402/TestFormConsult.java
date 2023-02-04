package lesson0402;

import configuretions.BaseClass;
import data.DataProvaderUsers;
import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

import java.util.List;
@Listeners(MyLisenerForFormConsultation.class)
public class TestFormConsult extends BaseClass {

    @DataProvider
    public static Object[][] getUsers() {
        List<User> usersList = DataProvaderUsers.getUsersList();
        Object[][] obj = new Object[usersList.size()][1];
        for (int i = 0; i < usersList.size(); i++) obj[i][0] = usersList.get(i);
        return obj;
    }

    @BeforeMethod
    public void befor() {
        driver.get("https://dnipro.ithillel.ua/");
        driver.findElement(By.id("btn-consultation-hero")).click();

    }

    @Test(dataProvider = "getUsers",testName = "TestFormDataProvider")
    public void testform(User user) throws InterruptedException {
        FormPage formPage = new FormPage(driver);
        formPage.sentForm(user, Massengers.TELEGRAM, CourseNames.FRONTENDBASIC, true);
        Thread.sleep(1000);
        Assert.assertTrue(formPage.isButtonConfirmEnabled());
    }
}
