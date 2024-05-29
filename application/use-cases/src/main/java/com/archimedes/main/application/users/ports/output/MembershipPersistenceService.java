package com.archimedes.main.application.users.ports.output;

import com.archimedes.main.domain.commons.enums.RecurringTypes;

public interface MembershipPersistenceService {
    void addMembership();

    void rebokeMembership();

    void upgradeMembership();

    void recurrentUpdate(RecurringTypes recurringType);
}
