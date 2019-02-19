<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<jsp:include page="head.jsp">
    <jsp:param name="title" value="Home"/>
</jsp:include>
<body>
<jsp:include page="header.jsp">
    <jsp:param name="title" value="Home"/>
</jsp:include>
<main>
    <h1 id="status" style="color: red;"><c:out value="${user.status.description}"></c:out></h1>
    <input type="text" id="statusInput">
    <button onclick="changeStatus()">Change status</button>
    <button onclick="getFriends()">Get Friends</button>
    <div id="friends"></div>

</main>

<jsp:include page="footer.jsp">
    <jsp:param name="title" value="Chat"/>
</jsp:include>
<script src="../../../resources/static/js/changeStatus.js"></script>
<script src="../../../resources/static/js/getFriends.js"></script>
</body>
</html>