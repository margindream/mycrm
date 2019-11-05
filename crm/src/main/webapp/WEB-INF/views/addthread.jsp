<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="index.jsp" %>
<hr>
<h3 align="center">添加线索</h3>
<hr>
	<h4><font color="red">${message}</font></h4>
<div style="background-color:#ADADAD ">
<div class="row">
     <div class="col-md-1"><h4>主要信息</h4></div>
</div>
	<div align="center">
		<form action="${sessionScope.basePath}/user/addthread.crm" method="POST">
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">负责人编号：</div>
					  <div class="col-md-2"><input type="text" name="ownerid"></div>
					  <div class="col-md-1">创建者编号：</div>
					  <div class="col-md-2"><input type="text" name="createid"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">公司名称：</div>
					  <div class="col-md-2"><input type="text" name="companyname"></div>
					  <div class="col-md-1">联系人职位：</div>
					  <div class="col-md-2"><input type="text" name="contactsposition"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">联系人姓名：</div>
					  <div class="col-md-2"><input type="text" name="contactsname"></div>
					  <div class="col-md-1">联系人尊称：</div>
					  <div class="col-md-2"><input type="text" name="saltname"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">联系人手机：</div>
					  <div class="col-md-2"><input type="text" name="mobile"></div>
					  <div class="col-md-1">联系人邮箱：</div>
					  <div class="col-md-2"><input type="text" name="email"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">创建时间：</div>
					  <div class="col-md-2"><input type="DATE" name="createtime"></div>
					  <div class="col-md-1">修改时间：</div>
					  <div class="col-md-2"><input type="DATE" name="updatetime"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">是否已删除：</div>
					  <div class="col-md-2"><input type="text" name="deletestatus"></div>
					  <div class="col-md-1">删除人编号：</div>
					  <div class="col-md-2"><input type="text" name="deleteuserid"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">删除时间：</div>
					  <div class="col-md-2"><input type="DATE" name="deletetime"></div>
					  <div class="col-md-1">是否转换：</div>
					  <div class="col-md-2"><input type="text" name="istransformed"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">转换人编号：</div>
					  <div class="col-md-2"><input type="text" name="transformuserid"></div>
					  <div class="col-md-1">联系人编号：</div>
					  <div class="col-md-2"><input type="text" name="contactsid"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">客户编号：</div>
					  <div class="col-md-2"><input type="text" name="customerid"></div>
					  <div class="col-md-1">商机编号：</div>
					  <div class="col-md-2"><input type="text" name="businessid"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">下次联系内容：</div>
					  <div class="col-md-2"><input type="text" name="nextstep"></div>
					  <div class="col-md-1">下次联系时间：</div>
					  <div class="col-md-2"><input type="DATE" name="nexttime"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">联系地址：</div>
					  <div class="col-md-2"><input type="text" name="address"></div>
					  <div class="col-md-1">最后一次领取线索时间：</div>
					  <div class="col-md-2"><input type="DATE" name="havetime"></div>
				</div>
				<div class="row">	
					  <div class="col-md-3"></div>
					  <div class="col-md-1">线索来源：</div>
					  <div class="col-md-2"><input type="text" name="source"></div>
					  <div class="col-md-1">线索备注：</div>
					  <div class="col-md-2"><input type="text" name=leadnote></div>
				</div>
				
				<div class="row">
					  <div class="col-md-3"></div>
					  <div class="col-md-1"></div>
					  <div class="col-md-2"><input type="submit" value="保存并新建"></div>
					  <div class="col-md-1"><a href="${sessionScope.basePath}/user/xs.crm">返回</a></div>
					  <div class="col-md-2"></div>
				</div>
		</form>	
	</div>
</div>
</body>
</html>