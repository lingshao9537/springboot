package com.ling.springboot02.dao.mapper;

import com.ling.springboot02.dao.bean.Person;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PersonMapper {
    @Select("select * from person left join address on person.addressid = address.addressid")
    @Results(id="studentMap", value={
            @Result(column="id", property="id", jdbcType= JdbcType.INTEGER, id=true),
            @Result(column="age", property="age", jdbcType=JdbcType.INTEGER)
    })
    List<Person> getAll();
    

}
