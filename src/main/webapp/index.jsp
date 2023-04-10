<%@include file="taglib.jsp"%>
<c:set var="title" value="TeamNIM - Wordle Clone" />
<%@include file="head.jsp"%>

<html>
<body>
<header>
    <img src="images/wordle.png" alt="wordle">
    <div class="login">
        <c:choose>
            <c:when test="${empty userName}">
                <a href = "logIn" class="button">Login</a>
            </c:when>
            <c:otherwise>
                <h3>Welcome ${userName}</h3>
            </c:otherwise>
        </c:choose>
    </div>
</header>
<hr>
<div class="container m-2">
    <h2 class="text-uppercase text-bold display-1">Hello Wordle!</h2>
    <div class="row justify-content-center">
        <div class="col-4">
            <p>Wordle -- <a href="../Team_NIM_war/getWords/WordleService/today" target="_blank">Word</a> of the Day</p>
        </div>
    </div>
    <div class="row">
    <%--  TODO: Add a form or calendar to input the day for the Wordle Answer --%>
    </div>
    <hr>
</div>
</body>
</html>