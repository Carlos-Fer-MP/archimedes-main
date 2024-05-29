package com.archimedes.main.apirest.users.mappers;

import com.archimedes.main.apirest.users.models.MembersModel;
import com.archimedes.main.domain.users.dtos.Members;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface MembersModelMapper {
    Members toDto(MembersModel model);
}
