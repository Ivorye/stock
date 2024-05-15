package com.example.stock.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.stock.common.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from user where id=#{id}")
//    public User selectById(Serializable id);
//
//    @Select("select * from user")
//    public List<User> getAllUsers();
//
//    @Insert("insert into user values(#{id},#{email},#{name})")
//    public int insert(User user);
//
//    @Delete("delete from user where id=#{id}")
//    public int delete(User user);
}
