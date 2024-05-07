package com.bijanghanei.registrationservice.service;

import com.bijanghanei.registrationservice.entity.BotUser;
import com.bijanghanei.registrationservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void add(BotUser botUser) {
        BotUser user = userRepository.findById(botUser.getChatId()).orElse(null);
        System.out.println("i know that i should NOT save user");
        if (user == null){
            System.out.println("i know that i should save user");
            userRepository.save(botUser);
        }
    }

    @Override
    public BotUser getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<BotUser> getUsers() {
        return userRepository.findAll();
    }
}
