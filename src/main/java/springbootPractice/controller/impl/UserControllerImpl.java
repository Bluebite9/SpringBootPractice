package springbootPractice.controller.impl;


import org.springframework.http.ResponseEntity;
import springbootPractice.controller.UserController;
import springbootPractice.model.User;

public class UserControllerImpl implements UserController {
    @Override
    public ResponseEntity<User> createUser(User user) {
        return null;
    }

    @Override
    public ResponseEntity<User[]> findAllUsers() {
        return null;
    }

    @Override
    public ResponseEntity<User> findUserById(Integer id) {
        return null;
    }
}
