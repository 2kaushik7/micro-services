package com.systemsai.authorizations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.springframework.stereotype.Repository;

import com.systemsai.authorizations.entity.PaymentAuthorization;

@Repository
public interface PaymentAuthorizationRepository extends JpaRepository<PaymentAuthorization, UUID> {
}
