package com.bijanghanei.bex.external;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class BotUser {
    private Long chatId;
    private String username;
    private String firstName;
    private String lastName;
    private Timestamp registeredAt;
}
