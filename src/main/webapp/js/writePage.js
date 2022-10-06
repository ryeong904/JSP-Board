$(document).ready(function () {
    $("#submit").click(() => {
        alert(window.localStorage.getItem("id"))
        const obj = {
            title: $('#title').val(),
            content: $('#content').val(),
            ott: $('#ott').val(),
            author: window.localStorage.getItem("id")
        }
        $.ajax({
            type: 'post',
            url: '/reviews',
            contentType: 'application/json',
            data: JSON.stringify(obj),
            success: function (result) {
                location.href = 'http://localhost:8080/';
            },
        });
    })
});
