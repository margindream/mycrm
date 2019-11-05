package com.wax.lp.dao;

import com.wax.lp.bean.CrmPosition;
import com.wax.lp.bean.CrmPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmPositionMapper {
    long countByExample(CrmPositionExample example);

    int deleteByExample(CrmPositionExample example);

    int deleteByPrimaryKey(Integer positionid);

    int insert(CrmPosition record);

    int insertSelective(CrmPosition record);

    List<CrmPosition> selectByExample(CrmPositionExample example);

    CrmPosition selectByPrimaryKey(Integer positionid);

    int updateByExampleSelective(@Param("record") CrmPosition record, @Param("example") CrmPositionExample example);

    int updateByExample(@Param("record") CrmPosition record, @Param("example") CrmPositionExample example);

    int updateByPrimaryKeySelective(CrmPosition record);

    int updateByPrimaryKey(CrmPosition record);
}