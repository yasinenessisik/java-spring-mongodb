package com.yasinenessisik.javaspringmongodbrestapi.controller;

import com.yasinenessisik.javaspringmongodbrestapi.entity.User;
import com.yasinenessisik.javaspringmongodbrestapi.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostConstruct
    void init(){
        User user = new User();
        user.setName("Yasin Enes");
        user.setSurname("Şişik");
        userRepository.save(user);
    }
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody
                                            User user){
        return ResponseEntity.ok(userRepository.save(user));
    }
    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
