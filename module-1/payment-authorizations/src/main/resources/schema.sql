CREATE TABLE payment_authorization (
    authorization_id CHAR(36) PRIMARY KEY,
    transaction_id CHAR(36) NOT NULL,
    authorized_amount DECIMAL(19,2) NOT NULL,
    authorization_code VARCHAR(64),
    expires_at TIMESTAMP,
    status VARCHAR(32) NOT NULL,
    created_at TIMESTAMP
);

INSERT INTO payment_authorization (authorization_id, transaction_id, authorized_amount, authorization_code, expires_at, status, created_at) VALUES
    ('44444444-4444-4444-4444-444444444444', '11111111-1111-1111-1111-111111111111', 100.00, 'AUTHCODE123', CURRENT_TIMESTAMP, 'AUTHORIZED', CURRENT_TIMESTAMP);
