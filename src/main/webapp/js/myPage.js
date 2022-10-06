$(document).ready(function () {
    const user = window.localStorage.getItem("id");
    if(user == null){
        alert("잘못된 접근입니다.");
        location.href = 'http://localhost:8080/';
    }
    $("#userName").text(user);
});
