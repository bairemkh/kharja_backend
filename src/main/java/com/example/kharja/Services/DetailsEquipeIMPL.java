package com.example.kharja.Services;

import com.example.kharja.Entity.DetailEquipe;
import com.example.kharja.repository.DetailEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailsEquipeIMPL implements DetailsEquipe{
    @Autowired
    DetailEquipeRepository detailEquipeRepository;
    @Override
    public List<DetailEquipe> retrieveAllEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe e) {
        return detailEquipeRepository.save(e);
    }

    @Override
    public DetailEquipe updateEquipe(DetailEquipe e) {
        return detailEquipeRepository.save(e);
    }

    @Override
    public DetailEquipe retrieveEquipe(Integer idDetailsEquipe) {
        return detailEquipeRepository.findById(idDetailsEquipe).get();
    }

    @Override
    public void removeDetailsEquipe(Integer idDetailsEquipe) {
        detailEquipeRepository.deleteById(idDetailsEquipe);
    }

}
