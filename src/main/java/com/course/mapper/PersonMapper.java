package com.course.mapper;
import com.course.pojo.IdCard;
import com.course.pojo.Person;

public interface PersonMapper {
    Person findPersonById(Person id);
    Person findByLuoYinJin(Person id);
}
