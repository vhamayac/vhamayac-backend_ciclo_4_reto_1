package com.vhamayac.ciclo_4_reto_1.repository.crud;

import com.vhamayac.ciclo_4_reto_1.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
