package springchatapp.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/userinfo")
    private ResponseEntity<String> getUserInfo() {
        return ResponseEntity.ok("User Info");
    }
}
