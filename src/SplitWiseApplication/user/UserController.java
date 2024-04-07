package SplitWiseApplication.user;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;

    public UserController() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(String userName) {
        for (User user:users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }
}
