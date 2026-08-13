package com.viniciussilva.library_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciussilva.library_api.entities.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long>{

}
