package model;

public class User {

    private String fullname, nickname, email, password;
    private String userType;

    public User(String fullname, String nickname, String email, String password) {
        this.fullname = fullname;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.userType = "Free";
    }

    public String getFullname() {
        return fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
