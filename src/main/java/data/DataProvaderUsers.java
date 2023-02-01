package data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataProvaderUsers {
    private static List<User> usersList = new ArrayList<>();

    static {
        usersList.add(new User());
        usersList.add(new User("Elena", "Ivanova", "kdkjdjd", "78996556", "Female"));

    }

    //    public static List<User> getUsersList(){
//        return usersList;
//    }
    public static User getValidUser() {
        return new User("Elena", "Ivanova", "kdkjdjd", "78996556", "Female");
    }

    public static User getRandomUser() {
        return usersList.get(new Random().nextInt(usersList.size() - 1));
    }

    @DataProvider
    public Object[][] getUsersList() {
        return new Object[][]{
                {"Cedric","name"},
                {"Anne","Family"},
        };
    }

    @DataProvider
    public Object[][] getUSERS() {
        return new Object[][]{usersList.toArray()};
    }
}
