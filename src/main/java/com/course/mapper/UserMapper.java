package com.course.mapper;

import com.course.pojo.User;

public interface UserMapper {
    User findUserWithOrdersById(int  id);

}
