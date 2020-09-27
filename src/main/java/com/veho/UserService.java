package com.veho;

import java.util.Collection;

public interface UserService {

    public void addUser(User user);

    public Collection<User> getUsers();

    public User getUser(String id);

    public User editUser(User user) throws Exception;

    public void deleteUser(String id);

    public boolean existUser(String id);
}
