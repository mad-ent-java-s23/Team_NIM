<html>
<%@include file="taglib.jsp"%>
<c:set var="title" value="TeamNIM - Wordle Clone" />
<%@include file="head.jsp"%>
<body>
    <header>
        <img src="images/wordle.png" alt="wordle">
<%--        <div class="login">--%>
<%--            <c:choose>--%>
<%--                <c:when test="${empty userName}">--%>
<%--                    <a href = "logIn" class="button">Login</a>--%>
<%--                </c:when>--%>
<%--                <c:otherwise>--%>
<%--                    <h3>Welcome ${userName}</h3>--%>
<%--                </c:otherwise>--%>
<%--            </c:choose>--%>
<%--        </div>--%>
    </header>

    <hr>

    <main class="container-fluid">
            <div class="row">
                <div class="col-sm-6 daily text-center">
                    <h2 class="text-uppercase text-bold display-1">Get today's wordle answer</h2>
                    <%--  for testing--%>
                    <p>Establish intellectual superiority by clicking <a href="../getWords/WordleService/today" target="_blank">here</a></p>
                </div>
                <div class="col-sm-6 mx-auto all-time text-center">
                    <h2 class="text-uppercase text-bold display-1">Get every wordle answer ever</h2>
                    <a class="btn bg-primary" href="../getWords/WordleService/all" target="_blank">All the Words!</a>
                </div>
            </div>
            <hr>
            <div class="row">
                <div class="col-sm-6 select-date mx-auto text-center">
                    <%@include file="datepicker.jsp"%>
                </div>
                <div class="col-sm-6 mx-auto text-center">
                    <h2 class="text-uppercase text-bold display-1">Play with no guess limit!</h2>
                    <p>Check out wordle with no guess limit.</p>
                    <a class="btn bg-primary" href="wordle.jsp">Go Play</a>
                </div>
            </div>
    </main>

<%--    <script>--%>
<%--        document.querySelector("#datePicker").value = "";--%>
<%--        let btn = document.querySelector("#submit");--%>
<%--        btn.addEventListener("click", () => {--%>
<%--            let date = document.querySelector("#datePicker").value;--%>
<%--            console.log("Date entered: " + date);--%>
<%--        })        --%>
<%--    </script>--%>

</body>
</html>