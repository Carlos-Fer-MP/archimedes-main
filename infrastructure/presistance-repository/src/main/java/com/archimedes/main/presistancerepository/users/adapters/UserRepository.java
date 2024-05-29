package com.archimedes.main.presistancerepository.users.adapters;

import com.archimedes.main.application.users.ports.output.UserPersistenceService;
import com.archimedes.main.domain.users.dtos.Users;

import java.util.List;

public class UserRepository implements UserPersistenceService {
    @Override
    public void deleteById(long id) {}

    @Override
    public Users findById(long id) {
        return null;
    }

    @Override
    public void createUser(Users dto) {}

    @Override
    public List<Users> index() {
        return null;
    }

    @Override
    public List<Users> getByStatus(Boolean status) {
        return null;
    }

    @Override
    public List<Users> getByVeteranType(String veteranType) {
        return null;
    }

    @Override
    public List<Users> getByCurrencyType(String currencyType) {
        return null;
    }

    @Override
    public List<Users> getByGroupCategory(String groupCategory) {
        return null;
    }

    @Override
    public List<Users> getByMemberType(String memberType) {
        return null;
    }
}
