package com.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.login.login.model.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public interface RoleRepository extends JpaRepository<Role, Long>{
}