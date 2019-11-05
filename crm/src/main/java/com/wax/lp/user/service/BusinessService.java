package com.wax.lp.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wax.lp.bean.CrmBusiness;
import com.wax.lp.bean.CrmBusinessCustomer;
import com.wax.lp.bean.CrmBusinessCustomerExample;
import com.wax.lp.bean.CrmBusinessExample;
import com.wax.lp.bean.CrmThread;
import com.wax.lp.bean.CrmThreadExample;
import com.wax.lp.dao.CrmBusinessCustomerMapper;
import com.wax.lp.dao.CrmBusinessMapper;

@Service
public class BusinessService implements CrmBusinessMapper{
	@Autowired
	private CrmBusinessMapper businessMapper;

	@Override
	public long countByExample(CrmBusinessExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CrmBusinessExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer businessid) {
		// TODO Auto-generated method stub
		return businessMapper.deleteByPrimaryKey(businessid);
	}

	@Override
	public int insert(CrmBusiness record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(CrmBusiness record) {
		
		return businessMapper.insertSelective(record);
	}

	
	@Override
	public CrmBusiness selectByPrimaryKey(Integer businessid) {
		// TODO Auto-generated method stub
		return businessMapper.selectByPrimaryKey(businessid);
	}

	@Override
	public int updateByExampleSelective(CrmBusiness record, CrmBusinessExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CrmBusiness record, CrmBusinessExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CrmBusiness record) {
		// TODO Auto-generated method stub
		return businessMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CrmBusiness record) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public List<CrmBusiness> selectByExample(CrmBusinessExample example) {
		
		return businessMapper.selectByExample(null);
	}

	

}
