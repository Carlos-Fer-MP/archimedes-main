package com.archimedes.main.domain.wallet.dtos;

import com.archimedes.main.domain.billing.dtos.BillingDTO;
import com.archimedes.main.domain.commons.enums.CurrencyTypes;
import com.archimedes.main.domain.wallet.enums.WalletTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WalletDTO {
    private Long id;
    private String name;
    private String owner;
    private BigDecimal balance;
    private Boolean isActive;
    private Boolean hasNoBalance;
    private WalletTypes walletType;
    private CurrencyTypes currencyType;
    private List<BillingDTO> billings;
    private LocalDateTime created;
    private LocalDateTime updated;
}
