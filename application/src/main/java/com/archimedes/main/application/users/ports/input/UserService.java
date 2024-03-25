package com.archimedes.main.application.users.ports.input;

import com.archimedes.main.application.users.exceptions.UnknownUserException;
import com.archimedes.main.domain.users.dtos.UsersDTO;

import java.util.List;

public interface UserService {
    void deleteById(Long id) throws UnknownUserException;
    UsersDTO findById(Long id) throws UnknownUserException;
    void create(UsersDTO user);
    List<UsersDTO> list();
    List<UsersDTO> findByVeteranType(String veteranType);
}
