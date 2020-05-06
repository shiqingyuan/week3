<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>房间预订</title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="homes" method="post">
		类型: <select>
			<option>姓名</option>
		</select> 
		内容: <input type="text" name="name" value=""> 
		房价： <input type="text" name="p1">至 <input type="text" name="p2">
		备注： <input type="text" name="bz"> 
		预定日期： <input type="date" name="d1">至 <input type="date" name="d2"> 
		<input type="button" value="查询" onclick="query">
	</form>
	<table class="table table-hover">
		<tr>
			<td>预定日期</td>
			<td>姓名</td>
			<td>手机</td>
			<td>房型</td>
			<td>房价</td>
			<td>备注</td>
		</tr>
		<c:forEach items="${info.list}" var="h">
			<tr>
				<td><fmt:formatDate value="${h.date}" pattern="yyyy-MM-dd" /></td>
				<td>${h.name}</td>
				<td>${h.phone}</td>
				<td>${h.t_type}</td>
				<td>${h.price}</td>
				<td>${h.bz}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10"><jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>

<script type="text/javascript">
	function goPage(pageNum) {
		location.href = "/homes?pageNum=" + pageNum
	}
	
	function query() {
		
	}
	
</script>

</html>