package com.course.test;

import com.course.pojo.Customer;
import com.course.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MyBatisTest {
    @Test
    public void findCustomerByUsernameAndJobsTest()
    {
//        获取SqlSession对象 通过工具类utils

        SqlSession sqlSession= MyBatisUtils.getSession();
         //准备查询的条件 执行sql语句释放
        Customer customer=new Customer();

//        customer.setUsername("小铭");
//        customer.setJobs("商务");

        List<Customer> customers =sqlSession.selectList("com.course.mapper.CustomerMapper.findCustomerByUsernameAndJobs",customer);
        for (Customer b:customers)
        {
            System.out.println(b);
        }

        sqlSession.close();



    }
    @Test
    public void findCustomerByUsernameOrJobsTest()
    {
//        获取SqlSession对象 通过工具类utils
        SqlSession sqlSession= MyBatisUtils.getSession();
        //准备查询的条件 执行sql语句释放
        Customer customer=new Customer();
//
          customer.setPhone("1234567434553");

        List<Customer> customers =sqlSession.selectList("com.course.mapper.CustomerMapper.findCustomerByUsernameOrJobs",customer);
        for (Customer b:customers)
        {
            System.out.println(b);
        }
        sqlSession.close();

    }
    @Test
    public void updateCustomerBySet(){
        //    获取SqlSession会话对象，通过工具类
        SqlSession sqlSession= MyBatisUtils.getSession();
//    准备查询的条件
        Customer customer=new Customer();
        customer.setId(2);
        customer.setPhone("1435339594967");
        customer.setUsername("呱ik");
        int rows=sqlSession.update("com.course.mapper.CustomerMapper.updateCustomerBySet",customer);
        if(rows>0){
            System.out.println("修改了"+rows+"条");
        }else{
            System.out.println("没有修改数据");
        }
        //提交事务
        sqlSession.commit();
//    释放资源
        sqlSession.close();

    }
    @Test
    public void findByArrayTest()
    {
        SqlSession sqlSession= MyBatisUtils.getSession();
        //准备查询ID
        Integer[]ids={2,3};
        List<Customer> customers =sqlSession.selectList("findByArray",ids);
        for (Customer b :customers)
        {
            System.out.println(b);
        }
    }
    @Test
    public void findByListTest()
    {
        SqlSession sqlSession= MyBatisUtils.getSession();
        //准备查询ID
        List <Integer> wn= new ArrayList<>();
        wn.add(1);
        wn.add(3);
        List<Customer> customers =sqlSession.selectList("findByList",wn);
        for (Customer b :customers)
        {
            System.out.println(b);
        }
    }
    @Test
    public void updateByLuoYinJin(){
        SqlSession sqlSession= MyBatisUtils.getSession();
        Customer customer=new Customer();
        customer.setId(2);
        customer.setPhone("202171031202");
        customer.setUsername("罗银金");
        int rows=sqlSession.update("com.course.mapper.CustomerMapper.updateByLuoYinJin",customer);
        if(rows>0){
            System.out.println("修改了"+rows+"条");
        }else{
            System.out.println("没有修改数据");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void findByMapTest()
    {
        SqlSession sqlSession= MyBatisUtils.getSession();
         Map<String,Object> conditionMap =new HashMap<String,Object>();
             //准备查询ID
         List<Integer> ids=new ArrayList<>();
          for(int a=1;a<4;a++)
              ids.add(a);
          conditionMap.put("id",ids);
        conditionMap.put("jobs","老师");
        List<Customer> customers =sqlSession.selectList("findByMap",conditionMap);
        for(Customer c:customers){
            System.out.println(c);
        }
        sqlSession.close();
        

    }
    @Test
    public void selectByLuoYinJin()
    {
        SqlSession sqlSession= MyBatisUtils.getSession();
        Map<String,Object> conditionMap =new HashMap<String,Object>();
        //准备查询ID
        List<Integer> ids=new ArrayList<>();
        for(int a=1;a<7;a++)
            ids.add(a);
        conditionMap.put("id",ids);
        conditionMap.put("jobs","老师");
        List<Customer> customers =sqlSession.selectList("selectByLuoYinJin",conditionMap);
        for(Customer c:customers){
            System.out.println(c);
        }
        sqlSession.close();


    }
    public void findPersonByIdTest()
    {
        SqlSession session = MyBatisUtils.getSession();

    }
}
