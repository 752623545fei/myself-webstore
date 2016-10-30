/**
 * Created by lyf on 2016/10/29.
 */
$(document).ready(function () {
    var userName = $.cookie('userName');
    var password = $.cookie('password');

    if (userName!=null && password!=null){
        $.ajax({
            type : "POST",
            url : "/WebStore/user/login/cookie",
            data : {userName:userName,
                    password:password},
            dataType : "json",
            success:function (data) {
                $('#topLead').append('<span>' + data.nickname + '</span>');
            },
            error:function () {
                alert("error!");
            }
        })
    }
});