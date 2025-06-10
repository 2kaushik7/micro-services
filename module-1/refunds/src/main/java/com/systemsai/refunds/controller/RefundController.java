package com.systemsai.transactions.controller;

import com.systemsai.transactions.entity.Refund;
import com.systemsai.transactions.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/refunds")
public class RefundController {
    private final RefundService service;

    @Autowired
    public RefundController(RefundService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Refund> create(@RequestBody Refund refund) {
        return ResponseEntity.ok(service.create(refund));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Refund> getById(@PathVariable UUID id) {
        Optional<Refund> result = service.getById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Refund> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Refund> update(@PathVariable UUID id, @RequestBody Refund refund) {
        refund.setRefundId(id);
        return ResponseEntity.ok(service.update(refund));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
