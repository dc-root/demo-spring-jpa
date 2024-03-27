package me.dcdev.demobasedatajpa.repository;

import me.dcdev.demobasedatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
