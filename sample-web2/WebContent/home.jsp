<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>ホーム</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>ホーム画面</h1>
</div>
<div>
<ul>
<li>
<img src ="book-image1.jpg">
</li>
</ul>
</div>
<s:include value="footer.jsp"/>
</body>
</html>