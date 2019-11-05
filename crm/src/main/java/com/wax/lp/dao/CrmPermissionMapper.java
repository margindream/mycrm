package com.wax.lp.dao;

import com.wax.lp.bean.CrmPermission;
import com.wax.lp.bean.CrmPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmPermissionMapper {
    long countByExample(CrmPermissionExample example);

    int deleteByExample(CrmPermissionExample example);

    int deleteByPrimaryKey(Integer permissionid);

    int insert(CrmPermission record);

    int insertSelective(CrmPermission record);

    List<CrmPermission> selectByExample(CrmPermissionExample example);

    CrmPermission selectByPrimaryKey(Integer permissionid);

    int updateByExampleSelective(@Param("record") CrmPermission record, @Param("example") CrmPermissionExample example);

    int updateByExample(@Param("record") CrmPermission record, @Param("example") CrmPermissionExample example);

    int updateByPrimaryKeySelective(CrmPermission record);

    int updateByPrimaryKey(CrmPermission record);
}