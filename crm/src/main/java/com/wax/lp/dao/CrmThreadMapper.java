package com.wax.lp.dao;

import com.wax.lp.bean.CrmThread;
import com.wax.lp.bean.CrmThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmThreadMapper {
    long countByExample(CrmThreadExample example);

    int deleteByExample(CrmThreadExample example);

    int deleteByPrimaryKey(Integer treadid);

    int insert(CrmThread record);

    int insertSelective(CrmThread record);

    List<CrmThread> selectByExample(CrmThreadExample example);

    CrmThread selectByPrimaryKey(Integer treadid);
    
    List<CrmThread> selectByOwnerid(Integer ownerid);
    
    List<CrmThread> selectByCompanyname(String companyname);

    int updateByExampleSelective(@Param("record") CrmThread record, @Param("example") CrmThreadExample example);

    int updateByExample(@Param("record") CrmThread record, @Param("example") CrmThreadExample example);

    int updateByPrimaryKeySelective(CrmThread record);

    int updateByPrimaryKey(CrmThread record);
    
    List<CrmThread> selectAll();
    //批量插入并返回插入后的主键
    int saveCrmThreadList(List<CrmThread>  CrmThreadlist);
    
    //批量插入并返回插入后的主键
    void deleteCrmThreadList(List<Integer>  threadids);
    
    //批量查询线索
    List<CrmThread> selectCrmThreadListById(List<Integer>  threadids);
}