package com.archimedes.main.domain.users.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GroupsDTO {
    private Long id;
    private String name;
    private Boolean isActive;
    private LocalDateTime created;
    private LocalDateTime deleted;
}
