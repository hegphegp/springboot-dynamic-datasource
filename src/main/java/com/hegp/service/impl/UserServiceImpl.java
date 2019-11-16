package com.hegp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hegp.entity.User;
import com.hegp.mapper.UserMapper;
import com.hegp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}