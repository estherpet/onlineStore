package com.example.queenie.repoTest;

import com.example.queenie.QueenieApplication;
import data.models.User;
import data.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ComponentScan
@ContextConfiguration(classes = QueenieApplication.class)
@EnableAutoConfiguration
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void saveUserTest() {
        userRepository.save(User.builder().
                name("queenie").
                password("timmy").
                userName("esther").
                Email("esther@gmail.com").
                phoneNumber("09160552516").build());

        userRepository.save(User.builder().
                name("divine").
                password("faith").
                userName("hillary").
                Email("peter@gmail.com").
                phoneNumber("09060552518").build());
        Optional<User> user = userRepository.findByEmail("peter@gmail.com");
        assertThat(user).isNotNull();
    }
}