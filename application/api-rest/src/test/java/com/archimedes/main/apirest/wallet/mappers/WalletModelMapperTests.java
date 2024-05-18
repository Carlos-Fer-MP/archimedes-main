package com.archimedes.main.apirest.wallet.mappers;

import com.archimedes.main.apirest.wallet.models.WalletModel;
import com.archimedes.main.domain.wallet.dtos.WalletDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class WalletModelMapperTests {

    private WalletModelMapper mapper = new WalletModelMapperImpl();

    @Test
    @DisplayName("Test WalletModelMapper constructor")
    void shouldMapToWalletModel() {
        //Given
        var givenWalletModel = mock(WalletModel.class);
        //When
        var result = mapper.toDto(givenWalletModel);
        //Then
        assertThat("Classes should be the same", result.getClass(), equalTo(WalletDTO.class));
    }

}
