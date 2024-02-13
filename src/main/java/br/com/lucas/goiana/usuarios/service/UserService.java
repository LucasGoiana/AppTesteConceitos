package br.com.lucas.goiana.usuarios.service;

import br.com.lucas.goiana.usuarios.entities.UserEntity;
import br.com.lucas.goiana.usuarios.exception.HandlerException;
import br.com.lucas.goiana.usuarios.model.dto.UserDTO;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface UserService {


    List<UserEntity> getUser() throws HandlerException;

    UserDTO postUser(UserDTO userDTO) throws IOException, InterruptedException;


}
