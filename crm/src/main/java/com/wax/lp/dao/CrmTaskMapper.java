package com.wax.lp.dao;

import com.wax.lp.bean.CrmTask;
import com.wax.lp.bean.CrmTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmTaskMapper {
    long countByExample(CrmTaskExample example);

    int deleteByExample(CrmTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmTask record);

    int insertSelective(CrmTask record);

    List<CrmTask> selectByExampleWithBLOBs(CrmTaskExample example);

    List<CrmTask> selectByExample(CrmTaskExample example);

    CrmTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmTask record, @Param("example") CrmTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") CrmTask record, @Param("example") CrmTaskExample example);

    int updateByExample(@Param("record") CrmTask record, @Param("example") CrmTaskExample example);

    int updateByPrimaryKeySelective(CrmTask record);

    int updateByPrimaryKeyWithBLOBs(CrmTask record);

    int updateByPrimaryKey(CrmTask record);
}