$(document).ready(function () {
  $('#submit').click(function () {
    const obj = {
      userId: $('#userId').val(),
      password: $('#password').val(),
    };
    $.ajax({
      type: 'post',
      url: '/members/login',
      contentType: 'application/json',
      data: JSON.stringify(obj),
      success: function (result) {
        alert(result);
        if(result=="ok"){
          window.localStorage.setItem("id", $('#userId').val());
          location.href = 'http://localhost:8080/';
        }
      },
    });
  });
});

var setCookie = function (name, value) {
  var date = new Date();
  date.setTime(date.getTime() + 24 * 60 * 60 * 1000);
  document.cookie =
    name + '=' + value + ';expires=' + date.toUTCString() + ';path=/';
};
