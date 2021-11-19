package springbootPractice.controller;

import org.springframework.http.ResponseEntity;
import springbootPractice.model.User;

import java.util.Optional;

public interface UserController {

    ResponseEntity<User> createUser(User user);

    ResponseEntity<Iterable<User>> findAllUsers();

    ResponseEntity<Optional<User>> findUserById(Integer id);
}
