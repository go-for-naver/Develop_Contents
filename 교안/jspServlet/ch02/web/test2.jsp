<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%-- 스크립트릿 언어로 자바의 객체 요소를 임포트 하는 방식 --%>
<%@ page import="java.util.*" %>
<%@ page import="dto.Student" %>

<%-- println 오류나는건 신경쓰지 않습니다!!!!--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>객체 제어</title>
</head>
<body>
<%
    // 보내는 곳에서 데이터를 담는 부분

    // Student 객체 생성과 속성 설정
    Student st1 = new Student();
    st1.setNo(1);
    st1.setName("나는이나롱");
    st1.setKor(100);
    st1.setEng(70);
    st1.setMat(100);
    request.setAttribute("st1", st1);

    // Student 객체들을 담는 List 생성
    List<Student> st = new ArrayList<>();
    Student s = new Student();
    s.setNo(1);
    s.setName("김이름");
    s.setKor(90);
    s.setEng(80);
    s.setMat(70);
    st.add(s);
    Student s2 = new Student();
    s2.setNo(2);
    s2.setName("이이름");
    s2.setKor(100);
    s2.setEng(60);
    s2.setMat(80);
    st.add(s2);
    request.setAttribute("st", st);

    // 문자열을 담는 ArrayList 생성
    ArrayList<String> lst = new ArrayList<>();
    lst.add("오이름");
    lst.add("강이름");
    lst.add("정이름");
    lst.add("박이름");
    request.setAttribute("lst", lst);

    // 문자열을 담는 HashSet 생성
    HashSet<String> set = new HashSet<>();
    set.add("윤이름");
    set.add("임이름");
    set.add("연이름");
    set.add("고이름");
    set.add("선이름");
    set.add("전이름");
    request.setAttribute("set", set);

    // 키-값 쌍을 담는 HashMap 생성
    HashMap<String, String> map = new HashMap<>();
    map.put("no", "3");
    map.put("name", "서이름");
    map.put("kor", "80");
    map.put("eng", "90");
    map.put("mat", "85");
    request.setAttribute("map", map);

    RequestDispatcher rd = request.getRequestDispatcher("test3.jsp"); // 데이터 전송할 JSP 파일 지정
    rd.forward(request, response); // 데이터 전송

    // response.sendRedirect("test3.jsp?map=" + map); // 다른 페이지로 리다이렉트하는 경우
%>
<%
    // 받는 곳에서 데이터를 출력하는 부분
    out.println("<p>번호 : " + st1.getNo() + "</p>");
%>
<p>이름 : <%=st1.getName() %></p>
<p>국어 : <%=st1.getKor() %></p>
<p>영어 : <%=st1.getEng() %></p>
<p>수학 : <%=st1.getMat() %></p>
<p>총점 : <%=st1.getKor() + st1.getEng() + st1.getMat() %></p>
<hr>
<div class="msg">
    <h2 class="title">자바의 객체 데이터를 전송합니다.</h2>
</div>
</body>
</html>
