package InventoryorManegementSystem;


import java.util.List;

public class UserController {
    List<User> userList;

    public UserController(List<User> users) {
        this.userList = users;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user){
        userList.remove(user);
    }

    public User getUser(String userId) {
        for (User user:userList) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}

