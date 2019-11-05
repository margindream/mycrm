package com.wax.lp.dao;

import com.wax.lp.bean.CrmDepartment;
import com.wax.lp.bean.CrmDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmDepartmentMapper {
    long countByExample(CrmDepartmentExample example);

    int deleteByExample(CrmDepartmentExample example);

    int deleteByPrimaryKey(Integer deptid);

    int insert(CrmDepartment record);

    int insertSelective(CrmDepartment record);

    List<CrmDepartment> selectByExample(CrmDepartmentExample example);

    CrmDepartment selectByPrimaryKey(Integer deptid);

    int updateByExampleSelective(@Param("record") CrmDepartment record, @Param("example") CrmDepartmentExample example);

    int updateByExample(@Param("record") CrmDepartment record, @Param("example") CrmDepartmentExample example);

    int updateByPrimaryKeySelective(CrmDepartment record);

    int updateByPrimaryKey(CrmDepartment record);
}