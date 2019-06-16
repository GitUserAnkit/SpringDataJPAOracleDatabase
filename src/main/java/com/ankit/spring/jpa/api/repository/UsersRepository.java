package com.ankit.spring.jpa.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankit.spring.jpa.api.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {

}
