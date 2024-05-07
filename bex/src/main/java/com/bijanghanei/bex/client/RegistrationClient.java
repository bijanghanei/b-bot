package com.bijanghanei.bex.client;

import com.bijanghanei.bex.external.BotUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "reg-client", url = "http://localhost:8081/registration-service")
public interface RegistrationClient {
    @PostMapping("/add")
    void addUser(@RequestBody BotUser botUser);

    @GetMapping("/{id}")
    BotUser getUserById(@PathVariable Long id);
}
