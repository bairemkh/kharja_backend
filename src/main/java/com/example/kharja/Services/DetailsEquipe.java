package com.example.kharja.Services;
import com.example.kharja.Entity.DetailEquipe;

import java.util.List;



public interface DetailsEquipe {
    List<DetailEquipe> retrieveAllEquipe();

    //Ajouter seulement
    DetailEquipe addDetailEquipe (DetailEquipe e);

    DetailEquipe updateEquipe (DetailEquipe e);

    DetailEquipe retrieveEquipe(Integer idDetailsEquipe);

    void removeDetailsEquipe(Integer idDetailsEquipe);
}
