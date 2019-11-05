package com.wax.lp.dao;

import com.wax.lp.bean.CrmBusiness;
import com.wax.lp.bean.CrmBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmBusinessMapper {
    long countByExample(CrmBusinessExample example);

    int deleteByExample(CrmBusinessExample example);

    int deleteByPrimaryKey(Integer businessid);

    int insert(CrmBusiness record);

    int insertSelective(CrmBusiness record);

    List<CrmBusiness> selectByExample(CrmBusinessExample example);

    CrmBusiness selectByPrimaryKey(Integer businessid);

    int updateByExampleSelective(@Param("record") CrmBusiness record, @Param("example") CrmBusinessExample example);

    int updateByExample(@Param("record") CrmBusiness record, @Param("example") CrmBusinessExample example);

    int updateByPrimaryKeySelective(CrmBusiness record);

    int updateByPrimaryKey(CrmBusiness record);
}