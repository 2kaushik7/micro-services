CREATE TABLE refund (
    refund_id UUID PRIMARY KEY,
    transaction_id UUID NOT NULL,
    refund_amount DECIMAL(19,2) NOT NULL,
    status VARCHAR(32) NOT NULL,
    reason VARCHAR(255),
    created_at TIMESTAMP,
    processed_at TIMESTAMP
);

INSERT INTO refund (refund_id, transaction_id, refund_amount, status, reason, created_at, processed_at) VALUES
    ('55555555-5555-5555-5555-555555555555', '11111111-1111-1111-1111-111111111111', 50.00, 'COMPLETED', 'Partial refund', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
