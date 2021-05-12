package com.dreamtail.springboot.phoenix.dao;

import com.dreamtail.springboot.phoenix.entity.User;

import java.util.List;

/**
 * @author xdq
 * @version 1.0
 * @className UserDao
 * @description TODO
 * @date 2021/4/29 18:24
 */
public interface UserDao {
  List<User> listAll();
}