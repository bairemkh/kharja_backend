package com.example.kharja.repository;

import com.example.kharja.Entity.Restaurant;
import com.example.kharja.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
