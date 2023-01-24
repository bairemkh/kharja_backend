package com.example.kharja.Services;

import com.example.kharja.Entity.Restaurant;
import com.example.kharja.Entity.User;
import com.example.kharja.repository.RestaurantRepository;
import com.example.kharja.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService implements IService<Restaurant>{
    @Autowired
    RestaurantRepository repository;

    @Override
    public List<Restaurant> retrieveAll() {
        return repository.findAll();
    }

    @Override
    public Restaurant add(Restaurant e) {
        return repository.save(e);
    }

    @Override
    public Restaurant update(Restaurant e) {
        return null;
    }

    @Override
    public Restaurant retrieve(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void remove(int id) {

    }
}
