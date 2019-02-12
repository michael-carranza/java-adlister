<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
        <jsp:include page="/WEB-INF/partials/head.jsp">
            <jsp:param name="Register" value="Register a New User" />
        </jsp:include>
    </head>
    <body>
        <div class="container">
            <h1>Create a new Ad</h1>
            <form action="register" method="post">
                <div class="form-group">
                    <label for="username">Username</label>
                    <input id="username" name="username" class="form-control" type="text">
                    <label for="password">Password</label>
                    <input id="password" name="password" class="form-control" type="password">
                </div>
                <div class="form-group">
                    <label for="email">Email Address</label>
                    <input id="email" name="email" class="form-control" type="text">
                </div>
                <input type="submit" class="btn btn-block btn-primary">
            </form>
        </div>
    </body>
    </html>

</body>
</html>
