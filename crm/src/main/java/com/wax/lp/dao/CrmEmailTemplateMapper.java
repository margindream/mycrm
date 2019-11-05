package com.wax.lp.dao;

import com.wax.lp.bean.CrmEmailTemplate;
import com.wax.lp.bean.CrmEmailTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmEmailTemplateMapper {
    long countByExample(CrmEmailTemplateExample example);

    int deleteByExample(CrmEmailTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmEmailTemplate record);

    int insertSelective(CrmEmailTemplate record);

    List<CrmEmailTemplate> selectByExample(CrmEmailTemplateExample example);

    CrmEmailTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmEmailTemplate record, @Param("example") CrmEmailTemplateExample example);

    int updateByExample(@Param("record") CrmEmailTemplate record, @Param("example") CrmEmailTemplateExample example);

    int updateByPrimaryKeySelective(CrmEmailTemplate record);

    int updateByPrimaryKey(CrmEmailTemplate record);
}