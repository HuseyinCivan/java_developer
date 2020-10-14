package com.cybertek.core.oop.abstraction.service;

import com.cybertek.core.enums.Gender;
import com.cybertek.core.oop.abstraction.implementation.UserServiceImplementation;
import com.cybertek.core.oop.encapsulation.Role;
import com.cybertek.core.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {


    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike","Smith",new Role(id,"Admin"), Gender.MALE);
        return user.getFirstName()+" "+user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName,"Smith",new Role(5,"Employee"),Gender.MALE);
        return user;
    }
}
