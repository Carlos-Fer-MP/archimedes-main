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
public class Members {
    private Long id;
    private String email;
    private Boolean isActive;
    private MemberTypes memberTypes = MemberTypes.NOT_A_MEMBER;
    private VeteranTypes veteranTypes = VeteranTypes.NOT_ENROLLED;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
