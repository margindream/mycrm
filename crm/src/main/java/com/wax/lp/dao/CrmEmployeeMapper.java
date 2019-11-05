package com.wax.lp.dao;

import com.wax.lp.bean.CrmEmployee;
import com.wax.lp.bean.CrmEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmEmployeeMapper {
    long countByExample(CrmEmployeeExample example);

    int deleteByExample(CrmEmployeeExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(CrmEmployee record);

    int insertSelective(CrmEmployee record);

    List<CrmEmployee> selectByExample(CrmEmployeeExample example);

    CrmEmployee selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") CrmEmployee record, @Param("example") CrmEmployeeExample example);

    int updateByExample(@Param("record") CrmEmployee record, @Param("example") CrmEmployeeExample example);

    int updateByPrimaryKeySelective(CrmEmployee record);

    int updateByPrimaryKey(CrmEmployee record);
}