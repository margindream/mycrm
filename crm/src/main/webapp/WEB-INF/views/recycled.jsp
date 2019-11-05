<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>回收站</title>
</head>
<body>
<%@include file="index.jsp" %>
	<div align="center">
		<h3>回收站</h3>
		<hr>
		<a class="btn btn-danger" href="#" onclick="clearrecycled()">清空回收站</a>
	</div>
	<hr>
	<div align="center" style="background-color:windowframe; height: 500px; width: 1366px ">
		<table class="table table-bordered">
			<tr>
				<th>公司名称</th>
				<th>联系人姓名</th>
				<th>手机</th>
				<th>操作</th>
			</tr>
			<tr>
				 <c:forEach items="${lists}" var="thread">
					<tr>
						<td>${thread.companyname}</td>
						<td>${thread.contactsname}</td>
						<td>${thread.mobile}</td>
						<td>&nbsp;
							<a class="btn btn-danger"  onclick="deleteTea(${thread.hid})">删除</a>
						</td>
					</tr>
				  </c:forEach>
			</tr>
		</table>
	</div>
		
		<!-- 回收站删除线索信息的ajax请求 -->
   			<script>
   					//删除ajax
				    function deleteTea(hid){ 
				        confirm_ = confirm('您确定要永久删除吗?,请谨慎考虑.');
				        if(confirm_){
   						alert(hid);
				        	 $.ajax({
				                 type:"GET",
				                 url:'${basePath}/user/recycleddeleteThread.crm?hid='+hid,
				                 datatype:"json",
				                 success:function(data){
				                     alert(data.message);
				                     window.location.reload();
				                 }
				             });
				        }
				    };
				    
   					//清空回收站ajax
				    function clearrecycled(){ 
				        confirm_ = confirm('您确定清空回收站吗?,请谨慎考虑.');
				        if(confirm_){
				        	 $.ajax({
				                 type:"GET",
				                 url:'${basePath}/user/clearrecycled.crm',
				                 datatype:"json",
				                 success:function(data){
				                     alert(data.message);
				                     window.location.reload();
				                 }
				             });
				        }
				    };
			</script>
</body>
</html>