package com.viola.userserver.config;

import com.viola.userserver.model.UserCredential;
import com.viola.userserver.repository.CredentialRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AppConfiguration {
    @Bean
    public CommandLineRunner prepareCredentialRepository(CredentialRepository credentialRepository) {
        return args -> {
            log.info("User Server started!");
            log.info("\n------> Into database added={}", credentialRepository.save(new UserCredential("admin", "pass")));
            log.info("\n------> Into database added={}", credentialRepository.save(new UserCredential("user", "nopass")));
        };
    }
}
