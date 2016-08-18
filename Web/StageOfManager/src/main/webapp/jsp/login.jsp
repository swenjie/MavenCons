<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<!-- http://localhost:8080/StageOfManager/DealRequests -->
	<form action="../DealRequests" method="post">
	<input type="hidden" name="flag" value="login">
		<table rules="none" align="center">
			<tr>
				<td align="center">USID</td>
				<td><input type="text" name="userid" width="50"/></td>
			</tr>
			<tr align="center">
				<td>NAME</td>
				<td><input type="password" name="userid" width="50"/></td>
			</tr>
			<tr align="center">
			<td colspan="2"><input type="submit" width="35" value="submit"/>
			&nbsp;&nbsp;
			<input type="reset" value="reset"/></td></tr>
		</table>
	</form>

</body>
</html>