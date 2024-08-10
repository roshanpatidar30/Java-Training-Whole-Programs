package com.login.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.login.Entity.User;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	  Optional<User> findByEmail(String email);
}
