package com.archimedes.main.domain.users.dtos;

import com.archimedes.main.domain.commons.enums.VeteranTypes;
import com.archimedes.main.domain.users.enums.MemberTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MembersDTO {
    private Long id;
    private Boolean isActive;
    private MemberTypes memberTypes;
    private VeteranTypes veteranTypes;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
