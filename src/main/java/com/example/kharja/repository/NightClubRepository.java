package com.example.kharja.repository;

import com.example.kharja.Entity.NightClub;
import com.example.kharja.Entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NightClubRepository extends JpaRepository<NightClub, Integer> {
}
