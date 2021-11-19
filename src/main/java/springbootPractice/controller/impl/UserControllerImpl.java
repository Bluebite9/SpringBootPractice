package springbootPractice.controller.impl;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springbootPractice.controller.UserController;
import springbootPractice.model.User;
import springbootPractice.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
public class UserControllerImpl implements UserController {

    private final UserService userService;

    UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.create(user));
    }

    @Override
    @GetMapping("/findAll")
    public ResponseEntity<Iterable<User>> findAllUsers() {
        return ResponseEntity.ok(userService.findAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findUserById(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.findById(id));
    }
}
