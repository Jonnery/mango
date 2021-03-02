package com.louis.mango.admin.service.impl;

import java.util.List;

import com.louis.mango.admin.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.louis.mango.admin.model.SysUser;
import com.louis.mango.admin.service.SysUserService;

/**
 * 服务实现类
 * @author Guilin
 */
@Service
public class SysUserServiceImpl implements SysUserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}