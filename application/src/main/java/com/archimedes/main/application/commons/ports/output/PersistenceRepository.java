package com.archimedes.main.application.commons.ports.output;

import com.archimedes.main.domain.users.dtos.UsersDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersistenceRepository {
    void deleteById(long id);
    UsersDTO findById(long id);

    UsersDTO create(UsersDTO dto);

    List<UsersDTO> list();
    List<UsersDTO> findByVeteranType(String veteranType);
}
