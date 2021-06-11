package com.simplon.demo.Repository;

import com.simplon.demo.Model.UserChallenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserChallengeRepository extends JpaRepository<UserChallenge, Long> {
}
