package com.bijanghanei.registrationservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "users")
public class BotUser {
    @Id
    private Long chatId;
    private String username;
    private String firstName;
    private String lastName;
    private Timestamp registeredAt;
}
