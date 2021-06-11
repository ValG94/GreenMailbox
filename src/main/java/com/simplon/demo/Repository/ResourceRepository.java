package com.simplon.demo.Repository;

import com.simplon.demo.Model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}
