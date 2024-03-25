package com.archimedes.main.application.users.services;

import com.archimedes.main.application.commons.ports.output.PersistenceRepository;
import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import com.archimedes.main.domain.users.enums.UserAccountType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UsersServiceImplTests {
    @Mock
    private PersistenceRepository repository;
    @InjectMocks
    private UserServiceImpl userService;

    private static final List<UsersDTO> USER_LIST_STUB = List.of(
            new UsersDTO(
                    1L,
                    "",
                    "",
                    "",
                    "",
                    true,
                    UserAccountType.BUSINESS,
                    Collections.emptyList(),
                    Collections.emptyList(),
                    Collections.emptyList(),
                    LocalDateTime.now(),
                    LocalDateTime.now()
            ),
            new UsersDTO(
                    1L,
                    "",
                    "",
                    "",
                    "",
                    true,
                    UserAccountType.BUSINESS,
                    Collections.emptyList(),
                    Collections.emptyList(),
                    Collections.emptyList(),
                    LocalDateTime.now(),
                    LocalDateTime.now()
            )
    );

    @Test
    @DisplayName("Should delete an existing user by id")
    void shouldDeleteAUserWithAnId() {
        //Given
        UsersDTO user = new UsersDTO();
        user.setId(1L);
        //When
        userService.deleteById(user.getId());
        //Then
        verify(repository, times(1)).deleteById(1L);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenDeleteAUser_WithANullId() {
        //Given
        //When/Then
        try {
            userService.deleteById(null);
        }catch(NullPointerException e){
            assertThat("message should be correct", e.getMessage(), equalTo(null));
        }
    }

    @Test
    @DisplayName("Should create an new user")
    void shouldCreateAUser() {
        //Given
        UsersDTO user = new UsersDTO();
        user.setId(1L);
        user.setEmail("test@email.com");
        //When
        userService.create(user);
        //Then
        verify(repository, times(1)).create(user);
    }

    @Test
    @DisplayName("Should throw an error if user is null")
    void shouldThrow_WhenCreateAUserNull() {
        //Given
        //When/Then
        try {
            userService.create(null);
        }catch(NullPointerException e){
            assertThat("message should be correct", e.getMessage(), equalTo("Cannot invoke \"com.archimedes.main.domain.users.dtos.UsersDTO.getId()\" because \"user\" is null"));
        }
    }

    @Test
    @DisplayName("Should find an existing user by id")
    void shouldFindAUserWithAnId() {
        //Given
        UsersDTO user = new UsersDTO();
        user.setId(1L);
        //When
        userService.findById(user.getId());
        //Then
        verify(repository, times(1)).findById(1L);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenFindAUser_WithANullId() {
        //Given
        //When/Then
        try {
            userService.findById(null);
        }catch(NullPointerException e){
            assertThat("message should be correct", e.getMessage(), equalTo(null));
        }
    }

    @Test
    @DisplayName("Should find an existing user list")
    void shouldFindAUserList() {
        //Given
        when(repository.list()).thenReturn(USER_LIST_STUB);
        //When
        var result = userService.list();
        //Then
        verify(repository, times(1)).list();
        assertThat("Lists should be equal", result, equalTo(USER_LIST_STUB));
    }

    @Test
    @DisplayName("Should find existing users by it's veteran type")
    void shouldFindUsersByVeteranType() {
        //Given
        //When
        var result = userService.findByVeteranType("regular");
        //Then
        verify(repository, times(1)).findByVeteranType("regular");
        assertThat("Veteran types should be equal", result, equalTo(VeteranTypes.REGULAR.getName()));
    }

}
