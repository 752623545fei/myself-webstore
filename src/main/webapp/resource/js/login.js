/**
 * Created by lyf on 2016/10/29.
 */
$("#loginBtn").click(function () {
    var userName = $("#userName").val();
    var password = $("#userPassword").val();
   if ($("#rememberBox").is(":checked")){
       $.cookie('userName', userName, { expires: 7 , path:'/'});
       $.cookie('password', password, { expires: 7 , path:'/'});
   }else{
       $.cookie('userName',null);
       $.cookie('password',null);
   }
   $("#loginForm").submit();
});