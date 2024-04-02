package com.archimedes.main.apirest.users.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MembersModel {
    private Long id;
    private Boolean isActive;
    private String memberTypes;
    private String veteranTypes;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
