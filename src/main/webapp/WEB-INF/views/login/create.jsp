<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録画面</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/styles.css" type="text/css">
</head>
<body>
	<h1>登録画面</h1>
	<form:form action="${pageContext.request.contextPath}/login/create"
			method="post" modelAttribute="loginForm">
			<form:input path="mailAddress" />
			<form:errors path="mailAddress" cssClass="text-error" />
	
	</form:form>

</body>
</html>