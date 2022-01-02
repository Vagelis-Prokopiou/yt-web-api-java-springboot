package com.va.users;

import java.util.*;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {
    @GetMapping("/users")
    List<User> all() {
        var users = new ArrayList(1000);
        for (int i = 1; i < 1001; i++) {
            var stringIndex = Integer.toString(i);
            users.add(new User(i, "FirstName" + stringIndex, "LastName" + stringIndex, 25, "Java Spring Boot"));
        }
        return users;
    }
}