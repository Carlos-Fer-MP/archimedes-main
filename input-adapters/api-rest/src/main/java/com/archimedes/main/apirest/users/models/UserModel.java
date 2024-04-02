package com.archimedes.main.apirest.users.models;

import com.archimedes.main.domain.users.dtos.GroupsDTO;
import com.archimedes.main.domain.users.dtos.MembersDTO;
import com.archimedes.main.domain.users.enums.UserAccountType;
import com.archimedes.main.domain.wallet.dtos.WalletDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;


@Data
public class UserModel {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Boolean isActive;
    private UserAccountType accountType;
    private List<WalletDTO> wallets = Collections.emptyList();
    private List<GroupsDTO> group = Collections.emptyList();
    private List<MembersDTO> membersDTO = Collections.emptyList();
    private String created;
    private String inactive;
}
