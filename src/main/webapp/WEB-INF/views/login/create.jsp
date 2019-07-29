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
			<h3>アドレスを入力してください</h3>
			<form:input path="mailAddress" />
			<form:errors path="mailAddress" cssClass="text-error" />
			
			<h3>パスワードを入力してください</h3>
			<form:input path="password" />
			<form:errors path="password" cssClass="text-error" />
			<form:button>登録!</form:button>
	</form:form>
	
	
	
	

</body>
</html>