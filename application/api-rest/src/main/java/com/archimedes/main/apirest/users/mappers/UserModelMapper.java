package com.archimedes.main.apirest.users.mappers;

import com.archimedes.main.apirest.users.models.UserModel;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserModelMapper {
    UsersDTO toDto(UserModel userModel);
}
