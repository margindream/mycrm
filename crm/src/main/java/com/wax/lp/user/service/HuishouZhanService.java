package com.wax.lp.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wax.lp.bean.CrmHuishouzhan;
import com.wax.lp.bean.CrmHuishouzhanExample;
import com.wax.lp.bean.CrmThread;
import com.wax.lp.dao.CrmHuishouzhanMapper;

@Service
public class HuishouZhanService{
	
	@Autowired
	private CrmHuishouzhanMapper crmHuishouzhanMapper;

	public long countByExample(CrmHuishouzhanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByExample(CrmHuishouzhanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(Integer hid) {
		// TODO Auto-generated method stub
		return crmHuishouzhanMapper.deleteByPrimaryKey(hid);
	}
	public int deleteAll() {
		// TODO Auto-generated method stub
		return crmHuishouzhanMapper.deleteAll();
	}

	public int insert(CrmThread record) {
		// TODO Auto-generated method stub
		return crmHuishouzhanMapper.insert(record);
	}

	public int insertSelective(CrmThread record) {
		// TODO Auto-generated method stub
		return crmHuishouzhanMapper.insertSelective(record);
	}

	public List<CrmHuishouzhan> selectByExample(CrmHuishouzhanExample example) {
		// TODO Auto-generated method stub
		return crmHuishouzhanMapper.selectByExample(null);
	}

	public CrmHuishouzhan selectByPrimaryKey(Integer hid) {
		// TODO Auto-generated method stub
		return crmHuishouzhanMapper.selectByPrimaryKey(hid);
	}

	public int updateByExampleSelective(CrmHuishouzhan record, CrmHuishouzhanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExample(CrmHuishouzhan record, CrmHuishouzhanExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(CrmHuishouzhan record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(CrmHuishouzhan record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public long saveCrmHuiShouZhanLists(List<CrmThread> crmThreads){
		// TODO Auto-generated method stub
		return crmHuishouzhanMapper.saveCrmHuiShouZhanLists(crmThreads);
	}
	
	
}
