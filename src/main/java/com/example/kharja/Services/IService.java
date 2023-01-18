package com.example.kharja.Services;

import java.util.List;

public interface IService <T>{
    List<T> retrieveAll();
    T add (T e);
    T update (T e);
    T retrieve(int id);
    void remove(int id);
}
