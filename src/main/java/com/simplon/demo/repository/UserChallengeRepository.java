package com.simplon.demo.repository;

import com.simplon.demo.model.UserChallenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserChallengeRepository extends JpaRepository<UserChallenge, Long> {
}
