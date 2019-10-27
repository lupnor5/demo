package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.AppGroup;


interface AppGroupRepository extends CrudRepository<AppGroup, Long> {

}
