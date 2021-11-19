package springbootPractice.service;

import springbootPractice.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findById(int id);

    Iterable<User> findAll();

    User create(User user);

}
