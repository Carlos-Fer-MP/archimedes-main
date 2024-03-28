package com.archimedes.main.application.users.ports.output;

import com.archimedes.main.domain.users.dtos.UsersDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ComponentScan("com.archimedes.main.application.users")
public interface PersistenceRepository {
    void deleteById(long id);

    UsersDTO findById(long id);

    void createUser(UsersDTO dto);

    List<UsersDTO> index();

    List<UsersDTO> getByStatus(Boolean status);

    List<UsersDTO> getByVeteranType(String veteranType);

    List<UsersDTO> getByCurrencyType(String currencyType);

    List<UsersDTO> getByGroupCategory(String groupCategory);

    List<UsersDTO> getByMemberType(String memberType);
}
