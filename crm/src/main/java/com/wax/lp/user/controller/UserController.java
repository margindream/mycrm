package com.wax.lp.user.controller;


import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wax.lp.bean.CrmHuishouzhan;
import com.wax.lp.bean.CrmSystemUser;
import com.wax.lp.bean.CrmThread;
import com.wax.lp.user.service.CrmSystemUserService;
import com.wax.lp.user.service.CrmThreadPoolService;
import com.wax.lp.user.service.CrmThreadService;
import com.wax.lp.user.service.HuishouZhanService;
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private CrmSystemUserService crmSystemUserService;
	
	
	@Autowired
	private CrmThreadPoolService crmThreadPoolService;
	
	@Autowired
	private CrmThreadService crmThreadService;
	
	private Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
	
	//登录方法
	@RequestMapping("/login.crm")
	public String login(/*Date time,*/@RequestParam("username") String username,@RequestParam("password")String password,ModelAndView modelAndView,HttpServletRequest request) {
		//System.out.println("$$$$$$$$$$$$$$$$4"+time);
		if(!(username.equals("")) && !(password.equals(""))){
		CrmSystemUser crmSystemUser = crmSystemUserService.selectByUserName(username);
		String sname = crmSystemUser.getSname();
		String password1 = crmSystemUser.getPassword();
		if(sname.equals(username) && password1.equals(password)){
			//绝对路径的获取
			String basePath = request.getContextPath();
			HttpSession session = request.getSession();
			System.out.println(basePath);
			session.setAttribute("basePath", basePath);
			//将获取到的用户对象放入session对象中
			session.setAttribute("crmSystemUser", crmSystemUser);
			return "index";
			}
		}
			return "redirect:/login.jsp";
			
		
	}
	
	//查看用户信息
	@RequestMapping("/userinfo.crm")
	public String userinfo() {
		return "userinfo";
	}
	
	//修改用户信息
	@RequestMapping("/updateuser.crm")
	public ModelAndView updateuser(CrmSystemUser crmSystemUser,ModelAndView model) {
		int a = crmSystemUserService.updateByPrimaryKey(crmSystemUser);
		if(a>0){
			model.addObject("scusse", "修改成功");
			return new ModelAndView("userinfo","usmodel",model);
		}else{
			model.addObject("erro", "修改失败,请返回后刷新重试");
			return new ModelAndView("erro","thmodel",model);
		}
	}
	
	//去线索页面(查看)
	@RequestMapping(value = "/xs.crm")
	public ModelAndView xiansuo(@RequestParam(value = "pn",required=true,defaultValue = "1") Integer pn,ModelAndView modelAndView) {
			PageHelper.startPage(pn, 5);
			List<CrmThread> lists = crmThreadService.selectAll();
			PageInfo<CrmThread> pageinfo = new PageInfo<CrmThread>(lists, 5);
			System.out.println(pageinfo);
		return new ModelAndView("xs","pageInfo", pageinfo);
		
	}
	
	
	@Autowired
	private HuishouZhanService huishouZhanService;
	
	
	//删除(将要删除的线索添加到回收站)线索
	@RequestMapping(value = "/deleteThread.crm",method=RequestMethod.GET)
	@ResponseBody
	public Map<String , Object> deleteThread(Integer treadid,HttpServletRequest request){
		System.out.println("*************"+treadid);
			try {
				//获取要删除的线索数据
				CrmThread crmThread = crmThreadService.selectByPrimaryKey(treadid);
				System.out.println("22222222222"+crmThread);
				//将获取到的数据放入回收站中
				huishouZhanService.insert(crmThread);
				//删除线索表中的指定数据
				int count = crmThreadService.deleteByPrimaryKey(treadid);
				System.out.println(count+"huishouzhan");
				//返回状态码
				resultMap.put("status", 200);
				resultMap.put("successCount", count);
				resultMap.put("message", "删除成功");
			} catch (Exception e) {
				resultMap.put("status", 500);
				resultMap.put("message", "删除失败，请刷新后再试！");
			}
		return resultMap;
	}
	
	//删除回收站线索
	@RequestMapping(value = "/recycleddeleteThread.crm",method=RequestMethod.GET)
	@ResponseBody
	public Map<String , Object> recycleddeleteThread(@RequestParam("hid") Integer hid){
		System.out.println("11111*************"+hid);
		try {
			int count = huishouZhanService.deleteByPrimaryKey(hid);
			System.out.println(count);
			//返回状态码
			resultMap.put("status", 200);
			resultMap.put("successCount", count);
			resultMap.put("message", "删除成功");
		} catch (Exception e) {
			resultMap.put("status", 500);
			resultMap.put("message", "删除失败，请刷新后再试！");
		}
		return resultMap;
	}
	
	//清空回收站线索
	@RequestMapping(value = "/clearrecycled.crm",method=RequestMethod.GET)
	@ResponseBody
	public Map<String , Object> clearrecycled(){
		try {
			int count = huishouZhanService.deleteAll();
			System.out.println(count);
			//返回状态码
			resultMap.put("status", 200);
			resultMap.put("successCount", count);
			resultMap.put("message", "清空成功");
		} catch (Exception e) {
			resultMap.put("status", 500);
			resultMap.put("message", "清空失败，请刷新后再试！");
		}
		return resultMap;
	}
	
	//添加线索信息
	@RequestMapping(value = "/addthread.crm",method=RequestMethod.POST)
	public ModelAndView addthread(CrmThread crmThread){
			int count = crmThreadService.insertSelective(crmThread);
			System.out.println("121212121212121212121");
			if(count != 0){
				return new ModelAndView("addthread","message","添加成功，请前往线索页面进行查看。");
			}else{
				return new ModelAndView("addthread","message","添加失败，请刷新重试。");
			}
	}
	
	//修改线索信息
	@RequestMapping(value = "/updatethread.crm",method=RequestMethod.POST)
	public ModelAndView updatethread(CrmThread crmThread){
		int count = crmThreadService.updateByPrimaryKeySelective(crmThread);
		System.out.println(count);
		if(count != 0 ){
			return new ModelAndView("threaddetails","message", "修改成功");
		}
		return new ModelAndView("threaddetails","message", "修改失败，请刷新后再试！");
	}
	//去线索页面
	@RequestMapping("/goaddthread.crm")
	public String goaddthread() {
		return "addthread";
		
	}
	
	//去回收站页面
	@RequestMapping("/gorecycled.crm")
	public ModelAndView gorecycled() {
		List<CrmHuishouzhan> lists = huishouZhanService.selectByExample(null);
		return new ModelAndView("recycled", "lists", lists);
		
	}
	
	//退出登录
	@RequestMapping("/close.crm")
	public String close(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/login.jsp";
		
	}
	//添加用户
	@ResponseBody
	@RequestMapping(value="/addSystem.crm")
	public Map<String , Object> addSystem(CrmSystemUser crmSystemUser,HttpServletResponse response){
		response.setContentType("application/json;charset=utf-8");
		int count= crmSystemUserService.insert(crmSystemUser);
		System.out.println(count);
		if (count != 0) {
				resultMap.put("status", 200);
				resultMap.put("successCount", count);
				resultMap.put("scuess", "添加成功");
		}else {
			resultMap.put("status", 500);
			resultMap.put("message", "添加失败");
		}
		return resultMap;
	}
	//查看线索详情
	@RequestMapping("/lookthread.crm")
	public ModelAndView lookthread(@RequestParam("treadid")Integer treadid){
		System.out.println(treadid);
		if(treadid != null){
			System.out.println(treadid);
			CrmThread crmthread = crmThreadService.selectByPrimaryKey(treadid);
			System.out.println(crmthread+"*********************");
			return new ModelAndView("threaddetails","crmthread",crmthread);
		}
		return new ModelAndView("erro","erro","操作失败，请返回后刷新重试");
	}
 
	//使用指定属性查询
	@RequestMapping("/getThreads.crm")
	public ModelAndView getThreads(@RequestParam("companyname")String companyname) throws UnsupportedEncodingException{
		System.out.println(companyname);
		if(!companyname.equals("")){
			System.out.println(companyname);
			List<CrmThread> lists = crmThreadService.selectByCompanyname(companyname);
			System.out.println(lists+"*********************");
			System.out.println(lists.get(0).getOwnerid()+lists.get(0).getAddress());
			PageInfo<CrmThread> pageinfo = new PageInfo<CrmThread>(lists, 5);
			System.out.println(pageinfo);
			return new ModelAndView("xs","pageInfo",pageinfo);
		}
		return new ModelAndView("erro","erro","操作失败，请返回后刷新重试");
	}
	
	//自己负责的
	@RequestMapping("/meowner.crm")
	public ModelAndView meowner(@RequestParam("ownerid")Integer ownerid){
		System.out.println(ownerid);
		if(ownerid != null){
			List<CrmThread> lists = crmThreadService.selectByOwnerid(ownerid);
			PageInfo<CrmThread> pageinfo = new PageInfo<CrmThread>(lists);
			System.out.println(pageinfo);
			return new ModelAndView("xs","pageInfo",pageinfo);
		}
		return new ModelAndView("erro","erro","操作失败，请返回后刷新重试");
	}
	
	//去统计页面
	@RequestMapping("/gostatistics.crm")
	public String gostatistics() {
		return "statistics";
		
	}
	//去帮助页面
	@RequestMapping("/gohelp.crm")
	public String gohelp() {
		return "help";
		
	}
	
	//批量将线索添加到线索池
	@RequestMapping(value = "/addThreadgoThreadPool.crm",method=RequestMethod.GET)
	@ResponseBody
	public Map<String , Object> addThreadgoThreadPool(@RequestParam("threadids")List<Integer> threadids){
		System.out.println("*************"+threadids.size()+"   "+threadids.get(0));
		if(threadids.size() != 0){
				//1.根据传进threadids集合查询线索表中选中的线索数据
				List<CrmThread> crmThreadlits = crmThreadService.selectCrmThreadListById(threadids);
				 System.out.println(1+"   "+crmThreadlits.size()+"$$$$$$$$$$$$$$$$"+crmThreadlits.get(0));
				//2.根据传进threadids集合删除线索表中选中的线索数据
				crmThreadService.deleteCrmThreadList(threadids);
				System.out.println("###############"+2);
				//3.再根据1.查到的线索数据集合为形参插入到线索池表中
				int a = crmThreadPoolService.saveCrmThreadPoolLists(crmThreadlits);
				System.out.println("3###############"+a);
				//返回状态码
				resultMap.put("status", 200);
				resultMap.put("successCount", a);
				resultMap.put("message", "批量放入线索池成功");
		}
				resultMap.put("status", 500);
				resultMap.put("message", "批量放入线索池失败，请刷新后再试！");
				return resultMap;
	}
	//批量将线索添加到回收站
	@RequestMapping(value = "/addThreadgoRecycled.crm",method=RequestMethod.GET)
	@ResponseBody
	public Map<String , Object> addThreadgoRecycled(@RequestParam("threadids")List<Integer> threadids){
		System.out.println("*************"+threadids.size()+"   "+threadids.get(0));
		if(threadids.size() != 0){
			//1.根据传进threadids集合查询线索表中选中的线索数据
			List<CrmThread> crmThreadlits = crmThreadService.selectCrmThreadListById(threadids);
			System.out.println(1+"   "+crmThreadlits.size()+"$$$$$$$$$$$$$$$$"+crmThreadlits.get(0));
			//2.根据传进threadids集合删除线索表中选中的线索数据
			crmThreadService.deleteCrmThreadList(threadids);
			System.out.println("###############"+2);
			//3.再根据1.查到的线索数据集合为形参插入到线索池表中
			long a = huishouZhanService.saveCrmHuiShouZhanLists(crmThreadlits);
			System.out.println("3###############"+a);
			//返回状态码
			resultMap.put("status", 200);
			resultMap.put("message", "批量删除成功");
		}
		resultMap.put("status", 500);
		resultMap.put("message", "批量删除失败，请刷新后再试！");
		return resultMap;
	}

}
