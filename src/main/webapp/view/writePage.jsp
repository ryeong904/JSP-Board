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
<h1>글 작성</h1>
<form>
    <p><input type="text" size=25 id="title" placeholder="제목" required></p>
    <p><textarea cols=35 rows=15 id="content" placeholder="내용을 입력하세요."></textarea></p>
    <p>
        <select id="ott">
            <option value="Netflix">넷플릭스</option>
            <option value="Watcha">왓챠</option>
            <option value="Wave">웨이브</option>
            <option value="Disney+">디즈니 플러스</option>
        </select>
    </p>
    <p><input type="button" value="글쓰기" id="submit"></p>
</form>
<script src="../js/writePage.js"></script>
</body>
</html>
