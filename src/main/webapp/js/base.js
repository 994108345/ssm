/*left下拉列表*/
$(document).ready(function() {
    $("#menu>ul>li").bind('mouseover',function(){ // 顶级菜单项的鼠标移入操作
    $(this).children('ul').slideDown('fast');
    }).bind('mouseleave',function(){ // 顶级菜单项的鼠标移出操作
    $(this).children('ul').slideUp('fast');
    });
    /*$('#menu>ul>li>ul li').bind('mouseover',function(){ // 子菜单的鼠标移入操作
        $(this).children('ul').slideDown('fast');
    }).bind('mouseleave',function() // 子菜单的鼠标移出操作
    {
        $(this).children('ul').slideUp('fast');
    });*/
});
/*添加角色的json表单异步判断*/
function validationRole(){
    var role=document.getElementById("addRole-roleName");
    var roleName=role.value;
    var data=roleName;
    alert(data);
    $.ajax({
        type:'POST',
        async:false,
        dataType:"json",
        contentType: "text/html;charset=UTF-8",
        url: "/wssm/jurisdiction/validation",
        data:roleName, //传参
        success: function (result) {
            alert(result);
            var errorMessage=result;
            $("#addRole-roleName").val(result);
            alert("进来了0");
        },
        error: function (){
            alert(result);
            alert(result[0]);
            var errorMessage=data;
           $("#addRole-errorMessage").text(errorMessage);
            alert("成功："+result);
        }
    });
}
/*检测用户权限单选框是否被选择*/
function checkUser(){
    var user=document.getElementById("addRole-user");
    var userValue=user.checked;
    return userValue;


}
/*检测日志权限单选框是否被选择*/
function checkLog(){
    var log=document.getElementById("addRole-log");
    var logValue=log.checked;
    return logValue;
}
/*检测账号权限单选框是否被选择*/
function checkAccount(){
    var account=document.getElementById("addRole-account");
    var accountValue=account.checked;
    return accountValue;
}
/*检测权限单选框是否被选择*/
function checkJurisdiction(){
    var jurisdiction=document.getElementById("addRole-jurisdiction");
    var jurisdictionValue=jurisdiction.checked;
    return jurisdictionValue;
}
/*判断所有的权限单选框不能都不选，至少要选一个*/
function checkAddRole(){
    /*获取角色名*/
    var roleName=document.getElementById("addRole-roleName");
    /*获取各个单选框是否选中结果*/
    var roleNameValue=roleName.value;
    var user=checkUser();
    var log=checkLog();
    var account=checkAccount();
    var jurisdiction=checkJurisdiction();
    $("#addRole-errorMessage2").text("");
    if(user||log||account||jurisdiction){
        if (confirm("你选择的权限状态：用户信息管理:"+user+";日志信息管理:"+log+";账号管理:"+account+";权限管理:"+jurisdiction+"。您确定吗？"))
        {
            return true;
            alert("您确认了！");
        }else{
            return false;
        }

    }else{
        $("#addRole-errorMessage2").text("权限不能全部为空，请重新选择");
        return false;
    }
}
function checkNum(){
    var num=document.getElementById("modifyJurisdiction-submit");
    var submitNum=num.value;
    alert(submitNum);
    var boolean=true;
    if(null==submitNum||0==submitNum){
        alert(跳转页码不能为空或0);
        boolean=false;
    }
    if(isNaN(submitNum)){
        alert(请输入不为0的页码);
        boolean=false;
    }
    return boolean;
}