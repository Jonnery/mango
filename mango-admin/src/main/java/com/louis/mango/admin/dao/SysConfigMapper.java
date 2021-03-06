package com.louis.mango.admin.dao;

import com.louis.mango.admin.model.SysConfig;

/**
 * @author Guilin
 */
public interface SysConfigMapper {
    /**
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}