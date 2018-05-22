package com.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.login.login.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}