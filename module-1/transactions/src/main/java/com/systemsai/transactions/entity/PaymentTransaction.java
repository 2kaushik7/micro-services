package com.systemsai.transactions.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentTransaction {
    public enum PaymentMethod {
        CREDIT_CARD, PAYPAL, BANK_TRANSFER
    }

    public enum Status {
        PENDING, AUTHORIZED, CAPTURED, FAILED, REFUNDED
    }

    @Id
    @UuidGenerator
    @Column(updatable = false, nullable = false)
    private UUID transactionId;
    private BigDecimal amount;
    private String currency;
    private PaymentMethod paymentMethod;
    private Status status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private UUID customerId;
    private UUID orderId;
}
