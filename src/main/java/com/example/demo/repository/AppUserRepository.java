package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.AppUser;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {

}
