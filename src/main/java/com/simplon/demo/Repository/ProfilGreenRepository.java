package com.simplon.demo.Repository;

import com.simplon.demo.Model.ProfilGreen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilGreenRepository extends JpaRepository <ProfilGreen, Integer> {
}
