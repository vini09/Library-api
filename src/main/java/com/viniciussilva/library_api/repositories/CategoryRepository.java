package com.viniciussilva.library_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussilva.library_api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
