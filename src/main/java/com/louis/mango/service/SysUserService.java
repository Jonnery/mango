package com.louis.mango.service;

import java.util.List;

import com.louis.mango.model.SysUser;

/**
 * 服务类
 * @author Guilin
 */
public interface SysUserService {

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();

}