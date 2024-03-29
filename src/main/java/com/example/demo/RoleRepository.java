package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository <Role, Long> {
    Role findByName(String name);
}
