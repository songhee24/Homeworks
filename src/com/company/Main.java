package com.company;

import com.company.models.DBUser;
import com.company.models.Database;
import com.company.models.User;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    static DBUser DB = new DBUser();
    static Scanner scanner = new Scanner(System.in);
    static String pass = scanner.nextLine();
    public static void main(String[] args) throws SQLException {

        User user = new User("erkin",pass,"emalkkk@gmail.com");
//        register(user);
          login(user.getLogin(),user.getPassword());
    }


    static void register(User user){
        if (DB.addUser(user)) System.out.println("Register success");
        else System.out.println("Register failed");
    }

    static void login(String login,String password){
        User user = DB.getUserBylogin(login);
        if (user == null){
            System.out.println(Status.FAIL + " Login or password is incorrect ");
            return;
        }
        String userRemotePassword = DB.takePassById(user.getId());
        System.out.println(pass + " locale");
        System.out.println(userRemotePassword + " remote");
        if (userRemotePassword.equals(pass)) {
            System.out.println(Status.FAIL + " Password is incorrect");
            return;
        }
        if (pass.equals(password)){
            DB.loginUser(user.getId(),"ok");
            System.out.println(Status.OK + " Authorization successful");
        }
}

}

enum Status {
    FAIL,
    OK;
   }
