package com.wax.lp.dao;

import com.wax.lp.bean.CrmAnnouncement;
import com.wax.lp.bean.CrmAnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmAnnouncementMapper {
    long countByExample(CrmAnnouncementExample example);

    int deleteByExample(CrmAnnouncementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmAnnouncement record);

    int insertSelective(CrmAnnouncement record);

    List<CrmAnnouncement> selectByExampleWithBLOBs(CrmAnnouncementExample example);

    List<CrmAnnouncement> selectByExample(CrmAnnouncementExample example);

    CrmAnnouncement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmAnnouncement record, @Param("example") CrmAnnouncementExample example);

    int updateByExampleWithBLOBs(@Param("record") CrmAnnouncement record, @Param("example") CrmAnnouncementExample example);

    int updateByExample(@Param("record") CrmAnnouncement record, @Param("example") CrmAnnouncementExample example);

    int updateByPrimaryKeySelective(CrmAnnouncement record);

    int updateByPrimaryKeyWithBLOBs(CrmAnnouncement record);

    int updateByPrimaryKey(CrmAnnouncement record);
}