package com.bijanghanei.registrationservice.repository;

import com.bijanghanei.registrationservice.entity.BotUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BotUser,Long> {
}
