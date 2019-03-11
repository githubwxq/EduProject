package com.yuxiu.edu.service;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.base.IBaseService;

// 特有的方法
public interface IUserService extends IBaseService<User>{

    User login(String userName,String passWord);





}
