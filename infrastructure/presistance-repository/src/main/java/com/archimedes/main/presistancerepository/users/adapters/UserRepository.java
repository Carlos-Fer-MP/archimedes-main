package com.archimedes.main.presistancerepository.users.adapters;

import com.archimedes.main.application.users.ports.output.UserPersistenceService;
import com.archimedes.main.domain.users.dtos.UsersDTO;

import java.util.List;

public class UserRepository implements UserPersistenceService {
    @Override
    public void deleteById(long id) {}

    @Override
    public UsersDTO findById(long id) {
        return null;
    }

    @Override
    public void createUser(UsersDTO dto) {}

    @Override
    public List<UsersDTO> index() {
        return null;
    }

    @Override
    public List<UsersDTO> getByStatus(Boolean status) {
        return null;
    }

    @Override
    public List<UsersDTO> getByVeteranType(String veteranType) {
        return null;
    }

    @Override
    public List<UsersDTO> getByCurrencyType(String currencyType) {
        return null;
    }

    @Override
    public List<UsersDTO> getByGroupCategory(String groupCategory) {
        return null;
    }

    @Override
    public List<UsersDTO> getByMemberType(String memberType) {
        return null;
    }
}
