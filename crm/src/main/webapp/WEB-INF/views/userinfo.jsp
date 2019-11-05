<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详细信息</title>
</head>
<body>
<%@include file="index.jsp" %>
	<div align="center" style="border:2">
	<h3>用户详细信息</h3>
		<form action="${sessionScope.basePath}/user/updateuser.crm" method="POST">
				<input type="hidden" name="sid" value="${sessionScope.crmSystemUser.sid}">
				<br><br>
		 用户名字: <input type="text" name="sname" value="${sessionScope.crmSystemUser.sname}">
				<br><br>
		 用户性别: <input type="text" name="ssex" value="${sessionScope.crmSystemUser.ssex}">
				<br><br>
		 用户密码: <input type="password" name="password" value="${sessionScope.crmSystemUser.password}">
				<br><br>
	     用户权限编号: <input type="text" name="roleid" value="${sessionScope.crmSystemUser.roleid}">
				<br><br>
		        <input type="submit" value="修改" id="tixing">
			    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="xs.crm">返回</a>
		</form>	
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