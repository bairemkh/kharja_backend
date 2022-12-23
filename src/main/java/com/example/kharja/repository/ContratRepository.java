package com.example.kharja.repository;

import com.example.kharja.Entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {
@Query("select count(c) from Contrat c where c.dateFinContrat between :startDate and :endDate")
    public Integer nbContrat(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
}
