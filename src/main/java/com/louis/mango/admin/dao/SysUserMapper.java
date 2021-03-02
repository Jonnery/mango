package com.louis.mango.admin.dao;

import java.util.List;

import com.louis.mango.admin.model.SysUser;

/**
 * @author Guilin
 */
public interface SysUserMapper {
    /**
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @param record
     * @return
     */
    int insert(SysUser record);

    /**
     * @param record
     * @return
     */
    int insertSelective(SysUser record);

    /**
     * @param id
     * @return
     */
    SysUser selectByPrimaryKey(Long id);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysUser record);
    
    /**
     * 查询全部
     * @return
     */
    List<SysUser> findAll();
}