package com.lvym.mycat.mapper;


import com.lvym.mycat.entity.My;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM  mydb ")
    public List<My> findUser();
 
    @Insert("insert into mydb values (null,#{name}); ")
    public int insertUser(@Param("name") String name);
}
