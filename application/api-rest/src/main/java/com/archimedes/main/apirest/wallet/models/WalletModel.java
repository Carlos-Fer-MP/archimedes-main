package com.archimedes.main.apirest.wallet.models;

import com.archimedes.main.apirest.billing.models.BillingModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WalletModel {
    private Long id;
    private String name;
    private String owner;
    private String balance;
    private Boolean isActive;
    private Boolean hasNoBalance;
    private String walletType;
    private String currencyType;
    private List<BillingModel> billings;
    private LocalDateTime created;
    private LocalDateTime updated;
}
