<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%
    // test5.jsp

    // 현재 프로젝트의 위치를 얻어옴
    String path = request.getContextPath();  // 현재 프로젝트의 위치 (예: .../ch02/web)
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Scope Test</title>
</head>
<body>
<div class="container">
    <header id="hd">
        <%@ include file="nav.jsp"%>
    </header>
    <hr>
    <h2 class="title">Scope Test</h2>
    <hr>
    <%
        // 데이터를 읽어들임
        String pg = (String) pageContext.getAttribute("pageData"); // 현재페이지만 유효하므로 당연히 오류(삐빅 정상)
        String req = (String) request.getAttribute("reqData");
        String ses = (String) session.getAttribute("sesData");
        String app = (String) application.getAttribute("appData");
        String msg = (String) request.getAttribute("msg");
    %>
    <ul class="list">
        <li>pageContext : <%=pg %></li>
        <li>request : <%=req %></li>
        <li>session : <%=ses %></li>
        <li>application : <%=app %></li>
        <li>msg : <%=msg %></li>
        <!-- 이미지 출력 -->
        <li>img : <img src="<%=path %>/img/Fromis9.jpeg" alt="프로미스나인 만세"></li>
    </ul>
    <p>
        <!-- 페이지6로 이동하는 링크 -->
        <a href="test6.jsp?req=<%=req %>&msg=<%=msg %>">페이지6로 이동하기</a><br>

        <!-- 세션에 따라 로그아웃 또는 로그인 링크 출력 -->
        <% if(ses != null) { %>
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
1. path 변수를 사용하여 현재 프로젝트의 위치를 얻어옴.
2. 다양한 스코프(페이지, 요청, 세션, 애플리케이션)에서 데이터를 읽어와서 pg, req, ses, app, msg 변수에 할당.
3. HTML 내에서 변수 값을 출력하고 이미지를 표시.
4. 페이지6로 이동하는 링크를 제공하며, 해당 링크에 req와 msg 파라미터를 전달.
5. 세션에 따라 로그아웃 또는 로그인 링크를 제공합니다. 이는 ses 변수가 null이 아닌 경우 로그아웃 링크를, 그렇지 않은 경우 로그인 링크를 출력.
--%>