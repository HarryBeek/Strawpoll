package nl.beek.strawpoll.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nl.beek.strawpoll.models.User;

@RestController
public class UserController {
    @RequestMapping("/user")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new User(1, name);
    }
}
