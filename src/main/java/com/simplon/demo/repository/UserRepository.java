package com.simplon.demo.repository;

import com.simplon.demo.model.EndUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<EndUser, Long> {
}
