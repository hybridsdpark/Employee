
<%@page import="webapp.model.weather.Forecast"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<title>weather.jsp</title>
</head>
<body>
<hr>
<h1>날씨 정보 조회 결과</h1>
<hr>
${requestScope.weather.current.temperature}<br>
${requestScope.weather.current.skycode}<br>
${requestScope.weather.current.skytext}<br>


${requestScope.weather.forecasts[0].low}<br>
${requestScope.weather.forecasts[0].high}<br>
${requestScope.weather.forecasts[0].date}<br>

</body>
</html>