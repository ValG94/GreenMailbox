package com.simplon.demo.repository;

import com.simplon.demo.model.ContentChallenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContentChallengeRepository extends JpaRepository <ContentChallenge, Long>{

 public Optional<ContentChallenge> findById(Long id);
}
