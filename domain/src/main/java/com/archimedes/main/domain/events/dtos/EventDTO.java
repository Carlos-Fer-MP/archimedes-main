package com.archimedes.main.domain.events.dtos;

import com.archimedes.main.domain.commons.enums.RecurringTypes;
import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.events.enums.EventTypes;
import com.archimedes.main.domain.users.enums.MemberTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private EventTypes eventType = EventTypes.NOT_ASSIGNED;
    private Boolean isActive;
    private Boolean isRecurring;
    private Boolean isPrivate;
    private MemberTypes memberType = MemberTypes.NOT_A_MEMBER;
    private VeteranTypes veteranTypes = VeteranTypes.NOT_ENROLLED;
    private RecurringTypes recurringType = RecurringTypes.NON_RECURRENT;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
