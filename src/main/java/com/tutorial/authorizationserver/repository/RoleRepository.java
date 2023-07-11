package com.tutorial.authorizationserver.repository;

import com.tutorial.authorizationserver.model.Role;
import com.tutorial.authorizationserver.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRole(RoleName role);
}
