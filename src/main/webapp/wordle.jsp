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
<body class="bg-dark">
  <div class="container">
    <div class="bg-white rounded p-3 m-5">
      <h1 class="text-center">Wordle Game</h1>
      <c:if test="${listOfColors.size() == 5}" >
        <div class="m-3 row">
          <c:forEach var="color" items="${listOfColors}" varStatus="status">
          <span class="${color} col-1 display-4 border rounded p-2 w-20 text-center">
              ${listOfCharactor[status.count - 1]}
          </span>
          </c:forEach>
        </div>
      </c:if>
      <div class="m-3 row">
        <img class="col-6 w-50" src="https://www.cnet.com/a/img/resize/62bd01d2084ef81d81666dd4868eca0065109ca6/hub/2021/12/21/1fdd648c-ffaa-4503-8a3c-50b58628bd42/screen-shot-2021-12-21-at-11-34-54-am.png?auto=webp&precrop=1144,949,x0,y11&width=1200">
        <form class="col-6" action="processWord" method="get">
          <div class="form-group">
            <label for="word">Enter your Guess</label>
            <input type="text" class="form-control" id="word" name="word">
          </div>
          <div class="form-group mt-2">
            <button type="submit" class="btn btn-primary">Submit</button>
          </div>
        </form>
      </div>
    </div>
  </div>
</body>
</html>