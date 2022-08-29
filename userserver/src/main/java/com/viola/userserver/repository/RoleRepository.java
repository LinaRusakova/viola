package com.viola.userserver.repository;

import com.viola.userserver.model.EnumRole;
import com.viola.userserver.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(EnumRole nameOfRole);
}
