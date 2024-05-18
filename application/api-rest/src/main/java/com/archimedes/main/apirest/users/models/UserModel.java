package com.archimedes.main.apirest.users.models;

import com.archimedes.main.apirest.wallet.models.WalletModel;
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
    private List<MembersModel> memberships = Collections.emptyList();
    private String created;
    private String inactive;
}
