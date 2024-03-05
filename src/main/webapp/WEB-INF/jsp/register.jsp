<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Beanクラスのインポート -->
<%@ page import="model.RegisterBean"%>

<%
// リクエストスコープからBeanインスタンスを取得 
RegisterBean b = (RegisterBean)request.getAttribute("rb");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認画面</title>
<style>
body {
	text-align: center
}
</style>
</head>
<body>
	<h2>入力情報を確認して登録ボタンを押してください</h2>
	名前：<strong><%=b.getName()%></strong><br>
	年齢：<strong><%=b.getAgeString()%></strong><br>
	開発経験：<strong><%=b.getLangsString()%></strong><br>
	<button class="btn" onclick="location.href='/Scope_Project_01/register.html'" >確認</button>
</body>
</html>