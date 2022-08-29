package com.viola.userserver.config;

import com.viola.userserver.model.User;
import com.viola.userserver.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AppConfiguration {
    @Bean
    public CommandLineRunner prepareCredentialRepository(UserRepository userRepository) {
        return args -> {
            log.info("User Server started!");
            log.info("\n------> Into database added={}", userRepository.save(new User("admin", "pass")));
            log.info("\n------> Into database added={}", userRepository.save(new User("user", "nopass")));
        };
    }
}
