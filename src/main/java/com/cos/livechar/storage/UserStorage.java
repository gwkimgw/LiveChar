package com.cos.livechar.storage;


import java.util.HashSet;
import java.util.Set;

public class UserStorage {
    private static UserStorage instance;
    private Set<String> users;

    private UserStorage() {
        users = new HashSet<>();
    }

    public static synchronized UserStorage getInstance() {
        if(instance==null) {
            instance = new UserStorage();
        }
        return instance;
    }

    public void setUser(String username) throws Exception {
        if(users.contains(username)){
            throw new Exception("user exists!" + username);
        }
        users.add(username);
    }
}
