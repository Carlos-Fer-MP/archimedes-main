package com.archimedes.main.apirest.wallet.adapters;

import com.archimedes.main.apirest.wallet.mappers.WalletModelMapper;
import com.archimedes.main.application.wallet.ports.input.WalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/wallet")
public class WalletController {
    @Autowired
    private WalletService walletService;
    @Autowired
    private WalletModelMapper mapper;

    @PostMapping("/{walletId}/add-balance")
    @ResponseStatus(code = HttpStatus.OK)
    public void addBalance(@PathVariable String walletId, @RequestBody String amount) {
        var balance = mapper.stringBalanceToBigDecimal(amount);
        walletService.addBalance(walletId,balance);
    }

    @PostMapping("/{walletId}/disable")
    @ResponseStatus(code = HttpStatus.OK)
    public void disableWallet(@PathVariable String walletId) { walletService.disable(walletId); }
}
