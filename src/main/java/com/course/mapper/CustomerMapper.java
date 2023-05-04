package com.course.mapper;

import com.course.pojo.Customer;

import java.util.List;

//接口开发
public interface CustomerMapper  {
    //    根据id查询用户信息
//    id 是接口中的方法名
  Customer findCustomerByUsernameAndJobs(Customer customer);
Customer findCustomerByUsernameOrJobs(String username);
public  void updateCustomerBySet(Customer customer);
public Customer findByArray(Integer id);
public Customer findByList(List id);
public void updateByLuoYinJin(Customer customer);
Customer findByMap(Customer customer);
Customer selectByLuoYinJin(Customer customer);

}

