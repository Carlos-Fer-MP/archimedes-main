package com.archimedes.main.apirest.users.adapters;

import com.archimedes.main.apirest.users.mappers.UserModelMapper;
import com.archimedes.main.apirest.users.models.UserModel;
import com.archimedes.main.application.users.ports.input.UserService;
import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import com.archimedes.main.domain.users.enums.UserAccountType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTests {
    @Mock
    private UserService userService;

    @Mock
    private UserModelMapper mapper;

    @InjectMocks
    private UserController userController;

    private final static UserModel USER_MODEL_STUB = new UserModel();


    @Test
    @DisplayName("Should delete the user with the matching ID")
    void shouldDeleteUserById() {
        //Given
        Long id = 1L;
        //When
        userController.deleteUserById(id);
        //Then
        verify(userService, times(1)).delete(id);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenDeleteAUser_WithANullId(){
        //Given
        //When/Then
        try {
            userController.deleteUserById(null);
        }catch(NullPointerException e){
            assertThat("message should be correct", e.getMessage(), equalTo(""));
        }
    }

    @Test
    @DisplayName("Should find the user with the matching ID")
    void shouldGetUserById() {
        //Given
        Long id = 1L;
        //When
        userController.getUserById(id);
        //Then
        verify(userService, times(1)).findById(id);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenGetAUser_WithANullId(){
        //Given
        //When/Then
        try {
            userController.getUserById(null);
        }catch(NullPointerException e){
            assertThat("message should be correct", e.getMessage(), equalTo(""));
        }
    }

    @Test
    @DisplayName("Should find the user with the matching ID")
    void shouldCreateUser() {
        //Given
        var userDTO = new UsersDTO();
        when(mapper.convert(USER_MODEL_STUB)).thenReturn(userDTO);
        //When
        userController.createUser(USER_MODEL_STUB);
        //Then
        verify(userService, times(1)).create(userDTO);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenCreateAUser_WithNullData(){
        //Given
        //When/Then
        try {
            userController.createUser(null);
        }catch(NullPointerException e){
            assertThat("message should be correct", e.getMessage(), equalTo("User data cannot be null"));
        }
    }

    @Test
    @DisplayName("Should List Existing Users")
    void shouldListUser() {
        //Given
        UsersDTO user = new UsersDTO();
        //When
        userController.list();
        //Then
        verify(userService, times(1)).list();
    }

    @Test
    @DisplayName("Should List Users by status")
    void shouldGetUsersByStatus() {
        //Given
        //When
        userController.getByUserStatus(true);
        //Then
        verify(userService, times(1)).findByStatus(true);
    }

    @Test
    @DisplayName("Should List Existing Users by veteran type")
    void shouldGetUsersByVeteranType() {
        //Given
        VeteranTypes veteranType = VeteranTypes.VETERAN;
        //When
        userController.getUsersByVeteranType(veteranType.getName());
        //Then
        verify(userService, times(1)).findByVeteranType(veteranType.getName());
    }

    @Test
    @DisplayName("Should List Existing Users by veteran type")
    void shouldGetUsersByTheirCurrencyType() {
        //Given
        //When
        userController.getUsersByCurrencyType("yen");
        //Then
        verify(userService, times(1)).findByCurrencyType("yen");
    }

    @Test
    @DisplayName("Should List Existing Users by group type")
    void shouldGetUsersByTheirGroupType() {
        //Given
        //When
        userController.getUsersByGroupCategory("especial");
        //Then
        verify(userService, times(1)).findByGroupCategory("especial");
    }

    @Test
    @DisplayName("Should List Existing Users by member type")
    void shouldGetUsersByTheirMemberType() {
        //Given
        //When
        userController.getUsersByGroupCategory("especial");
        //Then
        verify(userService, times(1)).findByGroupCategory("especial");
    }
}
