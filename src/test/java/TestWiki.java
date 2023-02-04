import configuretions.BaseClass;
import data.DataProvaderUsers;
import data.User;
import data.WIKILanguage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.ResourceBundle;

public class TestWiki {
        WIKIPage wikiPage;
//    @Test(dataProvider = "getLangueges",dataProviderClass = Wikidata.class)
//    public void testwikiLang(String lang,String abrakadabra) {
//        ResourceBundle bundle=ResourceBundle.getBundle(lang);
//        driver.get("https://"+lang+".wikipedia.org/");
//        wikiPage= PageFactory.initElements(driver,WIKIPage.class);
//        Assert.assertEquals(wikiPage.getmenuTab1text(),bundle.getString("menutab1"));
//
//    }
        @Test(dataProvider = "convertToOBJECTMATRIX",dataProviderClass = DataProvaderUsers.class)
    public void test(User user){
            System.out.println(user.getClass().getName());
            System.out.println(user.getEmail());

        }

}
