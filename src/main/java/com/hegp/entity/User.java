package com.hegp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor                 //无参构造
@AllArgsConstructor                //有参构造
public class User {
    @TableId(type = IdType.UUID)
    private String id;
    private String username;
    private String password;
}