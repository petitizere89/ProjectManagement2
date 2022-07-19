package com.izere.pma.dao;

import com.izere.pma.entities.UserAccount;
import org.springframework.data.repository.CrudRepository;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
}
