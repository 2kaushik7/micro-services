package com.systemsai.authorizations.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentAuthorization {
    public enum Status {
        AUTHORIZED, EXPIRED, VOIDED
    }

    @Id
    @UuidGenerator
    @Column(updatable = false, nullable = false)
    private UUID authorizationId;
    private UUID transactionId;
    private BigDecimal authorizedAmount;
    private String authorizationCode;
    private Timestamp expiresAt;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Timestamp createdAt;
    
}
