package com.simplon.demo.repository;

import com.simplon.demo.model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends JpaRepository <Challenge, Integer> {

}
