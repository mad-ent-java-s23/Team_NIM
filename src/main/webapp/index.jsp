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

    <main class="container-fluid">

            <div class="row">
                <div class="col-sm-6 daily text-center">
                    <h2 class="text-uppercase text-bold display-1">Get today's wordle answer</h2>
                    <%--  for testing--%>
                    <p>Establish intellectual superiority by clicking <a href="../getWords/WordleService/today" target="_blank">here</a></p>
<%--                    <p>Establish intellectual superiority by clicking <a href="../getWords/WordleService/today" target="_blank">here</a></p>--%>
                </div>

<%--                &lt;%&ndash; attempt #1487 at calendar stuff &ndash;%&gt;--%>
<%--                <div class="col-sm-6 select-date text-center">--%>
<%--                    <div class="form-group text-center">--%>
<%--                        <h2 class="text-uppercase text-center text-bold display-1">Get a wordle answer from any day ever</h2>--%>
<%--                        <label class="control-label col-sm-2 text-center" for="date">Enter date with format: yyyy-mm-dd</label>--%>
<%--                            <div class="col-sm-4 text-center">--%>
<%--                                <div class="input-group date text-center" data-provide="datepicker">--%>
<%--                                    <input type="text" class="form-control text-center" id="date" name="date">--%>
<%--                                    <div class="input-group-addon text-center">--%>
<%--                                        <span class="glyphicon glyphicon-th"></span>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                    </div>--%>
<%--                </div>--%>

                <div class="col-sm-6 select-date mx-auto">
                    <%@include file="datepicker.jsp"%>
                </div>

            </div>
        <br>
        <br>
        <br>
        <br>
        <br>
            <%--    Just getting something up here to look up via ID --%>
            <div class="row">
                <div class="col-sm-12 mx-auto all-time text-center">
                    <h2 class="text-uppercase text-bold display-1">Get every wordle answer ever</h2>
                        <a href="../getWords/WordleService/all" target="_blank">All the Words!</a>
<%--                        <a href="../getWords/WordleService/all" target="_blank">All the Words!</a>--%>
                    </p>
                </div>
            </div>
    </main>

    <script>
        document.querySelector("#datePicker").value = "";
        let btn = document.querySelector("#submit");
        btn.addEventListener("click", () => {
            let date = document.querySelector("#datePicker").value;
            console.log("Date entered: " + date);
        })

        // $(document).ready(function () {
        //     $('#date').datepicker({
        //         format: "yyyy-mm-dd"
        //     });
        //
        // });
    </script>

</body>
</html>