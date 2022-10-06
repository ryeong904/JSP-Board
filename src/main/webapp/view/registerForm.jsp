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
    <h1>회원가입</h1>
    <label for="userId">아이디</label>
    <input type="text" id="userId" />
    <br />
    <label for="password">비밀번호</label>
    <input type="password" id="password" />
    <br />
    <label for="nickname">닉네임</label>
    <input type="text" id="nickname" />
    <br />
    <input type="submit" value="등록" id="submit" />
    <script src="../js/registerForm.js"></script>
  </body>
</html>
