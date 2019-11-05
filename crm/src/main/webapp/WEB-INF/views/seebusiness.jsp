<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="index.jsp"%>
	<h4>
		<font color="red">${message}</font>
	</h4>
	<div style="background-color: #ADADAD">
		<div class="row">
			<h3 align="center">商机详情</h3>
		</div>
		<hr>
		<div align="center">
			<form action="${sessionScope.basePath}/updatebusiness" method="POST">
				<input type="hidden" name="businessid"
					value="${business.businessid}">
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">负责人：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="ownerid" value="${business.ownerid}">
					</div>
					<div class="col-md-1">创建时间：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="date"
							name="createtime" value="${business.createtime}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">上次推进时间：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="date"
							name="updatetime" value="${business.updatetime}">
					</div>
					<div class="col-md-1">客户：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="customerid" value="${business.customerid}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">商机金额：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="totalprice" value="${business.totalprice}">
					</div>
					<div class="col-md-1">商机名：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text" name="name"
							value="${business.name}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">联系人：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="contactsid" value="${business.contactsid}">
					</div>
					<div class="col-md-1">合同签订地址：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="contractaddress" value="${business.contactaddress}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">商机类型：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text" name="type"
							value="${business.type}">
					</div>
					<div class="col-md-1">状态：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="statusid" value="${business.statusid}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">商机来源：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text" name="origin"
							value="${business.origin}">
					</div>
					<div class="col-md-1">赢单率：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="gainrate" value="${business.gainrate}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">预计成交价：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="estimateprice" value="${business.estimateprice}">
					</div>
					<div class="col-md-1">下次联系时间：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="date"
							name="nexttime" value="${business.nexttime}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">下次联系内容：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="nextstep" value="${business.nextstep}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1">备注：</div>
					<div class="col-md-2">
						<input style="border: none; margin: 2px" type="text"
							name="description" value="${business.description}">
					</div>
				
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-1"></div>
					<div class="col-md-2">
						<input type="submit" value="修改" id="tixing">
					</div>
					<div class="col-md-1">
						<a href="${sessionScope.basePath}/sj">返回</a>
					</div>
					<div class="col-md-2"></div>
				</div>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			$("#tixing").click(function() {
				alert("您确定要修改信息吗？请谨慎选择");
			})
		})
	</script>
</body>
</html>