package com.yuxiu.edu.service.impl;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import com.yuxiu.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl  extends BaseServiceImpl<User> implements IUserService {

    @Override
    public User login(String userName, String passWord) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }

    @Override
    public User findByUUId(String id) {
        return null;
    }

    @Override
    public void deleteByUUId(String id) {

    }
}
