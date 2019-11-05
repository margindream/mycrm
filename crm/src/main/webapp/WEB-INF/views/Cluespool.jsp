<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>线索池页面</title>
</head>
<body>
<%@include file="index.jsp" %>
	<div class="container-fluid">
		<div>
			<ul class="nav nav-tabs">
				<li role="presentation" ><a href="${sessionScope.basePath}/user/xs.crm"
					class="glyphicon glyphicon-bell"> 线索</a></li>
				<li role="presentation" class="active"><a href="${sessionScope.basePath}/user/goCluespool.crm"
					class="glyphicon glyphicon-credit-card"> 线索池</a></li>
				<li role="presentation"><a href="${sessionScope.basePath}/user/gostatistics.crm"
					class="glyphicon glyphicon-stats"> 统计</a></li>
				<li role="presentation"><a href="${sessionScope.basePath}/user/gohelp.crm"
					class="glyphicon glyphicon-question-sign"> 帮助</a></li>
			</ul>
		</div>
	</div>
	<br>
	<div class="row">
			<div class="col-md-1">
				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						批量操作 <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<li><a href="#">批量删除线索</a></li>
						<li><a href="#">批量放入线索池</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-2">

				<div class="dropdown">

					<button class="btn btn-default dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						--选择筛选条件-- <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul>
				</div>
			</div>

			<div class="col-md-1">
				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						包含 <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul>
				</div>
			</div>

			<div class="col-md-3">
				<form class="form-inline" action="${sessionScope.basePath}/user/getThreads.crm" method="post">
					<div class="form-group">
						<input type="text" class="form-control" name="companyname"
							placeholder="公司名称">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
				</form>
			</div>

			<div class="col-md-1">
				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						发送短信<span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-2">
				<div class="dropdown">
					<button class="btn btn-default dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						发送邮件<span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-1">
				<a class="btn btn-primary" href="${sessionScope.basePath}/user/goaddthread.crm" role="button">+新建线索</a>
			</div>
			<div class="col-md-1 navbar-right">
				<div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						 线索工具 <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another</a></li>
						<li><a href="#">Somethi</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separed</a></li>
					</ul>
				</div>
			</div>
		</div>
		
		<!-- 全选 -->
<script>
		  $(function() {
		         $("#checkAll").click(function() {
		            if ($("#checkAll").prop("checked")== true) {
		                // 上面的复选框已被选中
		                $(":checkbox[name='ids']").prop("checked", true);
		            } else {
		                // 上面的复选框没被选中
		                $(":checkbox[name='ids']").prop("checked", false);
		            }
		        });
		    });
</script>
<br>

		<div>
			<table class="table table-bordered" >
					<tr>
						<th>全选<br><input type="checkbox" id="checkAll"/></th>
						<th>公司名称</th>
						<th>联系人姓名</th>
						<th>尊称</th>
						<th>手机</th>
						<th>下次联系内容</th>
						<th>下次联系时间</th>
						<th>负责人</th>
						<th>创建者</th>
						<th>创建时间</th>
						<th>操作</th>
					</tr>
					
				  <c:forEach items="${pageInfo.list}" var="threadpool">
					<tr>
						<td><input value="${threadpool.treadid}" type="checkbox"  name="ids"/></td>
						<td>${threadpool.companyname}</td>
						<td>${threadpool.contactsname}</td>
						<td>${threadpool.saltname}</td>
						<td>${threadpool.mobile}</td>
						<td>${threadpool.nextstep}</td>
						<td>${threadpool.nexttime}</td>
						<td>${threadpool.ownerid}</td>
						<td>${threadpool.createid}</td>
						<td>${threadpool.createtime}</td>
						<td>&nbsp;
							<a class="btn btn-success" href="#"/>查看</a>
							<a class="btn btn-success" href="#">升级为客户</a>
							<a class="btn btn-danger"  onclick="">删除</a>
						</td>
					</tr>
				  </c:forEach>
			</table>
	</div>		
	 <div class="col-md-6">
    	<span>当前显示第&nbsp;${pageInfo.getPageNum()}&nbsp;页,共&nbsp;${pageInfo.getTotal()}&nbsp;条记录,共&nbsp;${pageInfo.getPages()}&nbsp;页</span>
		<div class="pagination pagination-centered" >
		   <ul class="bottom" >
			  	<a href="${sessionScope.basePath}/user/xs.crm?pn=1">首页</a>
			  <c:if test="${pageInfo.isFirstPage == false}">
			  		<a href="${sessionScope.basePath}/user/xs.crm?pn=${pageInfo.prePage}">上一页</a>
			  </c:if>
					<c:forEach items="${pageInfo.navigatepageNums}" var="item">
						<a href="${sessionScope.basePath}/user/xs.crm?pn=${item}">${item}</a>
					</c:forEach>
				<c:if test="${pageInfo.hasNextPage == true}">
			  		<a  href="${sessionScope.basePath}/user/xs.crm?pn=${pageInfo.nextPage}">下一页</a>
			  </c:if>
			  		<a href="${sessionScope.basePath}/user/xs.crm?pn=${pageInfo.getPages()}">末页</a>
			</ul>
		</div>
	</div>	
		 <span><form action="${sessionScope.basePath}/user/xs.crm" method="POST">跳转至&nbsp;<input type="text" name="pn"/>&nbsp;页&nbsp;&nbsp;&nbsp;<input type="submit" value="跳转"></form></span>	
	
</body>
</html>