package com.viniciussilva.library_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussilva.library_api.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
