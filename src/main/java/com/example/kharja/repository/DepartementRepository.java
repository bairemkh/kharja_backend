package com.example.kharja.repository;

import com.example.kharja.Entity.Departement;
import com.example.kharja.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {

    @Query("select e from Etudiant e where e.departement.idDepartement=:depid")
        public List<Etudiant> getStudentByDepart(@Param("depid") int depid);

}
