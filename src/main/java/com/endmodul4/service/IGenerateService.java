package com.endmodul4.service;


import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();
    T findById(Long id);
    T save(T t);
    void delete(T t);
}
