package com.systemsai.transactions.repository;

import com.systemsai.transactions.entity.Refund;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundRepository extends JpaRepository<Refund, UUID> {
}
