package com.archimedes.main.application.wallet.ports.output;


public interface WalletPersistenceService {
    void updateBalance(String id, int balance);

    void disableUnit(String id);

    void enable(String id);

    void transference(Long id, String sender, String receiver, int amount, String currencyType);

    void payment(Long id, String receiver, int amount);

}
