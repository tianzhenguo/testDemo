<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
<body>
	<table>
		<tr>
			<td><input type="button" value="全选/全部选" id="qx"></td>
			<td>名称</td>
			<td>导演</td>
			<td>价格</td>
			<td>发行日期</td>
			<td>时常</td>
			<td>类型</td>
			<td>年限</td>
			<td>地区</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="l">
		<tr>
			<td><input type="checkbox" id="qx1" value="${l.id }"></td>
			<td>${l.name }</td>
			<td>${l.director }</td>
			<td>${l.price }</td>
			<td>${l.date }</td>
			<td>${l.time }</td>
			<td>${l.type }</td>
			<td>${l.decade }</td>
			<td>${l.area }</td>
			<td>${l.status }</td>
			<td>操作</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
				<a href="pageNum=1">首页</a>
				<a href="pageNum=${page.pageNum-1 < 1 ? 1 : page.pageNum-1 }">上一页</a>
				<a href="pageNum=${page.pageNum+1 > page.pages ? page.pages : page.pageNum+1 }">下一页</a>
				<a href="pageNum=${page.pages }">尾页</a>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	$(function() {
		$("#qx").click(function () {
			$(":checked").prop(":checked",true);
		});
		$("#qx").click(function () {
			$(":checked").prop(":checked",false);
		})
	})
</script>
</html>