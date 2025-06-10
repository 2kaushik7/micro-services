package com.systemsai.transactions.service.impl;

import com.systemsai.transactions.entity.PaymentTransaction;
import com.systemsai.transactions.repository.PaymentTransactionRepository;
import com.systemsai.transactions.service.PaymentTransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentTransactionServiceImpl implements PaymentTransactionService {
    private final PaymentTransactionRepository repository;

    @Autowired
    public PaymentTransactionServiceImpl(PaymentTransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    public PaymentTransaction create(PaymentTransaction paymentTransaction) {
        return repository.save(paymentTransaction);
    }

    @Override
    public Optional<PaymentTransaction> getById(UUID transactionId) {
        return repository.findById(transactionId);
    }

    @Override
    public List<PaymentTransaction> getAll() {
        return repository.findAll();
    }

    @Override
    public PaymentTransaction update(PaymentTransaction paymentTransaction) {
        return repository.save(paymentTransaction);
    }

    @Override
    public void delete(UUID transactionId) {
        repository.deleteById(transactionId);
    }
}
