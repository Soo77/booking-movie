<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>코드그룹 목록</title>
  <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'>
  <link rel='stylesheet' href='/css/common.css'>
</head>
<body>


<div id='content'>
<h1>코드그룹 목록</h1>
<a href='form'>신규</a><br>
<table class='table table-hover'>
<tr>
  <th>코드ID</th>
  <th>코드명</th>
  <th>수정가능</th>
  <th>비고</th>
</tr>
<c:forEach items="${commCodeGroups}" var="commCodeGroup">
<tr>
    <td>${commCodeGroup.groupcodeId}</td>
    <td><a href="detail?groupcodeId=${commCodeGroup.groupcodeId}">${commCodeGroup.groupcodeName}</a></td>
    <td>${commCodeGroup.editableYn}</td>
    <td>${commCodeGroup.remark}</td>
  </tr>
</c:forEach>  
</table>
</div>


</body></html> 