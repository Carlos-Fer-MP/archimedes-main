package com.archimedes.main.application.users.ports.input;

import com.archimedes.main.application.users.exceptions.UnknownUserException;
import com.archimedes.main.domain.users.dtos.UsersDTO;

import java.util.List;

public interface UserService {
    void delete(Long id) throws UnknownUserException;

    void create(UsersDTO user);

    UsersDTO findById(Long id) throws UnknownUserException;

    List<UsersDTO> list();

    List<UsersDTO> findByStatus(Boolean status);

    List<UsersDTO> findByVeteranType(String veteranType);

    List<UsersDTO> findByCurrencyType(String currencyType);

    List<UsersDTO> findByGroupCategory(String groupCategory);

    List<UsersDTO> findByMemberType(String memberType);
}
