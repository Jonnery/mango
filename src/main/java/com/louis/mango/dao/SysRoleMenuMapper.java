package com.louis.mango.dao;

import com.louis.mango.model.SysRoleMenu;

/**
 * @author Guilin
 */
public interface SysRoleMenuMapper {
    /**
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @param record
     * @return
     */
    int insert(SysRoleMenu record);

    /**
     * @param record
     * @return
     */
    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Long id);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysRoleMenu record);
}