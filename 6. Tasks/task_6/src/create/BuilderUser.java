package create;

import entity.User;

public class BuilderUser {

    private User user;

    public BuilderUser() {
        reset();
    }

    public  void reset(){
        user = new User();
    }

    public void setNickname(String nickName){
        user.setNickname(nickName);
    }

    public void setPassword(String password){
        user.setPassword(password);
    }

    public void isAdmin(boolean isAdmin){
        user.setAdmin(isAdmin);
    }

    public void setEmail(String email){
        user.seteMail(email);
    }

    public User getUser(){
        return user;
    }

}
