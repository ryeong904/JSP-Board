$(document).ready(function () {
  getList();

  const login = $('<button id="login">로그인</button>');
  const register = $('<button id="register">회원가입</button>');
  const logout = $('<button id="logout">로그아웃</button>');
  const myPage = $('<button id="myPage">나의 정보</button>');
  const write = $('<button id="write">글쓰기</button>');
  if (window.localStorage.getItem("id") == null){
    logout.remove();
    myPage.remove();
    write.remove();
    login.appendTo('.btnSection');
    register.appendTo('.btnSection');
  } else {
    login.remove();
    register.remove();
    logout.appendTo('.btnSection');
    myPage.appendTo('.btnSection');
    write.appendTo('.btnSection');
  }

  $('#register').click(() => {
    location.href = 'http://localhost:8080/view/registerForm.jsp';
  });
  $('#login').click(() => {
    location.href = 'http://localhost:8080/view/loginForm.jsp';
  });
  $('#logout').click(() => {
    window.localStorage.removeItem("id");
    location.reload();
  });
  $("#myPage").click(() => {
    location.href = "../view/myPage.jsp";
  })
  $("#write").click(() => {
    location.href = "../view/writePage.jsp";
  })
});

var getCookie = function (name) {
  var value = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
  return value ? value[2] : null;
};

var deleteCookie = function (name) {
  document.cookie = name + '=; expires=Thu, 01 Jan 1999 00:00:10 GMT;domain=http://127.0.0.1/;path=/;';
};

function getList(){
  $.ajax({
    type: 'get',
    url: '/reviews',
    contentType: 'application/json',
    success: function (result) {
      for(const value of result){
        const reviewNumber= value.id;
        const author = value.author;
        const title = value.title;
        const ott = value.ott;
        const datetime = value.datetime;
        $("table").append(
            `<tr>
                <td>${reviewNumber}</td>
                <td><a href="reviews/${reviewNumber}">${title}</a></td>
                <td>${author}</td>
                <td>${ott}</td>
                <td>${datetime}</td>
            </tr>`)
      }
    },
  });
}
