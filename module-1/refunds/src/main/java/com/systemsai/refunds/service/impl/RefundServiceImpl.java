package com.systemsai.transactions.service.impl;

import com.systemsai.transactions.entity.Refund;
import com.systemsai.transactions.repository.RefundRepository;
import com.systemsai.transactions.service.RefundService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RefundServiceImpl implements RefundService {
    private final RefundRepository repository;

    @Autowired
    public RefundServiceImpl(RefundRepository repository) {
        this.repository = repository;
    }

    @Override
    public Refund create(Refund refund) {
        return repository.save(refund);
    }

    @Override
    public Optional<Refund> getById(UUID refundId) {
        return repository.findById(refundId);
    }

    @Override
    public List<Refund> getAll() {
        return repository.findAll();
    }

    @Override
    public Refund update(Refund refund) {
        return repository.save(refund);
    }

    @Override
    public void delete(UUID refundId) {
        repository.deleteById(refundId);
    }
}
