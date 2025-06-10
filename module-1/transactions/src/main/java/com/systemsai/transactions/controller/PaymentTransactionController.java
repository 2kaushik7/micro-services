package com.systemsai.transactions.controller;

import com.systemsai.transactions.entity.PaymentTransaction;
import com.systemsai.transactions.service.PaymentTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/payment-transactions")
public class PaymentTransactionController {
    private final PaymentTransactionService service;

    @Autowired
    public PaymentTransactionController(PaymentTransactionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PaymentTransaction> create(@RequestBody PaymentTransaction paymentTransaction) {
        return ResponseEntity.ok(service.create(paymentTransaction));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentTransaction> getById(@PathVariable UUID id) {
        Optional<PaymentTransaction> result = service.getById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<PaymentTransaction> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentTransaction> update(@PathVariable UUID id, @RequestBody PaymentTransaction paymentTransaction) {
        paymentTransaction.setTransactionId(id);
        return ResponseEntity.ok(service.update(paymentTransaction));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
