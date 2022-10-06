$(document).ready(function () {
  $('#submit').click(function () {
    const obj = {
      userId: $('#userId').val(),
      password: $('#password').val(),
      nickname: $('#nickname').val(),
    };
    $.ajax({
      type: 'post',
      url: '/members',
      contentType: 'application/json',
      data: JSON.stringify(obj),
      success: function (result) {
        location.href = 'http://localhost:8080/';
      },
    });
  });
});
