package com.veho;

import java.util.Collection;
import java.util.HashMap;

public class UserServiceMapImpl implements UserService {

    private HashMap<String, User> userMap;

    private UserServiceMapImpl() {
        userMap = new HashMap<>();
    }
    @Override
    public void addUser(User user) {

        userMap.put(user.getId(), user);
    }

    @Override
    public Collection<User> getUsers() {
        return userMap.values();
    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public User editUser(User user) throws Exception {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public boolean existUser(String id) {
        return false;
    }
}
