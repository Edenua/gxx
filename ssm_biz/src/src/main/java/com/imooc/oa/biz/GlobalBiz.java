package com.wuancake.oa.biz;

import com.wuancake.oa.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn,String password);
    void changePassword(Employee employee);
}
