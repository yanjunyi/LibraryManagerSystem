package com.yanjunyi.ssm.dao;

import com.yanjunyi.ssm.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao {
    public Admin getByNameAndPwd(Admin admin);
    public int  resetPassword(Admin admin);
    public String  getPassword(Long adminId);
    public String  getUsername(Long adminId);
}
