package loginroles2.controllers;

import java.util.ArrayList;
import java.util.List;
import loginroles2.exceptions.UnauthorizedException;
import loginroles2.models.Person;
import loginroles2.models.Role;
import loginroles2.models.User;

public class UsersController {

    private static UsersController instance;

    public static UsersController getInstance() {
        if (instance == null) {
            instance = new UsersController();
        }
        return instance;
    }

    public static List<User> usersStorage = new ArrayList<>();
    public static User userAutenticated;

    private UsersController() {

        Person person = new Person("Admin", "");
        User user = new User(
                "admin@admin.com",
                "1234",
                person,
                Role.ROLE_ADMIN
        );

        UsersController.usersStorage.add(user);

    }

    public void login(String email, String password) throws UnauthorizedException {
        User user = null;
        for (User u : UsersController.usersStorage) {
            if (u.getEmail().equals(email) && 
                u.getPassword().equals(password)) {
                user = u;
                break;    
            }
        }
        if(user == null){
            throw new UnauthorizedException();
        }
        UsersController.userAutenticated = user;
    }

}
