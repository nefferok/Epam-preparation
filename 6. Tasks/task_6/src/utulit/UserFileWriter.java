package utulit;

import entity.User;
import utulit.PasswordHash;

import java.io.FileWriter;

public class UserFileWriter {

    public static void writeInFile(User user) throws Exception {
        FileWriter writer = new FileWriter("Base Of Users.txt", true);
            writer.write(user.getNickname() + " " + PasswordHash.getSaltedHash(user.getPassword())+" "+ user.isAdmin()
                    +" "+ user.geteMail()+ "\n");
        writer.flush();
    }
}
