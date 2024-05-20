package com.archimedes.main.application.users.ports.input;

import com.archimedes.main.application.users.exceptions.NulluserDataException;
import com.archimedes.main.application.users.exceptions.UnknownUserException;
import com.archimedes.main.domain.users.dtos.UsersDTO;

import java.util.List;

public interface UserService {
    void delete(Long id) throws NulluserDataException;

    void create(UsersDTO user) throws NulluserDataException;

    UsersDTO findById(Long id) throws NulluserDataException;

    List<UsersDTO> list();

    List<UsersDTO> findByStatus(Boolean status);

    List<UsersDTO> findByVeteranType(String veteranType);

    List<UsersDTO> findByCurrencyType(String currencyType);

    List<UsersDTO> findByGroupCategory(String groupCategory);

    List<UsersDTO> findByMemberType(String memberType);
}
