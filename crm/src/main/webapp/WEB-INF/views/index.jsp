<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${sessionScope.basePath}\static\js\jquery-1.12.4.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${sessionScope.basePath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${sessionScope.basePath}\static\bootstrap-3.3.7-dist\js\bootstrap.min.js"
	type="text/javascript"></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <!-- 从商标开始部分 -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      	<li role="presentation" class="active"><a href="https://www.baidu.com"><img alt="Brand" src="${sessionScope.basePath}/jingtai/8.jpg" height="26px" lang="26px">
    		 	京唐国际 </a></li>
        <li><a href="${sessionScope.basePath}/user/xs.crm">线索</a></li>
        <li><a href="#">客户</a></li>
        <li><a href="${sessionScope.basePath}/sj">商机</a></li>
        <li ><a href="#">产品</a></li>
       <li><a href="#">任务</a></li>
       <li><a href="#">日程</a></li>
       <li><a href="#">合同</a></li>
       	<li><a href="#">财务</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
      <!-- 靠右部分 -->
      <ul class="nav navbar-nav navbar-right">
       	<li><a href="#" class="glyphicon glyphicon-envelope"></a></li>
       	<li><a href="#" class="glyphicon glyphicon-tasks"></a></li>
       	<li><a href="#" class="glyphicon glyphicon-screenshot"></a></li>
       	<li><a href="#" class="glyphicon glyphicon-star-empty"></a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${sessionScope.basePath}/user/userinfo.crm" class="btn btn-info">用户信息</a></li>
            <li><a href="${sessionScope.basePath}/user/close.crm" class="btn btn-danger">登出</a></li>
            <li><a class="btn btn-success" onclick="$('#insertsystem').modal();">注册</a></li>
          </ul>
        </li>
		<!-- 用户栏 -->
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${sessionScope.crmSystemUser.sname}<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${sessionScope.basePath}/user/userinfo.crm" class="btn btn-info">用户信息</a></li>
            <li><a href="${sessionScope.basePath}/user/close.crm" class="btn btn-danger">登出</a></li>
            <li><a class="btn btn-success" onclick="$('#insertsystem').modal();">注册</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
		<!-- 注册新用户弹框 -->
		<div class="modal fade bs-example-modal-sm"  id="insertsystem" tabindex="-1" role="dialog" aria-labelledby="selectPermissionLabel">
			  <div class="modal-dialog modal-sm" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title">注册新用户</h4>
			      </div>
			      <div class="modal-body">
			    <form method="post" action="" id="addSystem">
			      <ul>
					<li>用户名字：<input type="text" name="sname" id="tchNo"/></li>
					<li>用户性别：<input type="text" name="ssex" id="tchName"/></li>
					<li>用户密码：<input type="text" name="password" id="tchPhone"/></li>
					<li>权限编号：<input type="text" name="roleid" id="tchSubject"/></li>
				  </ul>
				</form>
			   </div>
			    <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">退出</button>
			        <button type="button" onclick="addSys()" class="btn btn-primary">注册</button>
			      </div>
			    </div>
			  </div>
			</div>
			
			<script type="text/javascript">
			function addSys(){
			    var tchName=$("#name").val();
			    var phone=$("#phone").val();
			    var tchNo=$("#tchNo").val();
			    var subject1=$("#subject").val();
				if(tchName=="" || phone=="" || tchNo=="" || subject1==""){
						alert("请将数据补充完整");
				}else{
					$.getJSON('${basePath}/user/addSystem.crm',$('#addSystem').serialize(),function(data,textStatus,jqXHR){
			    		console.log(data);
			    		alert(data.scuess); 
			    		 window.location.reload();
						});
				}
			   }
			</script>
			
</body>
</html>