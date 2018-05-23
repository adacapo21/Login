package com.login.login.repository;


import com.login.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.login.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
     User findByEmail(String email);
     User findByConfirmationToken(String confirmationToken);
}