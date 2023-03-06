package com.suhana.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id).orElseThrow();
    }


    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser,@PathVariable Long id){
        return userRepository.findById(id)
                .map((user)-> {
                    user.setTitle(newUser.getTitle());
                    user.setName(newUser.getName());
                    user.setDescription(newUser.getDescription());
                    user.setImageLink(newUser.getImageLink());


                    return userRepository.save(user);

                }).orElseThrow();
    }
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return "Blog with id "+id+ "Deleted successfully";
    }

}
