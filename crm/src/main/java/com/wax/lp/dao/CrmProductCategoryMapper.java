package com.wax.lp.dao;

import com.wax.lp.bean.CrmProductCategory;
import com.wax.lp.bean.CrmProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmProductCategoryMapper {
    long countByExample(CrmProductCategoryExample example);

    int deleteByExample(CrmProductCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmProductCategory record);

    int insertSelective(CrmProductCategory record);

    List<CrmProductCategory> selectByExample(CrmProductCategoryExample example);

    CrmProductCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmProductCategory record, @Param("example") CrmProductCategoryExample example);

    int updateByExample(@Param("record") CrmProductCategory record, @Param("example") CrmProductCategoryExample example);

    int updateByPrimaryKeySelective(CrmProductCategory record);

    int updateByPrimaryKey(CrmProductCategory record);
}