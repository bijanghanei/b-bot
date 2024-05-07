package com.bijanghanei.registrationservice.service;

import com.bijanghanei.registrationservice.entity.BotUser;

import java.util.List;

public interface UserService {
    void add(BotUser botUser);
    BotUser getUserById(Long id);
    List<BotUser> getUsers();
}
