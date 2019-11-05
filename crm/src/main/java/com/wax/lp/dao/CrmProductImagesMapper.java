package com.wax.lp.dao;

import com.wax.lp.bean.CrmProductImages;
import com.wax.lp.bean.CrmProductImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmProductImagesMapper {
    long countByExample(CrmProductImagesExample example);

    int deleteByExample(CrmProductImagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmProductImages record);

    int insertSelective(CrmProductImages record);

    List<CrmProductImages> selectByExample(CrmProductImagesExample example);

    CrmProductImages selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmProductImages record, @Param("example") CrmProductImagesExample example);

    int updateByExample(@Param("record") CrmProductImages record, @Param("example") CrmProductImagesExample example);

    int updateByPrimaryKeySelective(CrmProductImages record);

    int updateByPrimaryKey(CrmProductImages record);
}