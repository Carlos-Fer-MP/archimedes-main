package com.archimedes.main.domain.users.dtos;

import com.archimedes.main.domain.commons.enums.CurrencyTypes;
import com.archimedes.main.domain.users.enums.UserAccountType;
import com.archimedes.main.domain.wallet.dtos.WalletDTO;
import lombok.*;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsersDTO {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Boolean isActive;
    private UserAccountType accountType;
    private List<WalletDTO> wallets;
    private List<GroupsDTO> group = Collections.emptyList();
    private List<MembersDTO> membersDTO = Collections.emptyList();
    private LocalDateTime created;
    private LocalDateTime inactive;
}
