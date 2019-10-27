package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.AppGroup;

public interface AppGroupRepository extends CrudRepository<AppGroup, Long> {

}
