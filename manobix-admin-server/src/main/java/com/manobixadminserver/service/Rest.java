package com.manobixadminserver.service;

import java.util.List;

public interface Rest<T> {

    T get(String id);

    List<T> getAll();

    T create(T entity);

    T update(String id, T entity);

    void delete(String id);
}
