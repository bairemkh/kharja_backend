package com.example.kharja.Services;

import com.example.kharja.Entity.NightClub;
import com.example.kharja.repository.NightClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NightClubService implements IService<NightClub>{
    @Autowired
    NightClubRepository repository;
    @Override
    public List<NightClub> retrieveAll() {
        return repository.findAll();
    }

    @Override
    public NightClub add(NightClub e) {
        return repository.save(e);
    }

    @Override
    public NightClub update(NightClub e) {
        return null;
    }

    @Override
    public NightClub retrieve(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void remove(int id) {

    }
}
