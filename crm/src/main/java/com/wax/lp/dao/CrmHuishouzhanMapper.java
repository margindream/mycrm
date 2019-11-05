package com.wax.lp.dao;

import com.wax.lp.bean.CrmHuishouzhan;
import com.wax.lp.bean.CrmHuishouzhanExample;
import com.wax.lp.bean.CrmThread;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmHuishouzhanMapper {
    long countByExample(CrmHuishouzhanExample example);

    int deleteByExample(CrmHuishouzhanExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(CrmThread record);

    int insertSelective(CrmThread record);

    List<CrmHuishouzhan> selectByExample(CrmHuishouzhanExample example);

    CrmHuishouzhan selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") CrmHuishouzhan record, @Param("example") CrmHuishouzhanExample example);

    int updateByExample(@Param("record") CrmHuishouzhan record, @Param("example") CrmHuishouzhanExample example);

    int updateByPrimaryKeySelective(CrmHuishouzhan record);

    int updateByPrimaryKey(CrmHuishouzhan record);
    
    int deleteAll();
    
    long saveCrmHuiShouZhanLists(List<CrmThread> crmThread);
}