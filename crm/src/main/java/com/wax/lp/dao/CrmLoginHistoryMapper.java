package com.wax.lp.dao;

import com.wax.lp.bean.CrmLoginHistory;
import com.wax.lp.bean.CrmLoginHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmLoginHistoryMapper {
    long countByExample(CrmLoginHistoryExample example);

    int deleteByExample(CrmLoginHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmLoginHistory record);

    int insertSelective(CrmLoginHistory record);

    List<CrmLoginHistory> selectByExample(CrmLoginHistoryExample example);

    CrmLoginHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmLoginHistory record, @Param("example") CrmLoginHistoryExample example);

    int updateByExample(@Param("record") CrmLoginHistory record, @Param("example") CrmLoginHistoryExample example);

    int updateByPrimaryKeySelective(CrmLoginHistory record);

    int updateByPrimaryKey(CrmLoginHistory record);
}