package com.wax.lp.dao;

import com.wax.lp.bean.CrmSmsRecord;
import com.wax.lp.bean.CrmSmsRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmSmsRecordMapper {
    long countByExample(CrmSmsRecordExample example);

    int deleteByExample(CrmSmsRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmSmsRecord record);

    int insertSelective(CrmSmsRecord record);

    List<CrmSmsRecord> selectByExampleWithBLOBs(CrmSmsRecordExample example);

    List<CrmSmsRecord> selectByExample(CrmSmsRecordExample example);

    CrmSmsRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmSmsRecord record, @Param("example") CrmSmsRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") CrmSmsRecord record, @Param("example") CrmSmsRecordExample example);

    int updateByExample(@Param("record") CrmSmsRecord record, @Param("example") CrmSmsRecordExample example);

    int updateByPrimaryKeySelective(CrmSmsRecord record);

    int updateByPrimaryKeyWithBLOBs(CrmSmsRecord record);

    int updateByPrimaryKey(CrmSmsRecord record);
}