package entity;

public class User {
    private String nickname;
    private String password;
    private boolean isAdmin;
    private String eMail;

    public User(String nickname, String password, boolean isAdmin, String eMail) {
        this.nickname = nickname;
        this.password = password;
        this.isAdmin = isAdmin;
        this.eMail = eMail;
    }

    public User() {
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String geteMail() {
        return eMail;
    }
}
