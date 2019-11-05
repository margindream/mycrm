<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加商机</title>
</head>
<style type="text/css">
	.div1{
		background: #f6f5ec;
		height: 680px;
		width: 100%;
		padding:20px 100px 20px 100px;
		border:0px solid;
	}
	.div2{
		background: #fffffb;
		height: 650px;
		padding:30px 20px 20px 20px;
	}
	.jc{
		/* 字体加粗  */
		font-weight:bold;
	}
	.td1{
		border-right-style: none;
		border-left-style: none;
	}
	.td2{
		border-right-style: none;
		border-left-style: none;
		background: #EAEAEA;
	}
	.bj{
		padding:5px 5px 5px 5px;
	}
</style>

<body>
<%@include file="index.jsp" %>
	<div class="div1">
		<div class="div2">
		<div align="center">
		<font class="jc" size="4">
			添加商机
			</font>
		</div>
			
			<hr>
			<form action="${sessionScope.basePath}/addbusiness" method="POST">
				<table border="1" bordercolor="#BCD2EE" width="100%"> 
					<tr>
						<td colspan="4">
							<div class="jc" style="padding:7px 5px 7px 5px;">
							主要信息
							</div>
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								负责人：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="ownerid" class="form-control" style=display:inline;width:200px; autocomplete="off"/>
							</div>
						</td>
						<td class="td2">
							<div align='right'>
								客户：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="customerid" type="text" class="form-control" style=display:inline;width:250px; autocomplete="off"/>
							</div>
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								商机金额：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="totalprice" class="form-control" style=display:inline;width:200px; autocomplete="off"/>
							</div>
						</td>
						<td class="td2">
							<div align='right'>
								商机名：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="name" type="text" class="form-control" style=display:inline;width:250px; autocomplete="off"/>
							</div>
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								联系人：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="contactsid" type="text" class="form-control" style=display:inline;width:200px; autocomplete="off"/>
							</div>
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								合同签订地址：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
						<%@include file="/index.html"%>	
						<input type="text" placeholder="具体街道信息" > 
							</div>
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								商机类型：
							</div>
						</td>
						<td class="td1" width="350px">
							<input name="type" type="text" class="form-control" style=display:inline;width:200px; autocomplete="off"/>
						</td>
						<td class="td2">
							<div align='right'>
								状态：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
							<input name="tstatus_id" type="text" class="form-control" style=display:inline;width:200px; autocomplete="off"/>
							</div>
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								商机来源：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
							<input name="origin" type="text" class="form-control" style=display:inline;width:200px; autocomplete="off"/>
							</div>
						</td>
						<td class="td2">
							<div align='right'>
								赢单率：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="gainrate" type="text" class="form-control" style=display:inline;width:250px; autocomplete="off"/>
							</div>
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								预计成交价：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="estimateprice" class="form-control" style=display:inline;width:200px; autocomplete="off"/>
							</div>
						</td>
						<td class="td2">
							<div align='right'>
								下次联系时间：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="nexttime" type="date" class="form-control" style=display:inline;width:250px; autocomplete="off"/>
							</div>
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								下次联系内容：
							</div>
						</td>
						<td class="td1" width="350px">
							<div class="bj">
								<input name="nextstep" class="form-control" style=display:inline;width:200px; autocomplete="off"/>
							</div>
						</td>
						
					</tr>
					
					<tr>
						<td colspan="4" style="padding:7px 5px 7px 5px;">
						附加信息
						</td>
					</tr>
					<tr>
						<td class="td2">
							<div align='right'>
								备注：
							</div>
						</td>
						<td colspan="3">
							<div class="bj">
								<textarea  style=width:70%; cols="4" rows="3" ></textarea>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="4" align="center">
							<div class="bj">
								<button type="submit" class="btn btn-info">保存</button>&nbsp;&nbsp;
								<button type="submit" class="btn btn-info">保存并新建</button>&nbsp;&nbsp;
								<a href="${sessionScope.basePath}/sj" class="btn btn-default">返回</a>
							</div>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript">
	function submitForm(){
	    var form = document.getElementById("myform");
	    form.submit();
	}
</script>
</body>
</html>