package com.bijanghanei.registrationservice.controller;

import com.bijanghanei.registrationservice.entity.BotUser;
import com.bijanghanei.registrationservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration-service")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/{id}")
    public BotUser getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @GetMapping("/users")
    public List<BotUser> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/add")
    public void addUser(@RequestBody BotUser botUser){
        System.out.println("i received a request");
        userService.add(botUser);
    }
}
