package model;

import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable {
    private String position;
    private String userName;
    private String passWord;
    private String accuracy;

    public Account() {

    }

    public Account(String position, String userName, String passWord, String accuracy) {
        this.position = position;
        this.userName = userName;
        this.passWord = passWord;
        this.accuracy = accuracy;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return position + ";" + userName + ";" + passWord + ";" + accuracy + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return position == account.position && userName.equals(account.userName) && passWord.equals(account.passWord) && accuracy.equals(account.accuracy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, passWord, position, accuracy);
    }
}
