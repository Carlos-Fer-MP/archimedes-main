package com.archimedes.main.apirest.users.adapters;

import com.archimedes.main.application.users.ports.input.UserService;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @DeleteMapping("/delete/{userId}")
    public void deleteUserById(@PathVariable("userId") Long userId) { userService.deleteById(userId); }

    @PostMapping("/create")
    public void createUser(UsersDTO user) { userService.create(user); }

    @GetMapping("/list")
    public List<UsersDTO> list() { return userService.list(); }

    @GetMapping("/get/{userId}")
    public UsersDTO getUserById(@PathVariable("userId") Long userId) { return userService.findById(userId); }

    @GetMapping("/get/{veteranType}")
    public List<UsersDTO> getUsersByVeteranType(@PathVariable("veteranType") String veteranType) {
       return userService.findByVeteranType(veteranType);
    }
}
