package com.cha.serverproductmanagement.repository;

import com.cha.serverproductmanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
