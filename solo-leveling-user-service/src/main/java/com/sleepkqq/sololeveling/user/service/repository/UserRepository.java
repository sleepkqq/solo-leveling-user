package com.sleepkqq.sololeveling.user.service.repository;

import com.sleepkqq.sololeveling.user.service.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByUsername(String username);
}
