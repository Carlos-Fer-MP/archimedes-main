package com.archimedes.main.application.users.services;

import com.archimedes.main.application.users.ports.input.MemberService;
import com.archimedes.main.application.users.ports.output.MembershipPersistenceService;
import com.archimedes.main.domain.commons.enums.RecurringTypes;
import com.archimedes.main.domain.users.dtos.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MembershipPersistenceService membershipPersistenceService;

    @Override
    public void add(Members member) {

    }

    @Override
    public void revoke(String email) {

    }

    @Override
    public void update(Members member) {

    }

    @Override
    public void recurrentUpdate(String recurringType) {

    }
}
