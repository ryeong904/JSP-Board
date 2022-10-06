<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <title>Review Board</title>
</head>
<body>
    <h1 id="title">${review.title}</h1>
    <h2 id="author">${review.author}</h2>
    <h3 id="ott">${review.ott}</h3>
    <textarea id="content">${review.content}</textarea>
    <button onClick="location.href='http://localhost:8080'">목록으로</button>
<script src="../js/reviewPage.js"></script>
</body>
</html>
