package com.archimedes.main.application.users.ports.output;

import com.archimedes.main.application.users.exceptions.UnknownUserException;
import com.archimedes.main.domain.users.dtos.UsersDTO;

import java.util.List;

public interface UserPersistenceService {
    void deleteById(long id);

    UsersDTO findById(long id) throws UnknownUserException;

    void createUser(UsersDTO dto);

    List<UsersDTO> index();

    List<UsersDTO> getByStatus(Boolean status);

    List<UsersDTO> getByVeteranType(String veteranType);

    List<UsersDTO> getByCurrencyType(String currencyType);

    List<UsersDTO> getByGroupCategory(String groupCategory);

    List<UsersDTO> getByMemberType(String memberType);
}
