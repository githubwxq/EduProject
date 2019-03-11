package com.yuxiu.edu.mapper.base;

import com.yuxiu.edu.model.User;

public interface BaseMapper<T> {

    public T findById(Integer id);

    public void deleteById(Integer id);

    public void update(T t);

    public void insert(T t);

    public T findByUUId(String id);

    public void deleteByUUId(String id);
}
