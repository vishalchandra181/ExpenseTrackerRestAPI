package com.tracker.Repository;

import org.springframework.data.repository.CrudRepository;

import com.tracker.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
}
