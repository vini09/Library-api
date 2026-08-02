package com.viniciussilva.library_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussilva.library_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
