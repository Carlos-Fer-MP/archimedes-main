package com.archimedes.main.application.wallet.ports.input;


public interface WalletService {
    void addBalance(String id, int amount);

    void disable(String id);

    void enable(String id);

    void transference(Long id, String sender, String receiver, int amount, String currencyType);

    void payment(Long id, String receiver, int amount);
}
