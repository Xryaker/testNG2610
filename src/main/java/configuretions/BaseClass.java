package configuretions;


import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public static WebDriver driver;
@TmsLink("https://www.youtube.com/watch?v=ct15n6_ppmY&list=RDGMEMQ1dJ7wXfLlqCjwV0xfSNbAVMVbtpm23ucw4&index=2")
    @BeforeClass
    public static void createDriver() {
        System.out.println("BEFORE BASECLASS");
        driver = DriverConfig.create(BROWSERS.CHROMEINCOGNITO);

    }

    @AfterClass
    public static void after() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("AFTER BASECLASS");
//        System.out.println(driver.getCurrentUrl());
            driver.quit();
    }
}
