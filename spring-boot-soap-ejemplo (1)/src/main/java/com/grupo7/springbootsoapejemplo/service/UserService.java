package com.grupo7.springbootsoapejemplo.service;

import com.grupo7.spring_boot_soap_ejemplo.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User user1 = new User();
        user1.setName("Emily");
        user1.setEdad(21);
        user1.setSigno("Tauro");

        User user2 = new User();
        user2.setName("Jean");
        user2.setEdad(22);
        user2.setSigno("Piscis");

        User user3 = new User();
        user3.setName("Carlos");
        user3.setEdad(21);
        user3.setSigno("Leo");

        users.put(user1.getName(), user1);
        users.put(user2.getName(), user2);
        users.put(user3.getName(), user3);
    }


    public User getUsers(String name) {
        return users.get(name);
    }
}