package com.archimedes.main.application.wallet.services;

import com.archimedes.main.application.wallet.ports.input.WalletService;
import com.archimedes.main.application.wallet.ports.output.WalletPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class WalletServiceImpl implements WalletService {
    @Autowired
    private WalletPersistenceService persistenceService;

    @Override
    public void addBalance(String id, int amount) { persistenceService.updateBalance(id, amount); }

    @Override
    public void disable(String id) {persistenceService.disableUnit(id);}
}
