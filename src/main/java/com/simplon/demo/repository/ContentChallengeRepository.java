package com.simplon.demo.repository;

import com.simplon.demo.model.ContentChallenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentChallengeRepository extends JpaRepository <ContentChallenge, Long>{
}
