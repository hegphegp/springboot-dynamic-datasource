package com.hegp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hegp.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}