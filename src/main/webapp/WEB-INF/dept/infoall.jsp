<%@page import="java.util.List"%>
<%@page import="webapp.model.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>infoall.jsp</title>
<style type="text/css">
table {
	border: 1px solid red;
	border-collapse: collapse;
}

th, td {
	border: 1px dotted blue;
	padding: 2px;
}

td:HOVER {
	background-color: orange;
}
</style>
<script type="text/javascript">
	window.onload =function(){
		var tds =document.querySelectorAll("td");
	
		for(var i =0; i < tds.length;i++){
			tds[i].onclick =function(){
				if(this.style.color != "red")
				this.style.color ="red";
				else {
					this.style.color ="black";	
				}
			}
		}
		
	}

</script>

</head>
<body>
	<hr>
	<h1>부서 정보 all</h1>
	<hr>
	<table>
		<tr>
			<th>DETNO</th>
			<th>DNAME</th>
			<th>LOC</th>
		</tr>
		<tr>
			<td>1000</td>
			<td>총무부</td>
			<td>서울</td>
		</tr>
		<tr>
			<td>1001</td>
			<td>총무부</td>
			<td>서울</td>
		</tr>
		<tr>
			<td>1002</td>
			<td>총무부</td>
			<td>서울</td>
		</tr>
		<tr>
			<td>1003</td>
			<td>총무부</td>
			<td>서울</td>
		</tr>
	</table>
	<hr>


	<%
		List<Dept> list = (List<Dept>) request.getAttribute("model");
	%>
	<table>
		<tr>
			<th>DETNO</th>
			<th>DNAME</th>
			<th>LOC</th>
		</tr>
		<%
			for (Dept d : list) {
				out.println("<tr>");
				out.println("<td>" + d.getDeptno() + "</td>");
				out.println("<td>" + d.getDname() + "</td>");
				out.println("<td>" + d.getLoc() + "</td>");
				out.println("</tr>");
			}
		%>

	</table>
	<hr>
	
	<table>
		<tr>
			<th>DETNO</th><th>DNAME</th><th>LOC</th>
		</tr>
	<c:forEach var="d" items="${requestScope.model}">
	<tr>
		<td>${pageScope.d.deptno}</td>
		<td>${pageScope.d.dname}</td>
		<td>${pageScope.d.loc}</td>
	</tr>
	</c:forEach>
	</table>
	<hr>
</body>
</html>