package com.example.extractdata.service;

import com.example.extractdata.entities.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {
    private final DrugRepository drugRepository;

    @Autowired
    public DrugService(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    public List<Drug> getAllDrugs() {
        return drugRepository.findAll();
    }
    public void addAll(List<Drug> drugs) {
        drugRepository.saveAll(drugs);
    }

}
