package com.example.kharja.repository;

import com.example.kharja.Entity.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Integer> {
}
