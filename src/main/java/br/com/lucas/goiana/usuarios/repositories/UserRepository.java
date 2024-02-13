package br.com.lucas.goiana.usuarios.repositories;

import br.com.lucas.goiana.usuarios.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, se necessário
}