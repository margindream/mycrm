package com.wax.lp.dao;

import com.wax.lp.bean.CrmThread;
import com.wax.lp.bean.CrmThreadpool;
import com.wax.lp.bean.CrmThreadpoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmThreadpoolMapper {
    long countByExample(CrmThreadpoolExample example);

    int deleteByExample(CrmThreadpoolExample example);

    int deleteByPrimaryKey(Integer treadid);

    int insert(CrmThreadpool record);

    int insertSelective(CrmThreadpool record);

    List<CrmThreadpool> selectByExample(CrmThreadpoolExample example);

    CrmThreadpool selectByPrimaryKey(Integer treadid);

    int updateByExampleSelective(@Param("record") CrmThreadpool record, @Param("example") CrmThreadpoolExample example);

    int updateByExample(@Param("record") CrmThreadpool record, @Param("example") CrmThreadpoolExample example);

    int updateByPrimaryKeySelective(CrmThreadpool record);

    int updateByPrimaryKey(CrmThreadpool record);
    
    //批量插入并返回插入后的主键
    int saveCrmThreadPoolLists(List<CrmThread>  CrmThreadpoollist);
}