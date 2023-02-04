package data;

import org.testng.annotations.DataProvider;

import java.util.*;

public class DataProvaderUsers {
    private static List<User> usersList = new ArrayList<>();

    static {
        usersList.add(new User());
        usersList.add(new User("Elena", "Ivanova", "kdkjdjd", "78996556", "Female"));

    }

        public static List<User> getUsersList(){
        return usersList;
    }
    public static User getValidUser() {
        return new User("Elena", "Ivanova", "kdkjdjd", "78996556", "Female");
    }

    public static User getRandomUser() {
        return usersList.get(new Random().nextInt(usersList.size() - 1));
    }



//    public Object[][] getUsersList() {
//        return convertToOBJECTMATRIX(Collections.singletonList(usersList));
//    }
    @DataProvider
    public static Object[][] convertToOBJECTMATRIX() {
        Object[][] obj = new Object[usersList.size()][1];
        for (int i = 0; i < usersList.size(); i++) obj[i][0] = usersList.get(i);
        return obj;
    }
    @DataProvider
    public Object[][] getUSERS() {
        return new Object[][]{
                {new User()},
                {new User()}
        };
    }

    @DataProvider
    public static Object[][] getUserrsList() {
        Object[] obj = usersList.toArray();

        return new Object[][]{Arrays.stream(obj).toArray()};
    }


}
