package com.example.authentification.security;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/auth/")
public class SecurityController {

    @GetMapping("/protected")
    public String helloSecure() {
        return "Hello Code protected !";
    }

    @GetMapping("/public")
    public String helloPublic() {
        return "Hello Code public!";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello Du Code user!";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello  Du Code ADMIN!";
    }
}