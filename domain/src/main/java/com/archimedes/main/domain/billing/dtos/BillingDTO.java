package com.archimedes.main.domain.billing.dtos;

import com.archimedes.main.domain.billing.enums.BillingTypes;
import com.archimedes.main.domain.commons.enums.CurrencyTypes;
import com.archimedes.main.domain.commons.enums.RecurringTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillingDTO {
    private Long id;
    private String concept;
    private BigDecimal billing;
    private Boolean isActive;
    private BillingTypes billingType;
    private CurrencyTypes currencyType;
    private RecurringTypes recurringType;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime lastBillingDate;
}
