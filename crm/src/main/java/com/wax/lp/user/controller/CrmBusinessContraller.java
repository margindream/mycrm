package com.wax.lp.user.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wax.lp.bean.CrmBusiness;
import com.wax.lp.bean.CrmThread;
import com.wax.lp.user.service.BusinessService;

@Controller
public class CrmBusinessContraller {
	@Autowired
	private com.wax.lp.user.service.BusinessService businss;

	@RequestMapping("/sj")
	public ModelAndView getbusinessAll(@RequestParam(value = "pn", required = true, defaultValue = "1") Integer pn,
			ModelAndView mv) {
		PageHelper.startPage(pn, 3);
		List<CrmBusiness> list = businss.selectByExample(null);
		PageInfo<CrmBusiness> pageinfo = new PageInfo<>(list, 3);
		System.out.println(list.size());
		return new ModelAndView("sj", "pageInfo", pageinfo);
	}

	// 去商机页面
	@RequestMapping("/goaddbusiness")
	public String goaddthread() {
		return "addbusiness";

	}

	@RequestMapping(value = "/addbusiness", method = RequestMethod.POST)
	public String addbusiness(CrmBusiness crmbusiness, HttpServletRequest request) {

		int num = businss.insertSelective(crmbusiness);
		if (num != 0) {
			return "redirect:/sj";
		} else {
			return "redirect:/goaddbusiness";
		}

	}

	// 查看商机详情
	@RequestMapping("/seebusiness")
	public ModelAndView lookbusiness(@RequestParam("businessid") Integer businessid) {

		if (businessid != null) {
			System.out.println(businessid);
			CrmBusiness business = businss.selectByPrimaryKey(businessid);

			return new ModelAndView("seebusiness", "business", business);
		}
		return new ModelAndView("erro", "erro", "操作失败，请返回后刷新重试");
	}

	// 修改商机信息
	@RequestMapping(value = "/updatebusiness", method = RequestMethod.POST)
	public ModelAndView business(CrmBusiness crmBusiness) {
		int count = businss.updateByPrimaryKeySelective(crmBusiness);
		System.out.println(count);
		if (count != 0) {
			return new ModelAndView("seebusiness", "message", "修改成功");
		}
		return new ModelAndView("seebusiness", "message", "修改失败，请刷新后再试！");
	}
	@RequestMapping("/deletebusiness")
	public String deletebusiness(@RequestParam("businessid") Integer businessid) {
		businss.deleteByPrimaryKey(businessid);
		return "redirect:/sj";
		
	}
}
