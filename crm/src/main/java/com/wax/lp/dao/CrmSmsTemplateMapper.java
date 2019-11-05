package com.wax.lp.dao;

import com.wax.lp.bean.CrmSmsTemplate;
import com.wax.lp.bean.CrmSmsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmSmsTemplateMapper {
    long countByExample(CrmSmsTemplateExample example);

    int deleteByExample(CrmSmsTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmSmsTemplate record);

    int insertSelective(CrmSmsTemplate record);

    List<CrmSmsTemplate> selectByExample(CrmSmsTemplateExample example);

    CrmSmsTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmSmsTemplate record, @Param("example") CrmSmsTemplateExample example);

    int updateByExample(@Param("record") CrmSmsTemplate record, @Param("example") CrmSmsTemplateExample example);

    int updateByPrimaryKeySelective(CrmSmsTemplate record);

    int updateByPrimaryKey(CrmSmsTemplate record);
}