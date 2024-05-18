package com.archimedes.main.application.wallet.ports.input;

import java.math.BigDecimal;

public interface WalletService {
    void addBalance(String id, int amount);

    void disable(String id);
}
