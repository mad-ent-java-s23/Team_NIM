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
<div class="container-fluid">

        <div class="row">
            <div class="col-sm-6 daily">
                <h2 class="text-uppercase text-bold display-1">Get today's wordle answer</h2>
                <p>Establish intellectual superiority by clicking <a href="../Team_NIM_war/getWords/WordleService/today" target="_blank">here</a></p>
            </div>

            <%-- attempt #1487 at calendar stuff --%>
            <div class="col-sm-6 select-date">
                <div class="form-group">
                    <h2 class="text-uppercase text-bold display-1">Get a wordle answer from any day ever</h2>
                    <label class="control-label col-sm-2" for="date">Enter date with format: yyyy-mm-dd</label>
                    <div class="col-sm-4">
                        <div class="input-group date" data-provide="datepicker">
                            <input type="text" class="form-control" id="date" name="date">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-th"></span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

            <script>
                $(document).ready(function () {
                    $('#date').datepicker({
                        format: "yyyy-mm-dd"
                    });
                });
            </script>

</div>
</body>
</html>