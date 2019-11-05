package com.wax.lp.dao;

import com.wax.lp.bean.CrmBusinessstatus;
import com.wax.lp.bean.CrmBusinessstatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmBusinessstatusMapper {
    long countByExample(CrmBusinessstatusExample example);

    int deleteByExample(CrmBusinessstatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmBusinessstatus record);

    int insertSelective(CrmBusinessstatus record);

    List<CrmBusinessstatus> selectByExample(CrmBusinessstatusExample example);

    CrmBusinessstatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmBusinessstatus record, @Param("example") CrmBusinessstatusExample example);

    int updateByExample(@Param("record") CrmBusinessstatus record, @Param("example") CrmBusinessstatusExample example);

    int updateByPrimaryKeySelective(CrmBusinessstatus record);

    int updateByPrimaryKey(CrmBusinessstatus record);
}