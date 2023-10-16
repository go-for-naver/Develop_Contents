<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!-- JSP 페이지 설정 지시어: 페이지 속성을 정의 -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Test1 - 데이터 전송하기2</title>
    <%
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
    %>
</head>
<body>
<div class="msg">
    <h2>pageContext</h2>
    <hr>
    <%
        String str = request.getParameter("str");
        // HTTP 요청에서 "str" 매개변수의 값을 가져온다.
        if(str.equals("include")){
            // 만약 "str" 값이 "include"인 경우:
            // 현재 페이지에 "target.jsp"의 내용을 포함.
            pageContext.include("target.jsp");
        } else if(str.equals("forward")){
            // 만약 "str" 값이 "forward"인 경우:
            // "target.jsp"의 내용을 현재 페이지로 전송.
            pageContext.forward("target.jsp");
        } else {
            // 그 외의 경우, "str" 값이 다른 값인 경우:
            // "잘못된 값입니다." 메시지를 출력.
            out.println("<h2>잘못된 값입니다.</h2>");
        }
    %>
</div>
</body>
</html>
