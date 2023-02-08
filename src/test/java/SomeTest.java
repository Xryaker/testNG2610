import configuretions.BaseClass;
import data.DataProvaderUsers;
import data.User;
import lesson0402.MyLisenerForFormConsultation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyLisenerForFormConsultation.class)
public class SomeTest extends BaseClass {

    @BeforeClass
    public void beforSomeTest(){
        System.out.println(" start beforSomeTest method");
        driver.get("https://dnipro.ithillel.ua/");
    }
    @BeforeMethod //befor all @Test
    public void beforeM(){
        System.out.println("start beforeM method");
    }
    @Test(description = "first test on testNg",groups = {"@regresion","@Smoke"})
    public void test1() throws Exception {
        System.out.println("TEST NAME TEST1");
       // throw  new Exception("EROOR");

    }
    @Test(dependsOnMethods = {"test1"},alwaysRun = true,groups = {"@First"},priority = 1)
    public void test2(){
        System.out.println("TEST NAME TEST2 "+driver.getCurrentUrl());
    }
    @Test(dataProvider = "convertToOBJECTMATRIX",dataProviderClass = DataProvaderUsers.class,priority = 10)
    public void peramTest(User user) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(user.getEmail());
        System.out.println(user.getLastName());
    }

}
