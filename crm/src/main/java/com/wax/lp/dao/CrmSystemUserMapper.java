package com.wax.lp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.wax.lp.bean.CrmSystemUser;
import com.wax.lp.bean.CrmSystemUserExample;
@Repository
public interface CrmSystemUserMapper {
    long countByExample(CrmSystemUserExample example);

    int deleteByExample(CrmSystemUserExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(CrmSystemUser record);

    int insertSelective(CrmSystemUser record);

    List<CrmSystemUser> selectByExample(CrmSystemUserExample example);

    CrmSystemUser selectByPrimaryKey(Integer sid);
    
    CrmSystemUser selectByUserName(String username);

    int updateByExampleSelective(@Param("record") CrmSystemUser record, @Param("example") CrmSystemUserExample example);

    int updateByExample(@Param("record") CrmSystemUser record, @Param("example") CrmSystemUserExample example);

    int updateByPrimaryKeySelective(CrmSystemUser record);

    int updateByPrimaryKey(CrmSystemUser record);
}