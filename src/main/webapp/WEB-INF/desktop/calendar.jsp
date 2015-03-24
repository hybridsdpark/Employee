<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calendar.jsp</title>
<script type="text/javascript">

var year;
var month;
var date;

function changeListener(){
// 	alert(this.value);
	var clac = new Date(year.value, month.value-1+1, 1);
	
	var clac2 = new Date(year.value, month.value-1, 1);
	var w = clac2.getDay();

	clac.setDate(clac.getDate()-1);
// 	alert("date= "+ clac.toLocaleString());
	
	var options ="";
	
	for(var i=0;i<clac.getDate();i++){
		options +="<option value='1'>"+(i+1)+"일</option>\n";
	}
// 	alert(options);
	date.innerHTML = options;
	
	var calendar ="";
	
	 switch(w){
	   
	   case 1:calendar +="__	"; break;
	   case 2:calendar +="__	__	";break;
	   case 3:calendar +="__	__	__	";break;
	   case 4:calendar +="__	__	__	__	";break;
	   case 5:calendar +="__	__	__	__	__	";break;
	   case 6:calendar +="__	__	__	__	__	__	";break;
	   
	   }

	 for(var i=0;i<clac.getDate();i++){
		 calendar +=" "+(i+1)+"일";
			if((w+i+1)%7==0)
				calendar +="<br>";
		}
	 
	
	result.innerHTML =calendar;
	
}

	window.onload = function(){
	year =document.querySelector("select[name=year]");
	month =document.querySelector("select[name=month]");
	date =document.querySelector("select[name=date]");
	
	year.onchange =changeListener;
	month.onchange =changeListener;
	
	
};

</script>
</head>
<body>
<hr>
<h1>Calendar</h1>
<hr>

<%
   Date current = new Date();
   pageContext.setAttribute("current", current);
   
   Date calc =new Date(current.getYear(),current.getMonth() +1,1);
   calc.setDate(calc.getDate()-1);
   pageContext.setAttribute("calc", calc);

%>
<input name="year" type="range" min="2000" max="2100" value="2015">
<input name="year" type="number" min="2000" max="2100" value="2015">
<hr>

<select name="year">
   <c:forEach var="year" begin="2000" end="2020">
      <c:if test="${year == current.year + 1900}">
         <option value="${year}" selected="selected">${year} 년도</option>
      </c:if>
      <c:if test="${year != current.year + 1900}">
         <option value="${year}">${year} 년도</option>
      </c:if>      
   </c:forEach>
</select>
<select name="month">
   <c:forEach var="month" begin="1" end="12">
      <c:if test="${month == current.month + 1 }">
         <option value="${month }" selected="selected">${month }월</option>
      </c:if>
      <c:if test="${month != current.month + 1 }">
         <option value="${month }" >${month }월</option>
      </c:if>   
   </c:forEach>
</select>
<select name="date">
   <c:forEach var="date" begin="1" end="${calc.date}">
      <c:if test="${date == current.date }">
         <option value="${date }" selected="selected">${date }월</option>
      </c:if>
      <c:if test="${date != current.date }">
         <option value="${date }" >${date }월</option>
      </c:if>   
   </c:forEach>
</select>

<div id="result" style="border: 1px solid red; height: 100px">


</div>


</body>
</html>