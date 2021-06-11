package com.simplon.demo.Repository;

import com.simplon.demo.Model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends JpaRepository <Challenge, Integer> {

}