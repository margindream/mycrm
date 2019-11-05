package com.wax.lp.dao;

import com.wax.lp.bean.CrmRBusinessTask;
import com.wax.lp.bean.CrmRBusinessTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmRBusinessTaskMapper {
    long countByExample(CrmRBusinessTaskExample example);

    int deleteByExample(CrmRBusinessTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmRBusinessTask record);

    int insertSelective(CrmRBusinessTask record);

    List<CrmRBusinessTask> selectByExample(CrmRBusinessTaskExample example);

    CrmRBusinessTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmRBusinessTask record, @Param("example") CrmRBusinessTaskExample example);

    int updateByExample(@Param("record") CrmRBusinessTask record, @Param("example") CrmRBusinessTaskExample example);

    int updateByPrimaryKeySelective(CrmRBusinessTask record);

    int updateByPrimaryKey(CrmRBusinessTask record);
}