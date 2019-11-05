<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看线索详情</title>
</head>
<body>
<%@include file="index.jsp" %>
<h3 align="center">线索详情</h3>
<h4><font color="red">${message}</font></h4>
<div style="background-color:#ADADAD ">
<div class="row">
     <div class="col-md-1"><h4>主要信息</h4></div>
</div>
	<div align="center">
		<form action="${sessionScope.basePath}/user/updatethread.crm" method="POST">
				<input type="hidden" name="treadid" value="${crmthread.treadid}">
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">负责人编号：</div>
					  <div class="col-md-2"><input type="text" name="ownerid" value="${crmthread.ownerid}"></div>
					  <div class="col-md-1">创建者编号：</div>
					  <div class="col-md-2"><input type="text" name="createid" value="${crmthread.createid}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">公司名称：</div>
					  <div class="col-md-2"><input type="text" name="companyname" value="${crmthread.companyname}"></div>
					  <div class="col-md-1">联系人职位：</div>
					  <div class="col-md-2"><input type="text" name="contactsposition" value="${crmthread.contactsposition}"></div>
				</div>
				
				
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">联系人姓名：</div>
					  <div class="col-md-2"><input type="text" name="contactsname" value="${crmthread.contactsname}"></div>
					  <div class="col-md-1">联系人尊称：</div>
					  <div class="col-md-2"><input type="text" name="saltname" value="${crmthread.saltname}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">联系人手机：</div>
					  <div class="col-md-2"><input type="text" name="mobile" value="${crmthread.mobile}"></div>
					  <div class="col-md-1">联系人邮箱：</div>
					  <div class="col-md-2"><input type="text" name="email" value="${crmthread.email}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">创建时间：</div>
					  <div class="col-md-2"><input type="DATE" name="createtime" value="${crmthread.createtime}"></div>
					  <div class="col-md-1">修改时间：</div>
					  <div class="col-md-2"><input type="DATE" name="updatetime" value="${crmthread.updatetime}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">是否已删除：</div>
					  <div class="col-md-2"><input type="text" name="deletestatus" value="${crmthread.deletestatus}"></div>
					  <div class="col-md-1">删除人编号：</div>
					  <div class="col-md-2"><input type="text" name="deleteuserid" value="${crmthread.deleteuserid}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">删除时间：</div>
					  <div class="col-md-2"><input type="DATE" name="deletetime" value="${crmthread.deletetime}"></div>
					  <div class="col-md-1">是否转换：</div>
					  <div class="col-md-2"><input type="text" name="istransformed" value="${crmthread.istransformed}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">转换人编号：</div>
					  <div class="col-md-2"><input type="text" name="transformuserid" value="${crmthread.transformuserid}"></div>
					  <div class="col-md-1">联系人编号：</div>
					  <div class="col-md-2"><input type="text" name="contactsid" value="${crmthread.contactsid}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">客户编号：</div>
					  <div class="col-md-2"><input type="text" name="customerid" value="${crmthread.customerid}"></div>
					  <div class="col-md-1">商机编号：</div>
					  <div class="col-md-2"><input type="text" name="businessid" value="${crmthread.businessid}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">下次联系内容：</div>
					  <div class="col-md-2"><input type="text" name="nextstep" value="${crmthread.nextstep}"></div>
					  <div class="col-md-1">下次联系时间：</div>
					  <div class="col-md-2"><input type="DATE" name="nexttime" value="${crmthread.nexttime}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">联系地址：</div>
					  <div class="col-md-2"><input type="text" name="address" value="${crmthread.address}"></div>
					  <div class="col-md-1">最后一次领取线索时间：</div>
					  <div class="col-md-2"><input type="DATE" name="havetime" value="${crmthread.havetime}"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">线索来源：</div>
					  <div class="col-md-2"><input type="text" name="source" value="${crmthread.source}"></div>
					  <div class="col-md-1">线索备注：</div>
					  <div class="col-md-2"><input type="text" name="leadnote" value="${crmthread.leadnote}"></div>
				</div>
				
				<div class="row">
					  <div class="col-md-3"></div>
					  <div class="col-md-1"></div>
					  <div class="col-md-2"><input type="submit" value="修改" id="tixing"></div>
					  <div class="col-md-1"><a href="${sessionScope.basePath}/user/xs.crm">返回</a></div>
					  <div class="col-md-2"></div>
				</div>
		</form>	
	</div>
</div>

<script type="text/javascript">
	 $(function(){
	    	$("#tixing").click(function(){
				alert("您确定要修改信息吗？请谨慎选择");
	    }) 
	    }) 
	  
	</script>
</body>
</html>