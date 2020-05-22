package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.dao.AdminDao;
import com.yanjunyi.ssm.pojo.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImp implements AdminService {
    @Resource
    private AdminDao adminDao;
    public Admin getByNameAndPwd(Admin admin) {
        return adminDao.getByNameAndPwd(admin);
    }

    public int resetPassword(Admin admin) {
        return adminDao.resetPassword(admin);
    }

    public String getPassword(Long adminId) {
        return adminDao.getPassword(adminId);
    }

    public String getUsername(Long adminId) {
        return adminDao.getPassword(adminId);
    }
}
