<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${100 * 100}, <%= 100*100 %><br>
${requestScope.name}, ${requestScope["name"]},<br>
${sessionScope.address}<br>
${name}, ${address}<br>
<%
  java.util.Map<String, String> map = new java.util.HashMap<String, String>();
  map.put("name", "kcg");
  pageContext.setAttribute("map", map);
  pageContext.setAttribute("array", new String[]{"kyoto", "rakuhoku"});
%>
${map.name}, ${array[0]}, ${array[1]}<br>
<%= (int)request.getAttribute("num") + 3 %>, ${num+3}<br>
<%= request.getAttribute("notExist") %><br>
このプロパティは${requestScope.notExist}ない。<br>
\${escape}<br>
${map['name']}<br>
</body>
</html>