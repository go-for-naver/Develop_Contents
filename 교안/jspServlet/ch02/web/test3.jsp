<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="dto.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>객체를 받는 곳</title>
    <%
        request.setCharacterEncoding("UTF-8");
        // JSP 페이지에서 전달된 객체와 컬렉션 데이터를 받음
        // 각각의 방식은 아래에 설명
        Student st1 = (Student) request.getAttribute("st1");
        List<Student> st = (List<Student>) request.getAttribute("st");
        ArrayList<String> lst = (ArrayList<String>) request.getAttribute("lst");
        HashSet<String> set = (HashSet<String>) request.getAttribute("set");
        HashMap<String, String> map = (HashMap<String, String>) request.getAttribute("map");
    %>
</head>
<body>
<div class="container">
    <h2>Student</h2>
    <h3>Student Object</h3>
    <ul class="st1">
        <!-- Student 객체에서 정보 출력 -->
        <li>번호 : <%=st1.getNo() %></li>
        <li>이름 : <%=st1.getName() %></li>
        <li>국어 : <%=st1.getKor() %></li>
        <li>영어 : <%=st1.getEng() %></li>
        <li>수학 : <%=st1.getMat() %></li>
    </ul>
    <hr>
    <h3>Student ArrayList</h3>
    <%
        // Student 객체 리스트를 순회하며 정보 출력
        for(int i=0;i<st.size();i++){
            Student stu = st.get(i);
    %>
    <ul class="st">
        <li>번호 : <%=stu.getNo() %></li>
        <li>이름 : <%=stu.getName() %></li>
        <li>국어 : <%=stu.getKor() %></li>
        <li>영어 : <%=stu.getEng() %></li>
        <li>수학 : <%=stu.getMat() %></li>
    </ul>
    <hr>
    <%
        }
    %>
    <hr>

    <h2>ArrayList Collection</h2>
    <ul>
        <%
            // ArrayList 컬렉션을 순회하며 요소 출력
            for(int i=0;i<lst.size();i++){
        %>
        <li><%=lst.get(i) %></li>
        <%
            }
        %>
    </ul>

    <hr>
    <h2>HashSet Collection</h2>
    <ul>
        <%
            // HashSet 컬렉션을 순회하며 요소 출력
            Iterator iter = set.iterator();
            while(iter.hasNext()){
        %>
        <li><%=iter.next() %></li>
        <%
            }
        %>
    </ul>
    <hr>

    <h2>HashMap Collection</h2>
    <ul>
        <%
            // HashMap 컬렉션을 순회하며 키-값 쌍 출력
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            for(Map.Entry<String, String> entry : entrySet) {
        %>
        <li>
            키 : <span><%=entry.getKey() %></span>,
            값 : <span><%=entry.getValue() %></span>
        </li>
        <%
            }
        %>
    </ul>
    <hr>

    <h2>Map Object Access</h2>
    <h3>Map의 키만 출력 : keySet()</h3>
    <%
        // HashMap의 키 집합을 가져와서 순회하며 키와 값 출력
        Set<String> keys = map.keySet();
        for(String key:keys){
    %>
    <p>키 : <%=key %></p><p>값 : <%=map.get(key) %></p>
    <%        }    %>
    <hr>
    <h3>Map의 값만 모아서 : values()</h3>
    <%
        // HashMap의 값 컬렉션을 가져와서 순회하며 값 출력
        Collection<String> val = map.values();
        for(String item : val) {
    %>
    <p><%=item %></p>
    <%
        }
    %>
</div>
</body>
</html>
