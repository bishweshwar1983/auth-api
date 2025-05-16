package com.task_auth.auth_api.repositories;

import com.task_auth.auth_api.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmailAddress(String emailAddress);

}
