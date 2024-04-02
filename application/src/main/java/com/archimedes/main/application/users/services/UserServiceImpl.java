package com.archimedes.main.application.users.services;

import com.archimedes.main.application.users.ports.output.PersistenceService;
import com.archimedes.main.application.users.exceptions.UnknownUserException;
import com.archimedes.main.application.users.ports.input.UserService;
import com.archimedes.main.domain.commons.enums.CurrencyTypes;
import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.users.dtos.UsersDTO;
import com.archimedes.main.domain.users.enums.GroupCategoryTypes;
import com.archimedes.main.domain.users.enums.MemberTypes;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private PersistenceService repository;

    @Override
    public void delete(Long id) throws UnknownUserException {
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
        repository.createUser(user);
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
    public List<UsersDTO> list() { return repository.index(); }

    @Override
    public List<UsersDTO> findByStatus(Boolean status) { return repository.getByStatus(status); }

    @Override
    public List<UsersDTO> findByVeteranType(String veteranType) {
        if(!veteranType.isEmpty()){
            veteranType = VeteranTypes.VALUES_MAP.get(veteranType);
        }
        return repository.getByVeteranType(veteranType);
    }

    @Override
    public List<UsersDTO> findByCurrencyType(String currencyType) {
        if (!"".equals(currencyType)){
            currencyType = CurrencyTypes.VALUES_MAP.get(currencyType);
        }
        return repository.getByCurrencyType(currencyType);
    }

    @Override
    public List<UsersDTO> findByGroupCategory(String groupCategory) {
        if(!"".equals(groupCategory)){
            groupCategory = GroupCategoryTypes.VALUES_MAP.get(groupCategory);
        }
        return repository.getByGroupCategory(groupCategory);
    }

    @Override
    public List<UsersDTO> findByMemberType(String memberType){
        if(!"".equals(memberType)){
            memberType = MemberTypes.VALUES_MAP.get(memberType);
        }
        return repository.getByMemberType(memberType);
    }
}
