package com.archimedes.main.apirest.users.adapters;

import com.archimedes.main.application.users.ports.input.UserService;
import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserControllerTests {
    @Mock
    private UserService userService;
    @InjectMocks
    private UserController usersController;

    @Test
    @DisplayName("Should delete the user with the matching ID")
    void shouldDeleteUserById() {
        //Given
        Long id = 1L;
        //When
        usersController.deleteUserById(id);
        //Then
        verify(userService, times(1)).deleteById(id);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenDeleteAUser_WithANullId(){
        //Given
        //When/Then
        try {
            usersController.deleteUserById(null);
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
        usersController.getUserById(id);
        //Then
        verify(userService, times(1)).findById(id);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenGetAUser_WithANullId(){
        //Given
        //When/Then
        try {
            usersController.getUserById(null);
        }catch(NullPointerException e){
            assertThat("message should be correct", e.getMessage(), equalTo(""));
        }
    }

    @Test
    @DisplayName("Should find the user with the matching ID")
    void shouldCreateUser() {
        //Given
        UsersDTO user = new UsersDTO();
        //When
        usersController.createUser(user);
        //Then
        verify(userService, times(1)).create(user);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenCreateAUser_WithNullData(){
        //Given
        //When/Then
        try {
            usersController.createUser(null);
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
        usersController.list();
        //Then
        verify(userService, times(1)).list();
    }

    @Test
    @DisplayName("Should List Existing Users by veteran type")
    void shouldGetUsersByVeteranType() {
        //Given
        VeteranTypes veteranType = VeteranTypes.VETERAN;
        //When
        usersController.getUsersByVeteranType(veteranType.getName());
        //Then
        verify(userService, times(1)).findByVeteranType(veteranType.getName());
    }

}
