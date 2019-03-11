package com.yuxiu.edu.service.base;


// 公有的方法
public interface IBaseService<T> {


    public T findById(Integer id);

    public void deleteById(Integer id);

    public void update(T t);

    public void insert(T t);

    public T findByUUId(String id);

    public void deleteByUUId(String id);

}
