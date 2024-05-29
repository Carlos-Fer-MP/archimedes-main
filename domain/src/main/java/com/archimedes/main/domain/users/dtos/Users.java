package com.archimedes.main.domain.users.dtos;

import com.archimedes.main.domain.users.enums.UserAccountType;
import com.archimedes.main.domain.wallet.dtos.Wallet;
import lombok.*;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Boolean isActive;
    private UserAccountType accountType = UserAccountType.PARTICULAR;
    private List<Wallet> wallets = Collections.emptyList();
    private List<Members> memberships = Collections.emptyList();
    private String created;
    private String inactive;
}
