<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%
  // Scope Test - test4.jsp

  // pageContext에 데이터 설정: 현재 페이지에서만 유효한 스코프
  pageContext.setAttribute("pageData", "페이지컨텍스트1"); // 현재페이지에서만 적용되므로 당연히 오류남(삐빅 정상)

  // request 스코프에 데이터 설정: 현재 요청에 대한 범위
  request.setAttribute("reqData", "요청한데이터");

  // session 스코프에 데이터 설정: 현재 세션에 대한 범위
  session.setAttribute("sesData", "세션데이터");

  // application 스코프에 데이터 설정: 웹 애플리케이션 전체에 대한 범위
  application.setAttribute("appData", "애플리케이션데이터");

  // "msg" 변수에 메시지 설정
  request.setAttribute("msg", "중간고사 파이팅!!");

  // 다른 JSP 페이지로 포워딩
  RequestDispatcher rd = request.getRequestDispatcher("test5.jsp");
  rd.forward(request, response);
%>
