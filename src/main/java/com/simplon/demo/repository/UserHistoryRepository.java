package com.simplon.demo.repository;

import com.simplon.demo.model.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {

}
