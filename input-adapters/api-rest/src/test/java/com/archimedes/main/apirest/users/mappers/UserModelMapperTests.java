package com.archimedes.main.apirest.users.mappers;

import com.archimedes.main.apirest.users.models.UserModel;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import com.archimedes.main.domain.users.enums.UserAccountType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(MockitoExtension.class)
class UserModelMapperTests {
    private UserModelMapper userModelMapper = new UserModelMapperImpl();

    @Test
    @DisplayName("Test UserModelMapper should mapp a model to domain correctly")
    void shouldMapAUserModelToDomainModel() {
        //Given
        var givenUserModel = createUserModel();
        //Then
        var result = userModelMapper.convert(givenUserModel);
        //When
        assertThat("Classes should be the same", result.getClass(), equalTo(UsersDTO.class));
        //assertThat("Id should be equal", result.getId(), equalTo(1L));
    }

    private UserModel createUserModel() {
        var userModel = new UserModel();
        userModel.setId(1L);
        userModel.setName("aaaa");
        userModel.setName("aaaa");
        userModel.setEmail("email@email.com");
        userModel.setEmail("email@email.com");

        return userModel;
    }

}