package com.archimedes.main.application.wallet.ports.output;


public interface WalletPersistenceService {
    void updateBalance(String id, int balance);

    void disableUnit(String id);
}
