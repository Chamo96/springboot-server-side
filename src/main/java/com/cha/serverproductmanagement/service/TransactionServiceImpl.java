package com.cha.serverproductmanagement.service;

import com.cha.serverproductmanagement.model.Transaction;
import com.cha.serverproductmanagement.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(final Transaction transaction){
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAllTransactions(){
        return transactionRepository.findAll();
    }

    @Override
    public Long numberOfTransactions(){
        return transactionRepository.count();
    }
}
