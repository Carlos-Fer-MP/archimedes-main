package com.archimedes.main.apirest.users.mappers;

import com.archimedes.main.apirest.users.models.UserModel;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserModelMapper {

    @Mapping(target = "wallets", ignore = true)
    @Mapping(target = "group", ignore = true)
    @Mapping(target = "membersDTO", ignore = true)
    UsersDTO convert(UserModel userModel);
}
