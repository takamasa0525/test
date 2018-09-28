<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<title>ItemList画面</title>

	<style type="text/css">
		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-family:Verdana,Helvetica,sans-serif;
			font-size:12px;
			color:#333;
			background:#fff;
		}

		table{
			text-align:center;
			margin:0 auto;
			border:1px solid black;
		}
		/* ========ID LAYOUT======== */
		#top{
			width:780px;
			margin:30px auto;
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
			background-color:black;
			clear:both;
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
			<p>ItemList</p>
		</div>
		<div id="itemList">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>商品名</th>
					<th>値段</th>
					<th>在庫</th>
					<th>登録日時</th>
					<th>更新日時</th>
				</tr>
				<s:iterator value="itemList">
					<tr>
						<td><s:property value="id"/></td>
						<td><a href='<s:url action="ItemInfoAction"><s:param name="id" value="%{id}"/></s:url>'><s:property value="itemName"/></a></td>
						<td><s:property value="itemPrice"/>円</td>
						<td><s:property value="itemStock"/>個</td>
						<td><s:property value="insertDate"/></td>
						<td><s:property value="updateDate"/></td>
					</tr>
				</s:iterator>
			</table>
			<s:form action="ItemDeleteAllAction"><input type="hidden" name="deleteFlg" value="1"><s:submit value="全削除"/></s:form>
		</div>
		<div id="text-center">
			<p>Admin画面に戻る場合は
				<a href='<s:url action="GoAdminAction"/>'>こちら</a></p>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>