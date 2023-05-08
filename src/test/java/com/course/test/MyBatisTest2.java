package com.course.test;

import com.course.pojo.Customer;
import com.course.pojo.Orders;
import com.course.pojo.Person;
import com.course.pojo.User;
import com.course.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
public class MyBatisTest2 {
    @Test
    public void findPersonByIdTest()
    {
        SqlSession sqlSession= MyBatisUtils.getSession();
        //准备查询的条件 执行sql语句释放
      Person person = new Person();
       person=sqlSession.selectOne("com.course.mapper.PersonMapper.findPersonById",1);

            System.out.println(person);
        System.out.println(person.getId());
        System.out.println(person.getCard());
        sqlSession.close();

    }
    @Test
    public void findByLuoYinJin()
    {
        SqlSession sqlSession= MyBatisUtils.getSession();
        //准备查询的条件 执行sql语句释放
        Person person = new Person();
        person=sqlSession.selectOne("com.course.mapper.PersonMapper.findByLuoYinJin",202);

        System.out.println(person);
        sqlSession.close();
    }
    @Test
    public void findUserWithOrdersById()
    {
        SqlSession sqlSession= MyBatisUtils.getSession();
        User user =new User();
        user =sqlSession.selectOne("com.course.mapper.UserMapper.findUserWithOrdersById",1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void findOrdersById()
    {
        SqlSession sqlSession=MyBatisUtils.getSession();
        Orders orders= new Orders();
        orders=sqlSession.selectOne("com.course.mapper.OrderMapper.findUserWithOrdersById",1);
        System.out.println(orders);
        sqlSession.close();
    }

}
