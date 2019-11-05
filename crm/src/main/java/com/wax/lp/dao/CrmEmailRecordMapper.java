package com.wax.lp.dao;

import com.wax.lp.bean.CrmEmailRecord;
import com.wax.lp.bean.CrmEmailRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmEmailRecordMapper {
    long countByExample(CrmEmailRecordExample example);

    int deleteByExample(CrmEmailRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmEmailRecord record);

    int insertSelective(CrmEmailRecord record);

    List<CrmEmailRecord> selectByExample(CrmEmailRecordExample example);

    CrmEmailRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmEmailRecord record, @Param("example") CrmEmailRecordExample example);

    int updateByExample(@Param("record") CrmEmailRecord record, @Param("example") CrmEmailRecordExample example);

    int updateByPrimaryKeySelective(CrmEmailRecord record);

    int updateByPrimaryKey(CrmEmailRecord record);
}