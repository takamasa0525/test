<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>


<title>Home画面</title>

<style type="text/css">
	body{
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-self;
		font-size:12px;
		color:#333;
		background-color:#fff;
	}
	table{
		text-align:center;
		margin:0 auto;
	}
	#top{
		width:100%;
		margin:30px;
		border:1px solid #333;
	}
	#header{
		width:100%;
		height:80px;
		background-color:black;
	}
	#main{
		width:100%;
		height:500px;
		text-align:center;
	}
	#footer{
		width:100%;
		height:80px;
		text-align:center;
		background-color:black;

	}
	#text-center{
		display:inline-height;
		text-align:center;
	}
</style>

</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>Home</p>
		</div>

	<div id="text-center">
		<s:form action="HomeAction">
			<s:submit value="商品購入"/>
		</s:form>
		<s:if test="#session.id!=null">
			<p>ログアウトする場合は
				<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
		</s:if>

		</div>
	</div>
	<div id = "footer">
		<div id ="pr">
		</div>
	</div>


</body>
</html>