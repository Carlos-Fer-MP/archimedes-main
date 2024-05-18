package com.archimedes.main.application.wallet.services;

import com.archimedes.main.application.wallet.ports.output.WalletPersistenceService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class WalletServiceImplTests {
    @Mock
    private WalletPersistenceService persistenceService;
    @InjectMocks
    private WalletServiceImpl walletService;

    @Test
    void shouldAddBalance(){
        //Given
        int expectedBalance = 100;
        //When
        walletService.addBalance("1L", expectedBalance);
        //Then
        verify(persistenceService,times(1)).updateBalance("1L", expectedBalance);
    }

    @Test
    @DisplayName("Should disable an existing wallet")
    void shouldDisableWallet(){
        //Given
        //When
        walletService.disable("1L");
        //Then
        verify(persistenceService,times(1)).disableUnit("1L");
    }

}
