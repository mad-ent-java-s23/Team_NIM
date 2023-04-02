<%@include file="taglib.jsp"%>
<c:set var="title" value="TeamNIM - Wordle Clone" />
<%@include file="head.jsp"%>

<html>
<body>
<div class="container m-2">
    <h2>Hello Wordle!</h2>
    <div class="row justify-content-center">
        <div class="col-4">
            <p>Wordle Word of the Day<br />
                <a href="http://localhost:8088/Team_NIM_war/getWords/WordleService/today">Today's Word!</a>
            </p>
        </div>
    </div>
    <hr>
    <div class="row justify-content-center">
        <c:choose>
            <c:when test="${empty userName}">
                <a href = "logIn">Log in</a>
            </c:when>
            <c:otherwise>
                <h3>Welcome ${userName}</h3>
            </c:otherwise>
        </c:choose>
    </div>
</div>
</body>
</html>