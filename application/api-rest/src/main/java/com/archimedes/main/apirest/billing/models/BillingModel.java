package com.archimedes.main.apirest.billing.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillingModel {
    private Long id;
    private String concept;
    private BigDecimal billing;
    private Boolean isActive;
    private String billingType;
    private String currencyType;
    private String recurringType;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime lastBillingDate;
}
