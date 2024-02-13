package br.com.lucas.goiana.usuarios.service.impl;

import br.com.lucas.goiana.usuarios.entities.UserEntity;
import br.com.lucas.goiana.usuarios.exception.HandlerException;
import br.com.lucas.goiana.usuarios.model.dto.UserDTO;
import br.com.lucas.goiana.usuarios.repositories.UserRepository;
import br.com.lucas.goiana.usuarios.service.UserService;
import org.h2.engine.User;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {



    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO postUser(UserDTO user) throws IOException, InterruptedException {

        UserEntity userEntity = new UserEntity(user);
        userRepository.save(userEntity);

        return user;
    }

    public List<UserEntity> getUser() throws HandlerException {
        var userEntity = userRepository.findAll();

        // Tratando Nullability
        if (userEntity.isEmpty()) {
            throw new HandlerException(new Exception("Nenhum usuário encontrado"));
        }

        return userEntity;
    }



}
