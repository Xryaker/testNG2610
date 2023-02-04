import data.DataProvaderUsers;
import data.User;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DataUserProviderEx {
    private static final List<User> usersList = new ArrayList<>();

    static {
        usersList.add(new User());
        usersList.add(new User("Elena", "Ivanova", "kdkjdjd", "78996556", "Female"));

    }

    @DataProvider
    public static Object[][] getDATA() {
        return new Object[][]{
                {new User()},
                {new User("Elena", "Ivanova", "kdkjdjd", "78996556", "Female")}
        };
    }

    @DataProvider
    public static Object[][] convertToOBJECTMATRIX() {
        Object[][] obj = new Object[usersList.size()][1];
        for (int i = 0; i < usersList.size(); i++) {
            obj[i][0] = usersList.get(i);
        }
        return obj;
    }

    @Test(dataProvider = "convertToOBJECTMATRIX")
    public void test(User user) {
        System.out.println(user.getClass().getName());
        System.out.println(user.getEmail());

    }
}
