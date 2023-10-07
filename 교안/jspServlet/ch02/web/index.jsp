<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%
    String path = request.getContextPath();  //현재 프로젝트의 위치(..../ch02/web)
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>천재교육</title>
</head>
<body>
<div class="container">
    <header id="hd">
        <%@ include file="nav.jsp"%>
    </header>
    <hr>
    <div class="con" id="contents">
        <h2>메인 페이지</h2>
    </div>
</div>
</body>
</html>