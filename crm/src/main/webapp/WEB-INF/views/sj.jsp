<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商机</title>
</head>
<body>
<%@include file="index.jsp"%>
<script>
		  $(function() {
			
		         $("#checkAll").click(function() {
		        /*    alert($("#checkAll").prop("checked"));  */
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
<div class="container-fluid">
		<div>
			<ul class="nav nav-tabs">
				<li role="presentation" class="active"><a href="#"
					class="glyphicon glyphicon-bell">商机</a></li>
				<li role="presentation"><a href="#"
					class="glyphicon glyphicon-credit-card"> 统计</a></li>
				<li role="presentation"><a href="#"
					class="glyphicon glyphicon-question-sign"> 帮助</a></li>
			</ul>
		</div>
		<br>
		<div
			style="background-color: rgb(230, 230, 230); width: 1600px; height: 20px">
			<ul class="nav nav-pills">
				<li>视图:</li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#" class="glyphicon glyphicon-align-justify">全部 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="##">我负责的 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">下属负责的 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">下属创建 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#" class="glyphicon glyphicon-time">今日需联系 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">本周需联系| </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">本月需联系| </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">7日未联系 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">15日未联系 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">30日未联系 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">最近创建 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#">最近更新 </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
			</ul>
		</div>
		<br>
		
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

				<form class="form-inline">
					<div class="form-group">
						<input type="email" class="form-control" id="####"
							placeholder="搜索内容">
					</div>
					<button type="submit" class="btn btn-default">搜索</button>
				</form>
			</div>
			
			<div class="col-md-1">
				<a href="${sessionScope.basePath}/goaddbusiness" role="button" class="btn btn-primary"role="button"><span class="glyphicon glyphicon-plus">新建商机</span></a>
			</div>
			<div class="col-md-1 ">
				<div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="true">
						商机工具 <span class="caret"></span>
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
			<div>
			<table class="table table-bordered">
				<tr class="info">
					<td>全选    <input type="checkbox" id="checkAll"></td>
					<td>名称</td>
					<td>商机来源</td>
					<td>下次联系时间</td>
					<td>下次联系内容</td>
					<td>负责者</td>
					<td>创建者</td>
					<td>创建时间</td>
					<td>更新时间</td>
					<td>操作</td>
				</tr>
				<c:forEach items="${pageInfo.list}" var="business">
					<tr class="info">
						<td><input value="${business.businessid }" type="checkbox" name="ids"></td>
						
						<td>${business.name }</td>
						<td>${business.origin }</td>
						<td>${business.nexttime }</td>
						<td>${business.nextstep }</td>
						<td>${business.ownerid}</td>
						<td>${business.creatorid }</td>
						<td>${business.createtime }</td>
						<td>${business.updatetime }</td>
						<td><a href="${sessionScope.basePath}/seebusiness?businessid=${business.businessid}" class="btn btn-primary">查看</a>&nbsp;&nbsp; <a href="#" class="btn btn-success">推进</a>&nbsp;&nbsp;
							<a href="${sessionScope.basePath}/deletebusiness?businessid=${business.businessid}"" class="btn btn-danger">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		
		
		<div class="col-md-4">
			<nav aria-label="...">
			<ul class="pager">
				<li><a href="${sessionScope.basePath }/sj?pn=1">首页</a></li>
				<c:if test="${pageInfo.isFirstPage == false }">
					<li><a
						href="${sessionScope.basePath }/sj?pn=${pageInfo.prePage}">上一页</a></li>

				</c:if>
				<c:if test="${pageInfo.hasNextPage == true }">
					<li><a
						href="${sessionScope.basePath }/sj?pn=${pageInfo.nextPage}">下一页</a></li>

				</c:if>
				<li><a href="${sessionScope.basePath }/sj?pn=${pageInfo.pages}">末页</a></li>
			</ul>
			</nav>
		</div>
		<div class="col-md-3">
			<nav aria-label="Page navigation">
			<ul class="pagination">
				<li><a
					href="${sessionScope.basePath }/sj?pn=${pageInfo.prePage}"
					aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
				</a></li>
				<c:forEach items="${pageInfo.navigatepageNums}" var="item">

					<li><a href="${sessionScope.basePath}/sj?pn=${item}">${item}</a></li>

				</c:forEach>

				<li><a
					href="${sessionScope.basePath}/sj?pn=${pageInfo.nextPage}"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
			</nav>
		</div>

	
		
		<div class="col-md-2">
			<h4>
				当前第<font color="#FF0000">${pageInfo.pageNum }</font>页 共<font
					color="#FF0000">${pageInfo.pages }</font>页
			</h4>
		</div>
		</div>
</body>
</html>