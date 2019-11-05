package com.wax.lp.dao;

import com.wax.lp.bean.CrmRole;
import com.wax.lp.bean.CrmRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmRoleMapper {
    long countByExample(CrmRoleExample example);

    int deleteByExample(CrmRoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(CrmRole record);

    int insertSelective(CrmRole record);

    List<CrmRole> selectByExample(CrmRoleExample example);

    CrmRole selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") CrmRole record, @Param("example") CrmRoleExample example);

    int updateByExample(@Param("record") CrmRole record, @Param("example") CrmRoleExample example);

    int updateByPrimaryKeySelective(CrmRole record);

    int updateByPrimaryKey(CrmRole record);
}