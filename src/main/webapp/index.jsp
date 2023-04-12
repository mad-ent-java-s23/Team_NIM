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
            <div class="col-sm-6 daily text-center">
                <h2 class="text-uppercase text-bold display-1">Get today's wordle answer</h2>
                <p>Establish intellectual superiority by clicking <a href="../Team_NIM_war/getWords/WordleService/today" target="_blank">here</a></p>
            </div>

            <%-- attempt #1487 at calendar stuff --%>
            <div class="col-sm-6 select-date text-center">
                <div class="form-group text-center">
                    <h2 class="text-uppercase text-center text-bold display-1">Get a wordle answer from any day ever</h2>
                    <label class="control-label col-sm-2 text-center" for="date">Enter date with format: yyyy-mm-dd</label>
                    <div class="row text-center">
                        <div class="col-sm-4 text-center">
                            <div class="input-group date text-center" data-provide="datepicker">
                                <input type="text" class="form-control text-center" id="date" name="date">
                                <div class="input-group-addon text-center">
                                    <span class="glyphicon glyphicon-th"></span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <br>
    <br>
    <br>
    <br>
    <br>

        <%--    Just getting something up here to look up via ID --%>
        <div class="row">
            <div class="col-sm-6 mx-auto by-id text-center">
                <h2 class="text-uppercase text-bold display-1">Get a wordle answer by id</h2>
                <form action="../Team_NIM_war/getWords/WordleService/getById" class="form-inline">
                    <div class="form-group m-2">
                        <label for="word_id" class="m-1">ID</label>
                        <input type="number" class="form-control m-1 p-1" id="word_id" name="word_id" aria-describedby="SearchID-help">
                    </div>
                    <button type="submit" class="btn btn-primary">Search</button>
                </form>
            </div>
            <div class="col-sm-6 mx-auto all-time text-center">
                <h2 class="text-uppercase text-bold display-1">Get every wordle answer ever</h2>
                    <a href="../Team_NIM_war/getWords/WordleService/all" target="_blank">All the Words!</a>
                </p>
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
</body>
</html>