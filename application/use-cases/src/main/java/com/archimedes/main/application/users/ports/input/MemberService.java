package com.archimedes.main.application.users.ports.input;

import com.archimedes.main.domain.users.dtos.Members;

public interface MemberService {
    void add(Members member);

    void revoke(String email);

    void update(Members member);

    void recurrentUpdate(String recurringType);
}
