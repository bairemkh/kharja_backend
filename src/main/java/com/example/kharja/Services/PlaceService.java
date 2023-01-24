package com.example.kharja.Services;

import com.example.kharja.Entity.ImageData;
import com.example.kharja.Entity.Place;
import com.example.kharja.Entity.User;
import com.example.kharja.repository.PlaceRepository;
import com.example.kharja.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class PlaceService implements IService<Place>{
    @Autowired
    PlaceRepository repository;
    @Override
    public List<Place> retrieveAll() {
        return repository.findAll();
    }

    @Override
    public Place add(Place e) {
        return repository.save(e);
    }

    @Override
    public Place update(Place e) {
        return null;
    }

    @Override
    public Place retrieve(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void remove(int id) {

    }
    public List<ImageData> uploadImages(int id, List<MultipartFile> images){
        String idImage= id+"";
        ImageData imageData = new ImageData("","","");
        return null;
    }
}
