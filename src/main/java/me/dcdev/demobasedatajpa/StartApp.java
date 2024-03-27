package me.dcdev.demobasedatajpa;

import me.dcdev.demobasedatajpa.model.User;
import me.dcdev.demobasedatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository user_repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        user.setNome("Diego C. Silva");
        user.setUsername("dcdevs");
        user.setPassword("98998523");

        user_repository.save(user);

        for (User u : user_repository.findAll()) {
            System.out.println(u);
        }
    }
}
