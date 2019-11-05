<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>统计页面</title>
</head>
<body>
<%@include file="index.jsp" %>
	<div class="container-fluid">
		<div>
			<ul class="nav nav-tabs">
				<li role="presentation" ><a href="${sessionScope.basePath}/user/xs.crm"
					class="glyphicon glyphicon-bell"> 线索</a></li>
				<li role="presentation" ><a href="${sessionScope.basePath}/user/goCluespool.crm"
					class="glyphicon glyphicon-credit-card"> 线索池</a></li>
				<li role="presentation" class="active"><a href="${sessionScope.basePath}/user/gostatistics.crm"
					class="glyphicon glyphicon-stats"> 统计</a></li>
				<li role="presentation"><a href="${sessionScope.basePath}/user/gohelp.crm"
					class="glyphicon glyphicon-question-sign"> 帮助</a></li>
			</ul>
		</div>
	</div>
</body>
</html>