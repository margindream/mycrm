package com.wax.lp.dao;

import com.wax.lp.bean.CrmBusinessProduct;
import com.wax.lp.bean.CrmBusinessProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmBusinessProductMapper {
    long countByExample(CrmBusinessProductExample example);

    int deleteByExample(CrmBusinessProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmBusinessProduct record);

    int insertSelective(CrmBusinessProduct record);

    List<CrmBusinessProduct> selectByExample(CrmBusinessProductExample example);

    CrmBusinessProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmBusinessProduct record, @Param("example") CrmBusinessProductExample example);

    int updateByExample(@Param("record") CrmBusinessProduct record, @Param("example") CrmBusinessProductExample example);

    int updateByPrimaryKeySelective(CrmBusinessProduct record);

    int updateByPrimaryKey(CrmBusinessProduct record);
}