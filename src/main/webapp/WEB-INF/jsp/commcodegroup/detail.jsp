<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>게시물 보기</title>
  <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'>
  <link rel='stylesheet' href='/css/common.css'>
</head>
<body>
    
<div id='content'>
<h1>게시물</h1>
<form action='update' method='post'>
코드ID : <input type='text' name='groupcodeId' value='${commCodeGroup.groupcodeId}' readonly><br>
코드명 : <textarea name='groupcodeName' rows='5'
            cols='50'>${commCodeGroup.groupcodeName}</textarea><br>
<button>변경</button>
<a href='delete?groupcodeId=${commCodeGroup.groupcodeId}'>삭제</a>
</form>
</div>

</body>
</html>