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
public class Refund {
    public enum Status {
        PENDING, COMPLETED, FAILED
    }

    @Id
    @UuidGenerator
    @Column(updatable = false, nullable = false)
    private UUID refundId;
    private UUID transactionId;
    private BigDecimal refundAmount;
    private Status status;
    private String reason;
    private Timestamp createdAt;
    private Timestamp processedAt;
}
