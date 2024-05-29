package com.archimedes.main.application.users.services;

import com.archimedes.main.application.users.exceptions.NullUserGivenException;
import com.archimedes.main.application.users.exceptions.NulluserDataException;
import com.archimedes.main.application.users.ports.output.UserPersistenceService;
import com.archimedes.main.application.users.ports.input.UserService;
import com.archimedes.main.domain.commons.enums.CurrencyTypes;
import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.users.dtos.Users;
import com.archimedes.main.domain.users.enums.GroupCategoryTypes;
import com.archimedes.main.domain.users.enums.MemberTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserPersistenceService repository;

    @Override
    public void delete(Long id) throws NulluserDataException {
        if (null == id)
            throw new NulluserDataException("User id is null");

        repository.deleteById(id);
    }

    @Override
    public void create(Users user) throws NulluserDataException {
        if(null == user)
            throw new NullUserGivenException("User cannot be null");

        repository.createUser(user);
    }

    @Override
    public Users findById(Long id) throws NulluserDataException {
        if (null == id)
            throw new NulluserDataException("User id is null");

        return repository.findById(id);
    }

    @Override
    public List<Users> list() { return repository.index(); }

    @Override
    public List<Users> findByStatus(Boolean status) { return repository.getByStatus(status); }

    @Override
    public List<Users> findByVeteranType(String veteranType) {
        if(!veteranType.isEmpty())
            veteranType = VeteranTypes.VALUES_MAP.get(veteranType);

        return repository.getByVeteranType(veteranType);
    }

    @Override
    public List<Users> findByCurrencyType(String currencyType) {
        if (!"".equals(currencyType))
            currencyType = CurrencyTypes.VALUES_MAP.get(currencyType);

        return repository.getByCurrencyType(currencyType);
    }

    @Override
    public List<Users> findByGroupCategory(String groupCategory) {
        if(!"".equals(groupCategory))
            groupCategory = GroupCategoryTypes.VALUES_MAP.get(groupCategory);

        return repository.getByGroupCategory(groupCategory);
    }

    @Override
    public List<Users> findByMemberType(String memberType){
        if(!"".equals(memberType))
            memberType = MemberTypes.VALUES_MAP.get(memberType);

        return repository.getByMemberType(memberType);
    }
}
