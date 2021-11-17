package controller.impl;

import controller.UserController;
import model.User;
import org.springframework.http.ResponseEntity;

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
