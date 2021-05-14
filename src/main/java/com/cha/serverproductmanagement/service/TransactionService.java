package com.cha.serverproductmanagement.service;

import com.cha.serverproductmanagement.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);

    List<Transaction> findAllTransactions();

    Long numberOfTransactions();
}
