package com.systemsai.transactions.service;

import com.systemsai.transactions.entity.Refund;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RefundService {
    Refund create(Refund refund);
    Optional<Refund> getById(UUID refundId);
    List<Refund> getAll();
    Refund update(Refund refund);
    void delete(UUID refundId);
}
