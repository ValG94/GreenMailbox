package com.simplon.demo.Repository;

import com.simplon.demo.Model.ProfileGreen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileGreenRepository extends JpaRepository <ProfileGreen, Integer> {
}
