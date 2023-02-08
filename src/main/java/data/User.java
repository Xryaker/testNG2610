package data;

import io.qameta.allure.Attachment;
import lesson0402.Massengers;

public class User {
    String name, lastName, email, telephone, gender;
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getGender() {
        return gender;
    }



    public User(String name, String lastName, String email, String telephone, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.gender = gender;
    }

    @Override
    @Attachment
    public String toString() {
        return name+" "+email+" "+ telephone;
    }

    public User() {
        this.name = "Vasiliy";
        this.lastName = "Ivanov";
        this.email = "ivanovVasiliy@gmail.com";
        this.telephone = "456678912";
        this.gender = "Male";
    }
}
