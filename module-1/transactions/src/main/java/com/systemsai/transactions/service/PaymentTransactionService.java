package com.systemsai.transactions.service;

import com.systemsai.transactions.entity.PaymentTransaction;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PaymentTransactionService {
    PaymentTransaction create(PaymentTransaction paymentTransaction);
    Optional<PaymentTransaction> getById(UUID transactionId);
    List<PaymentTransaction> getAll();
    PaymentTransaction update(PaymentTransaction paymentTransaction);
    void delete(UUID transactionId);
}
