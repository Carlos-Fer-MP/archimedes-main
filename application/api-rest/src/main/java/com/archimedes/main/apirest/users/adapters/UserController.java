package com.archimedes.main.apirest.users.adapters;

import com.archimedes.main.apirest.users.mappers.UserModelMapper;
import com.archimedes.main.apirest.users.models.UserModel;
import com.archimedes.main.application.users.ports.input.UserService;
import com.archimedes.main.domain.users.dtos.Users;
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
    @Autowired
    private UserModelMapper modelMapper;

    @DeleteMapping("/delete/{userId}")
    public void deleteUserById(@PathVariable("userId") Long userId) { userService.delete(userId); }

    @PostMapping("/create")
    public void createUser(@RequestBody UserModel user) {
        Users userMapping = modelMapper.toDto(user);
        userService.create(userMapping);
    }

    @GetMapping("/list")
    public List<Users> list() { return userService.list(); }

    @GetMapping("/get/{userId}")
    public Users getUserById(@PathVariable("userId") Long userId) { return userService.findById(userId); }

    @GetMapping("/get/{userStatus}")
    public List<Users> getByUserStatus(@PathVariable("userStatus") Boolean userStatus){
        return userService.findByStatus(userStatus);
    }

    @GetMapping("/get/{veteranType}")
    public List<Users> getUsersByVeteranType(@PathVariable("veteranType") String veteranType) {
       return userService.findByVeteranType(veteranType);
    }

    @GetMapping("/get/{currencyType}")
    public List<Users> getUsersByCurrencyType(@PathVariable("currencyType") String currencyType) {
        return userService.findByCurrencyType(currencyType);
    }

    @GetMapping("/get/{groupCategory}")
    public List<Users> getUsersByGroupCategory(@PathVariable("groupCategory") String groupCategory) {
        return userService.findByGroupCategory(groupCategory);
    }

    @GetMapping("/get/{memberType}")
    public List<Users> getUsersByMemberType(@PathVariable("memberType") String memberType) {
        return userService.findByMemberType(memberType);
    }
}
