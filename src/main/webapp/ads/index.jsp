<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
    <title>Welcome to the Adlister!</title>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />
    <h1>Welcome to the Ads Index Page</h1>
    <div class="container">
        <h1>Here Are all the ads!</h1>

        <c:forEach var="ad" items="${ads}">
            <div class="col-md-6">
                <h2>${ad.title}</h2>
                <p>${ad.description}</p>
            </div>
        </c:forEach>
    </div>

</body>
</html>
