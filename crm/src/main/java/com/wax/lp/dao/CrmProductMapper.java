package com.wax.lp.dao;

import com.wax.lp.bean.CrmProduct;
import com.wax.lp.bean.CrmProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmProductMapper {
    long countByExample(CrmProductExample example);

    int deleteByExample(CrmProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmProduct record);

    int insertSelective(CrmProduct record);

    List<CrmProduct> selectByExample(CrmProductExample example);

    CrmProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmProduct record, @Param("example") CrmProductExample example);

    int updateByExample(@Param("record") CrmProduct record, @Param("example") CrmProductExample example);

    int updateByPrimaryKeySelective(CrmProduct record);

    int updateByPrimaryKey(CrmProduct record);
}