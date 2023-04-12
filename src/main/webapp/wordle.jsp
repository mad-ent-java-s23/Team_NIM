<%@include file="taglib.jsp"%>
<c:set var="title" value="TeamNIM - Wordle Clone" />

<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Wordle</title>

  <!-- Stylesheet -->
  <link rel="stylesheet" href="style.css" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<body>
  <div class="container">
    <h1>Wordle Game</h1>
    <c:if test="${listOfColors.size() == 5}" >
      <div class="m-3 row">
        <c:forEach var="color" items="${listOfColors}" varStatus="status">
          <span class="${color} col-2 display-4 border rounded p-2 w-20 text-center">
              ${listOfCharactor[status.count - 1]}
          </span>
        </c:forEach>
      </div>
    </c:if>
      <form action="processWord" method="get">
        <div class="form-group">
          <label for="word">Word</label>
          <input type="text" class="form-control" id="word" name="word">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
  </div>
</body>
</html>