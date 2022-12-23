package com.example.kharja.repository;

import com.example.kharja.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    @Query("select e from Etudiant e where e.nomEtudiant = :firstName and e.prenomEtudiant=:lastName")
    List<Etudiant> findByFullName (@Param("firstName") String nomE, @Param("lastName") String prenomE);


}
