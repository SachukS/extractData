package com.example.extractdata.service;

import com.example.extractdata.entities.Drug;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DrugRepository extends JpaRepository<Drug, Long> {
    // Custom queries can be added here if needed
}
