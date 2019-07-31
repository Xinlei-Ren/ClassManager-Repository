function reverse(flag) {
    $(".left").html("");
    if (flag) {
        $(".left").load("./register.html");
    } else {
        $(".left").load("./login.html");
    }
}

$(function () {
    $(".left").load("./login.html");
});

function goTeacherLogin(flag) {
    $(".left").html("");
    if (flag) {
        $(".left").load("./login.html");
    } else {
        $(".left").load("./login.html");
    }
}