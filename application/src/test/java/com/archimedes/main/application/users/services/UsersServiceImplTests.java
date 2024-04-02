package com.archimedes.main.application.users.services;

import com.archimedes.main.application.users.ports.output.PersistenceRepository;
import com.archimedes.main.domain.commons.enums.CurrencyTypes;
import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import com.archimedes.main.domain.users.enums.GroupCategoryTypes;
import com.archimedes.main.domain.users.enums.MemberTypes;
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
import static org.hamcrest.Matchers.not;
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
                    LocalDateTime.now().toString(),
                    LocalDateTime.now().toString()
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
                    LocalDateTime.now().toString(),
                    LocalDateTime.now().toString()
            )
    );

    @Test
    @DisplayName("Should delete an existing user by id")
    void shouldDeleteAUserWithAnId() {
        //Given
        UsersDTO user = new UsersDTO();
        user.setId(1L);
        //When
        userService.delete(user.getId());
        //Then
        verify(repository, times(1)).deleteById(1L);
    }

    @Test
    @DisplayName("Should throw an error if userId is null")
    void shouldThrow_WhenDeleteAUser_WithANullId() {
        //Given
        //When/Then
        try {
            userService.delete(null);
        }catch(NullPointerException e){
            assertThat("message should be correct", e.getMessage(), equalTo(null));
        }
    }

    @Test
    @DisplayName("Should createUser an new user")
    void shouldCreateAUser() {
        //Given
        UsersDTO user = new UsersDTO();
        user.setId(1L);
        user.setEmail("test@email.com");
        //When
        userService.create(user);
        //Then
        verify(repository, times(1)).createUser(user);
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
    @DisplayName("Should find an existing user index")
    void shouldFindAUserList() {
        //Given
        when(repository.index()).thenReturn(USER_LIST_STUB);
        //When
        var result = userService.list();
        //Then
        verify(repository, times(1)).index();
        assertThat("Lists should be equal", result, equalTo(USER_LIST_STUB));
    }

    @Test
    @DisplayName("Should find existing users by it's status")
    void shouldFindUsersByStatus() {
        //Given
        when(repository.getByStatus(true)).thenReturn(USER_LIST_STUB);
        //When
        var result = userService.findByStatus(true);

        //Then
        verify(repository, times(1)).getByStatus(true);
        assertThat("Lists should be equal", result, equalTo(USER_LIST_STUB));
    }

    @Test
    @DisplayName("Should find existing users by it's veteran type")
    void shouldFindUsersByVeteranType() {
        //Given
        //When
        var result = userService.findByVeteranType("regular");
        //Then
        verify(repository, times(1)).getByVeteranType("regular");
        // TODO: chang the condition too VeteranTypes regular value
        assertThat("Veteran types should be equal", result, equalTo(Collections.emptyList()));
    }

    @Test
    @DisplayName("Should find existing users by it's veteran type")
    void shouldNotFindUsersByVeteranType() {
        //Given
        //When
        var result = userService.findByVeteranType("");
        //Then
        verify(repository, times(1)).getByVeteranType("");
        assertThat("Veteran types should be equal", result, not(VeteranTypes.REGULAR.getName()));
    }

    @Test
    @DisplayName("Should find existing users by it's currency type")
    void shouldFindUsersByCurrencyType() {
        //Given
        //When
        var result = userService.findByCurrencyType("yen");
        //Then
        verify(repository, times(1)).getByCurrencyType("yen");
        // TODO: chang the condition too currency types yen value
        assertThat("Currency types should be equal", result, equalTo(Collections.emptyList()));
    }

    @Test
    @DisplayName("Should find existing users by it's currency type")
    void shouldNotFindUsersByCurrencyType() {
        //Given
        //When
        var result = userService.findByCurrencyType("");
        //Then
        verify(repository, times(1)).getByCurrencyType("");
        assertThat("Currency types should be equal", result, not(CurrencyTypes.YEN.getCode()));
    }

    @Test
    @DisplayName("Should find existing users by it's group category type")
    void shouldFindUsersByGroupCategoryType() {
        //Given
        //When
        var result = userService.findByGroupCategory("especial");
        //Then
        verify(repository, times(1)).getByGroupCategory("especial");
        // TODO: chang the condition too currency types yen value
        assertThat("Group category types should be equal", result, equalTo(Collections.emptyList()));
    }

    @Test
    @DisplayName("Should find existing users by it's group category type")
    void shouldNotFindUsersByGroupCategoryType() {
        //Given
        //When
        var result = userService.findByGroupCategory("");
        //Then
        verify(repository, times(1)).getByGroupCategory("");
        assertThat("Group category types should be equal", result, not(GroupCategoryTypes.ESPECIAL.getName()));
    }

    @Test
    @DisplayName("Should find existing users by it's member type")
    void shouldFindUsersByMemberType() {
        //Given
        //When
        var result = userService.findByMemberType("kid");
        //Then
        verify(repository, times(1)).getByMemberType("kid");
        // TODO: chang the condition too currency types yen value
        assertThat("Group category types should be equal", result, equalTo(Collections.emptyList()));
    }

    @Test
    @DisplayName("Should find existing users by it's member type")
    void shouldNotFindUsersByMemberType() {
        //Given
        //When
        var result = userService.findByGroupCategory("");
        //Then
        verify(repository, times(1)).getByGroupCategory("");
        assertThat("Group category types should be equal", result, not(MemberTypes.KID.getValue()));
    }
}
