package com.archimedes.main.apirest.wallet.mappers;

import com.archimedes.main.apirest.wallet.models.WalletModel;
import com.archimedes.main.domain.wallet.dtos.WalletDTO;
import org.mapstruct.Mapper;

import java.math.BigDecimal;

@Mapper(componentModel = "spring")
public interface WalletModelMapper {
    WalletDTO toDto(WalletModel userModel);

    default int stringBalanceToBigDecimal(String balance){
       return Integer.parseInt(balance);
    }
}
