package com.wax.lp.dao;

import com.wax.lp.bean.CrmMessage;
import com.wax.lp.bean.CrmMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmMessageMapper {
    long countByExample(CrmMessageExample example);

    int deleteByExample(CrmMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmMessage record);

    int insertSelective(CrmMessage record);

    List<CrmMessage> selectByExampleWithBLOBs(CrmMessageExample example);

    List<CrmMessage> selectByExample(CrmMessageExample example);

    CrmMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmMessage record, @Param("example") CrmMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") CrmMessage record, @Param("example") CrmMessageExample example);

    int updateByExample(@Param("record") CrmMessage record, @Param("example") CrmMessageExample example);

    int updateByPrimaryKeySelective(CrmMessage record);

    int updateByPrimaryKeyWithBLOBs(CrmMessage record);

    int updateByPrimaryKey(CrmMessage record);
}