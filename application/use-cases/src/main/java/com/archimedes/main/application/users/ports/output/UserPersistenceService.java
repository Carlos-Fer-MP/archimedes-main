package com.archimedes.main.application.users.ports.output;

import com.archimedes.main.application.users.exceptions.UnknownUserException;
import com.archimedes.main.domain.users.dtos.Users;

import java.util.List;

public interface UserPersistenceService {
    void deleteById(long id);

    Users findById(long id) throws UnknownUserException;

    void createUser(Users dto);

    List<Users> index();

    List<Users> getByStatus(Boolean status);

    List<Users> getByVeteranType(String veteranType);

    List<Users> getByCurrencyType(String currencyType);

    List<Users> getByGroupCategory(String groupCategory);

    List<Users> getByMemberType(String memberType);
}
