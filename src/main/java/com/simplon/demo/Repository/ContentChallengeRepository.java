package com.simplon.demo.Repository;

import com.simplon.demo.Model.ContentChallenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentChallengeRepository extends JpaRepository <ContentChallenge, Long>{
}
