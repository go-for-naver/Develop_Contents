<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Scope Test2 - test6.jsp</title>
</head>
<body>
<div class="container">
    <header id="hd">
        <%@ include file="nav.jsp"%>
    </header>
    <hr>
    <h2 class="title">Scope Test2</h2>
    <hr>
    <%  //test6.jsp

        // 요청 파라미터로부터 데이터 읽기
        String req = request.getParameter("req");

        // 세션 스코프로부터 데이터 읽기
        String ses = (String) session.getAttribute("sesData");

        // 애플리케이션 스코프로부터 데이터 읽기
        String app = (String) application.getAttribute("appData");

        // 요청 파라미터로부터 데이터 읽기
        String msg = request.getParameter("msg");
    %>
    <ul class="list">
        <li>request : <%=req %></li>
        <li>session : <%=ses %></li>
        <li>application : <%=app %></li>
        <li>msg : <%=msg %></li>
    </ul>
    <p>
        <a href="test5.jsp">페이지5로 이동하기</a><br>

        <!-- 세션에 따라 로그아웃 또는 로그인 링크 출력 -->
        <% if(ses!=null) { %>
        <a href="logout.jsp">로그아웃</a>
        <% } else { %>
        <a href="test4.jsp">로그인</a>
        <% } %>
    </p>
</div>
</body>
</html>

<%-- 요약 --%>
<%--
1. 다양한 스코프(요청, 세션, 애플리케이션)로부터 데이터를 읽어와서 req, ses, app, msg 변수에 할당.
2. HTML 내에서 변수 값을 출력.
3. 페이지5로 이동하는 링크 걸기.
4. 세션에 따라 로그아웃 또는 로그인 링크 걸기. 이는 ses 변수가 null이 아닌 경우 로그아웃 링크를, 그렇지 않은 경우 로그인 링크를 출력.
--%>