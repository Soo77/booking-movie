<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id='content'>
<h1>코드그룹 목록</h1>
<a href='form'>신규</a><br>
<table class='table table-hover'>
<tr>
  <th>코드ID</th>
  <th>코드명</th>
</tr>
<c:forEach items="${members}" var="member">
  <tr>
    <td>${member.id}</td>
    <td>${member.name}</td>
  </tr>
</c:forEach>  
</table>
</div>
</body>
</html>