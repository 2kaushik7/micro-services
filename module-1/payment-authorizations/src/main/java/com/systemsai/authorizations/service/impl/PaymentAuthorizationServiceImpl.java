package com.systemsai.authorizations.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemsai.authorizations.entity.PaymentAuthorization;
import com.systemsai.authorizations.repository.PaymentAuthorizationRepository;
import com.systemsai.authorizations.service.PaymentAuthorizationService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentAuthorizationServiceImpl implements PaymentAuthorizationService {
    private final PaymentAuthorizationRepository repository;

    @Autowired
    public PaymentAuthorizationServiceImpl(PaymentAuthorizationRepository repository) {
        this.repository = repository;
    }

    @Override
    public PaymentAuthorization create(PaymentAuthorization paymentAuthorization) {
        return repository.save(paymentAuthorization);
    }

    @Override
    public Optional<PaymentAuthorization> getById(UUID authorizationId) {
        return repository.findById(authorizationId);
    }

    @Override
    public List<PaymentAuthorization> getAll() {
        return repository.findAll();
    }

    @Override
    public PaymentAuthorization update(PaymentAuthorization paymentAuthorization) {
        return repository.save(paymentAuthorization);
    }

    @Override
    public void delete(UUID authorizationId) {
        repository.deleteById(authorizationId);
    }
}
