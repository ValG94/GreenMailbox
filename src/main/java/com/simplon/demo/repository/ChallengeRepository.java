package com.simplon.demo.repository;

import com.simplon.demo.model.Challenge;
import com.simplon.demo.model.ContentChallenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChallengeRepository extends JpaRepository <Challenge, Integer> {

    public Optional<Challenge> findById(Long id);

}
