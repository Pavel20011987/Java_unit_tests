package com.denisstrykov.unit_tests.Unit3.HW3.tdd_user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    private List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate) {
            data.add(user);
        }
    }

    public void removeUser(User user) {
        data.remove(user);
    }

    public void removeUsersExceptAdmin() {
        for (User user : data) {
                if (!(user.isAdmin)) {
                    removeUser(user);
                }
            }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "data=" + data +
                '}';
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
