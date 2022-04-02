package com.viola.credentialserver.config;

import com.viola.credentialserver.model.UserCredential;
import com.viola.credentialserver.repository.CredentialRepository;
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
            log.info("Credential Server started!");
//            log.info("\n------> Into database added={}", credentialRepository.save(new UserCredential("admin", "pass")));
//            log.info("\n------> Into database added={}", credentialRepository.save(new UserCredential("user", "nopass")));
        };
    }
}
