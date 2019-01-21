//登录方式
function DoLogin() {
    $.ajax({
        type:"post",
        url:'/loginController/loginByInfo',
        data:{"userName":$("#userName").val(),"password":$("#password").val()},
        dataType:"json",
        success: function (data) {
        if(data.responseCode == 200){
            window.location.href="/loginController/toIndexPage";
        }else if(data.responseCode == 400){
            alert("登录失败，请校验用户名/密码")
        }else{
            alert("服务器异常！")
        }
    },
        error: function () {
        alert("服务器异常！")
    }

    })
}

//实现enter登录
$(document).keydown(function (event) {
    if (event.keyCode == 13) {
        $("#loginin").click();
    }
});