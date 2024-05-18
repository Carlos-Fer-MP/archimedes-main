package com.archimedes.main.apirest.wallet.adapters;

import com.archimedes.main.apirest.wallet.mappers.WalletModelMapper;
import com.archimedes.main.application.wallet.ports.input.WalletService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WalletControllerTests {
    @Mock
    private WalletService walletService;
    @Mock
    private WalletModelMapper modelMapper;
    @InjectMocks
    private WalletController controller;

    @Test
    @DisplayName("Should add new balance for an existing wallet OK")
    void shouldAddBalance(){
        //Given
        int expectedBalance = 456;
        when(modelMapper.stringBalanceToBigDecimal("456")).thenReturn(456);
        //When
        controller.addBalance("123", "456");
        //Then
        verify(walletService, times(1)).addBalance("123", expectedBalance);
        verify(modelMapper,times(1)).stringBalanceToBigDecimal("456");
    }

    @Test
    @DisplayName("Should disable an existing wallet OK")
    void shouldDisable(){
        //Given
        //When
        controller.disableWallet("1L");
        //Then
        verify(walletService, times(1)).disable("1L");
    }
}
