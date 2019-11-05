<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="index.jsp" %>
	<div class="container-fluid">
		<div>
			<ul class="nav nav-tabs">
				<li role="presentation" class="active"><a href="${sessionScope.basePath}/user/xs.crm"
					class="glyphicon glyphicon-bell"> 线索</a></li>
				<li role="presentation"><a href="${sessionScope.basePath}/threadpoolThreadPool.crm"
					class="glyphicon glyphicon-credit-card"> 线索池</a></li>
				<li role="presentation"><a href="${sessionScope.basePath}/user/gostatistics.crm"
					class="glyphicon glyphicon-stats"> 统计</a></li>
				<li role="presentation"><a href="${sessionScope.basePath}/user/gohelp.crm"
					class="glyphicon glyphicon-question-sign"> 帮助</a></li>
			</ul>
		</div>
		<br>
		<div style="background-color: rgb(230,230,230); width: 1366px; height: 20px">
			<ul class="nav nav-pills">
				<a href="${sessionScope.basePath}/user/xs.crm" class="glyphicon glyphicon-align-justify">全部 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="${sessionScope.basePath}/user/meowner.crm?ownerid=${sessionScope.crmSystemUser.sid}">我负责的 | </a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">下属负责的 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">下属创建 | </a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">已转换线索 </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="" class="glyphicon glyphicon-time">今日需联系 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">本周需联系| </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">本月需联系| </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">7日未联系 | </a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">15日未联系 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">30日未联系 | </a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">最近创建 | </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="">最近修改 </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="${sessionScope.basePath}/user/gorecycled.crm" class="glyphicon glyphicon-trash">回收站 </a>
			</ul>
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
						<li><a href="#" onclick="addThreadgoRecycled()">批量放入回收站</a></li>
						<li><a href="#" onclick="batch()">批量放入线索池</a></li>
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
					
				  <c:forEach items="${pageInfo.list}" var="thread">
					<tr>
						<td><input value="${thread.treadid}" type="checkbox"  name="ids"/></td>
						<td>${thread.companyname}</td>
						<td>${thread.contactsname}</td>
						<td>${thread.saltname}</td>
						<td>${thread.mobile}</td>
						<td>${thread.nextstep}</td>
						<td>${thread.nexttime}</td>
						<td>${thread.ownerid}</td>
						<td>${thread.createid}</td>
						<td>${thread.createtime}</td>
						<td>&nbsp;
							<a class="btn btn-success" href="${sessionScope.basePath}/user/lookthread.crm?treadid=${thread.treadid}"/>查看</a>
							<a class="btn btn-success" href="#">升级为客户</a>
							<a class="btn btn-danger"  onclick="deleteTea(${thread.treadid})">删除</a>
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
	
<!-- 删除教师信息的ajax请求 -->
   			<script>
   					//删除ajax
				    function deleteTea(treadid){   
				        confirm_ = confirm('您确定要将该条线索数据添加到回收站吗吗?');
				        if(confirm_){
				        	 $.ajax({
				                 type:"GET",
				                 url:'${basePath}/user/deleteThread.crm?treadid='+treadid,
				                 datatype:"json",
				                 success:function(data){
				                     alert(data.message);
				                     window.location.reload();
				                 }
				             });
				        }
				    };
				    
				   function batch(){
					   var id_array=[];  
					    $('input[name="ids"]:checked').each(function(){  
						id_array.push($(this).val());//向数组中添加元素  
					});  
					/* var chapterstr = id_array.join(',');//将数组元素连接起来以构建一个字符串 */
					confirm_ = confirm('您确定要将选中的线索数据添加到线索池中吗?');
			        if(confirm_){
					alert(id_array );
			        	 $.ajax({
			                 url : '${basePath}/user/addThreadgoThreadPool.crm',
			                 type : "GET",
			                 data : {"threadids" : id_array.join(",")},
			                 datatype : "json",
			                 success : function(data){
			                     alert(data.message);
			                     window.location.reload();
			                 }
			             });
			        }
				   }
				   
				   //批量删除ajax
				   function addThreadgoRecycled(){
					   var id_array=[];  
					    $('input[name="ids"]:checked').each(function(){  
						id_array.push($(this).val());//向数组中添加元素  
					});  
					/* var chapterstr = id_array.join(',');//将数组元素连接起来以构建一个字符串 */
					confirm_ = confirm('您确定要将选中的线索数据添加到回收站中吗?');
			        if(confirm_){
					alert(id_array );
			        	 $.ajax({
			                 url : '${basePath}/user/addThreadgoRecycled.crm',
			                 type : "GET",
			                 data : {"threadids" : id_array.join(",")},
			                 datatype : "json",
			                 success : function(data){
			                     alert(data.message);
			                     window.location.reload();
			                 }
			             });
			        }
				   }
</script>
</body>
</html>