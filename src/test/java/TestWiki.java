import configuretions.BaseClass;
import data.WIKILanguage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class TestWiki extends BaseClass {
        WIKIPage wikiPage;
    @Test(dataProvider = "getLangueges",dataProviderClass = Wikidata.class)
    public void testwikiLang(String lang,String abrakadabra) {
        ResourceBundle bundle=ResourceBundle.getBundle(lang);
        driver.get("https://"+lang+".wikipedia.org/");
        wikiPage= PageFactory.initElements(driver,WIKIPage.class);
        Assert.assertEquals(wikiPage.getmenuTab1text(),bundle.getString("menutab1"));

    }
}
