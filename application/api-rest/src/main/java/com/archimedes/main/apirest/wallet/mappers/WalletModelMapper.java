package com.archimedes.main.apirest.wallet.mappers;

import com.archimedes.main.apirest.wallet.models.WalletModel;
import com.archimedes.main.domain.wallet.dtos.Wallet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WalletModelMapper {
    Wallet toDto(WalletModel userModel);

    default int stringBalanceToBigDecimal(String balance){
       return Integer.parseInt(balance);
    }
}
