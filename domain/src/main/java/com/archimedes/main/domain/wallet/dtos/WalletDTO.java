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
    private int balance;
    private Boolean isActive;
    private Boolean hasNoBalance;
    private WalletTypes walletType = WalletTypes.PARTICULAR;
    private CurrencyTypes currencyType = CurrencyTypes.NOT_ASSIGNED;
    private List<BillingDTO> billings;
    private String created;
    private String updated;
    private String deleted;
}
