package com.archimedes.main.application.users.ports.input;

import com.archimedes.main.application.users.exceptions.NulluserDataException;
import com.archimedes.main.domain.users.dtos.Users;

import java.util.List;

public interface UserService {
    void delete(Long id) throws NulluserDataException;

    void create(Users user) throws NulluserDataException;

    Users findById(Long id) throws NulluserDataException;

    List<Users> list();

    List<Users> findByStatus(Boolean status);

    List<Users> findByVeteranType(String veteranType);

    List<Users> findByCurrencyType(String currencyType);

    List<Users> findByGroupCategory(String groupCategory);

    List<Users> findByMemberType(String memberType);
}
