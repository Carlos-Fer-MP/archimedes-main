package com.archimedes.main.apirest.users.models;

import com.archimedes.main.apirest.wallet.models.WalletModel;
import com.archimedes.main.domain.users.dtos.GroupsDTO;
import com.archimedes.main.domain.users.dtos.MembersDTO;
import com.archimedes.main.domain.wallet.dtos.WalletDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Boolean isActive;
    private String accountType;
    private List<WalletModel> wallets = Collections.emptyList();
    private List<GroupsModel> groups = Collections.emptyList();
    private List<MembersDTO> memberships = Collections.emptyList();
    private String created;
    private String inactive;
}
