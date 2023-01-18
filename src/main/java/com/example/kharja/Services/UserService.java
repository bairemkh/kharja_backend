package com.example.kharja.Services;

import com.example.kharja.Entity.User;
import com.example.kharja.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IService<User>{
    @Autowired
    UserRepository repository;
    @Override
    public List<User> retrieveAll() {
        return repository.findAll();
    }

    @Override
    public User add(User e) {
        return repository.save(e);
    }

    @Override
    public User update(User e) {
        return null;
    }

    @Override
    public User retrieve(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void remove(int id) {

    }
}
