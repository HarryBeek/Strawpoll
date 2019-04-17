package nl.beek.strawpoll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nl.beek.strawpoll.model.User;
import nl.beek.strawpoll.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
	
    @RequestMapping("/user")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new User(1, name);
    }
    
    @GetMapping("/all")
    public Page<User> getQuestions(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
    
    @RequestMapping("/test")
    public List<User> getAll() {
    	return userRepository.findTest();
    }
}
