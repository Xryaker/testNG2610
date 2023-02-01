import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WIKIPage {
    @FindBy(id = "ca-view")
    private WebElement menutab1;
    @FindBy(id = "ca-viewsource")
    WebElement menutab2;
    @FindBy(id = "ca-history")
    WebElement menutab3;

    public String getmenuTab1text(){
        return menutab1.getText();
    }
    public String getmenuTab2text(){
        return menutab2.getText();
    }
    public String getmenuTab3text(){
        return menutab3.getText();
    }
}
