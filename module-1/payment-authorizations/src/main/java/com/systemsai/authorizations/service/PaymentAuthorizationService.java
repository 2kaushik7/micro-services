package com.systemsai.authorizations.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.systemsai.authorizations.entity.PaymentAuthorization;

public interface PaymentAuthorizationService {
    PaymentAuthorization create(PaymentAuthorization paymentAuthorization);
    Optional<PaymentAuthorization> getById(UUID authorizationId);
    List<PaymentAuthorization> getAll();
    PaymentAuthorization update(PaymentAuthorization paymentAuthorization);
    void delete(UUID authorizationId);
}
