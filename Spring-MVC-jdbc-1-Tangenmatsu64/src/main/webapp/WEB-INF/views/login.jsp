<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty errmsg}">
  <p class="error">${fn:escapeXml(errmsg)}</p>
</c:if>

<form:form action="login" method="post">
  <fieldset>
    <div>
      <label>ID</label><input type="text" name="id" value="${fn:escapeXml(param.id)}">
    </div>
    <div>
      <label>PASS</label><input type="password" name="pass" value="${fn:escapeXml(param.pass)}">
    </div>
  </fieldset>
  <input type="submit" value="ログイン">
</form:form>
<div>
  <a href="index.jsp">TOP画面に戻る</a>
</div>
</body>
</html>