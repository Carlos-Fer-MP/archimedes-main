package com.archimedes.main.apirest.wallet.models;

import com.archimedes.main.domain.billing.dtos.BillingDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WalletModel {
    private Long id;
    private String name;
    private String owner;
    private BigDecimal balance;
    private Boolean isActive;
    private Boolean hasNoBalance;
    private String walletType;
    private String currencyType;
    private List<BillingDTO> billings;
    private LocalDateTime created;
    private LocalDateTime updated;
}
