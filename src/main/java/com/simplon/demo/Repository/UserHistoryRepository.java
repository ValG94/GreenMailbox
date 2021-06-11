package com.simplon.demo.Repository;

import com.simplon.demo.Model.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {

}
