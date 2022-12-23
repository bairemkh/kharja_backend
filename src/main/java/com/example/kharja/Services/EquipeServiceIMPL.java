package com.example.kharja.Services;

import com.example.kharja.Entity.Equipe;
import com.example.kharja.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipeServiceIMPL implements EquipeService{
    @Autowired
    EquipeRepository equipeRepository;
    @Override
    public List<Equipe> retrieveAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).get();
    }

    @Override
    public void removeEquipe(Integer idEquipe) {
        equipeRepository.deleteById(idEquipe);
    }
}
