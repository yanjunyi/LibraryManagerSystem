package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.pojo.Admin;

public interface AdminService {
    public Admin getByNameAndPwd(Admin admin);
    public int  resetPassword(Admin admin);
    public String  getPassword(Long adminId);
    public String  getUsername(Long adminId);
}
