function reverse(flag) {
    $(".left").html("");
    if (flag) {
        $(".left").load("./register.html");
    } else {
        $(".left").load("./student_login.html");
    }
}

$(function () {
    $(".left").load("./student_login.html");
});

function goTeacherLogin(flag) {
    $(".left").html("");
    if (flag) {
        $(".left").load("./teacher_login.html");
    } else {
        $(".left").load("./student_login.html");
    }
}