package com.systemsai.authorizations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.systemsai.authorizations.entity.PaymentAuthorization;
import com.systemsai.authorizations.service.PaymentAuthorizationService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/payment-authorizations")
public class PaymentAuthorizationController {
    private final PaymentAuthorizationService service;

    @Autowired
    public PaymentAuthorizationController(PaymentAuthorizationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PaymentAuthorization> create(@RequestBody PaymentAuthorization paymentAuthorization) {
        return ResponseEntity.ok(service.create(paymentAuthorization));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentAuthorization> getById(@PathVariable UUID id) {
        Optional<PaymentAuthorization> result = service.getById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<PaymentAuthorization> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentAuthorization> update(@PathVariable UUID id, @RequestBody PaymentAuthorization paymentAuthorization) {
        paymentAuthorization.setAuthorizationId(id);
        return ResponseEntity.ok(service.update(paymentAuthorization));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
