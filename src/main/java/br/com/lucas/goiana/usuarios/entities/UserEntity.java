package br.com.lucas.goiana.usuarios.entities;

import br.com.lucas.goiana.usuarios.model.dto.UserDTO;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String ano;
    // Construtores, getters e setters

    public UserEntity() {
        // Construtor padrão necessário para JPA
    }

    public UserEntity(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.ano = ano;
    }

    public UserEntity(UserDTO userDTO) {
        this.username = userDTO.getName();
        this.password = userDTO.getPassword();
        this.email = userDTO.getEmail();
        this.ano = userDTO.getAno();
    }


}