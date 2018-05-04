package com.nbcb.mapper;

import com.nbcb.po.User;

public interface UserMapper {
    public User findUserById(int id);
    public void insertUser(User user);
}
