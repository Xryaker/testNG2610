import configuretions.BaseClass;
import data.DataProvaderUsers;
import data.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    @Test(dataProvider = "getUsersList",dataProviderClass = DataProvaderUsers.class,priority = 10,timeOut = 2)
    public void peramTest(String arg,String arg2) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(arg);
        System.out.println(arg2);
    }

}
