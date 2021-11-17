package controller;

import model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/users")
public interface UserController {

    @PostMapping("/create")
    ResponseEntity<User> createUser(@RequestBody User user);

    @GetMapping("/findAll")
    ResponseEntity<User[]> findAllUsers();

    @GetMapping("/{id}")
    ResponseEntity<User> findUserById(@PathVariable Integer id);
}
