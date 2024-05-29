package com.archimedes.main.application.wallet.services;

import com.archimedes.main.application.wallet.ports.input.WalletService;
import com.archimedes.main.application.wallet.ports.output.WalletPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {
    @Autowired
    private WalletPersistenceService persistenceService;



    @Override
    public void addBalance(String id, int amount) { persistenceService.updateBalance(id, amount); }

    @Override
    public void disable(String id) {persistenceService.disableUnit(id);}

    @Override
    public void enable(String id) {}

    @Override
    public void transference(Long id, String sender, String receiver, int amount, String currencyType) {}

    @Override
    public void payment(Long id, String receiver, int amount) {}
}
