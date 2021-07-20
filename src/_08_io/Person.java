package _08_io;

import java.io.Serializable;

public class Person implements Serializable {

    private String fullName;
    private transient String password;
    private char gender;

    public Person() {
    }

    public Person(String fullName, String password, char gender) {
        this.fullName = fullName;
        this.password = password;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
