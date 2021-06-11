package com.simplon.demo.repository;

import com.simplon.demo.model.ProfileGreen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileGreenRepository extends JpaRepository <ProfileGreen, Integer> {
}
