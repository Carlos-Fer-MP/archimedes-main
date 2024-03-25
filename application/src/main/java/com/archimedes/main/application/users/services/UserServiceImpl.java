package com.archimedes.main.application.users.services;

import com.archimedes.main.application.commons.ports.output.PersistenceRepository;
import com.archimedes.main.application.users.exceptions.UnknownUserException;
import com.archimedes.main.application.users.ports.input.UserService;
import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private PersistenceRepository repository;

    @Override
    public void deleteById(Long id) throws UnknownUserException {
        try {
            repository.deleteById(id);
        }catch (NullPointerException e) {
            throw new UnknownUserException();
        }
    }

    @Override
    public void create(UsersDTO user) {
        if(null == user.getId()) {
            throw new NullPointerException("User data cannot be null");
        }
        repository.create(user);
    }

    @Override
    public UsersDTO findById(Long id) throws UnknownUserException {
        try {
            return repository.findById(id);
        }catch (NullPointerException e) {
            throw new UnknownUserException();
        }
    }

    @Override
    public List<UsersDTO> list() { return repository.list(); }

    @Override
    public List<UsersDTO> findByVeteranType(String veteranType) {
        String realType = "";
        if(!veteranType.isEmpty()){
            realType = VeteranTypes.VALUES_MAP.get(veteranType);
        }
        return repository.findByVeteranType(realType);
    }
}
