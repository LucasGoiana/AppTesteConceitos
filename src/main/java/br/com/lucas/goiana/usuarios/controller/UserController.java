package br.com.lucas.goiana.usuarios.controller;

import br.com.lucas.goiana.usuarios.entities.UserEntity;
import br.com.lucas.goiana.usuarios.exception.HandlerException;
import br.com.lucas.goiana.usuarios.model.dto.UserDTO;
import br.com.lucas.goiana.usuarios.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public List<UserEntity> getUser() throws HandlerException {
                return userService.getUser();
    }
    @PostMapping("/")
    public UserDTO postUser(@RequestBody UserDTO newUser) throws IOException, InterruptedException {
        return userService.postUser(newUser);
    }


}
