package com.smsk.healthcare.repository;

import com.smsk.healthcare.entity.std;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<std,Long> {
}
