package com.example.kharja.repository;

import com.example.kharja.Entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
