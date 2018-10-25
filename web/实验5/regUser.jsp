<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新用户注册</title>
    <script>
        var inputs=document.getElementsByTagName('input');
        var email=document.getElementsByTagName("textarea");

        function onfocus(inputs) {
            var node = inputs.parentNode.childNodes;
            alert(node.length);
            for (var i = 0; i < node.length; i++) {
                alert(node[i].nodeName);
                if (node[i].nodeName == "#text") {
//                            alert('div');
                    node[i].nodeValue = "*必填";
                    break;
                }
            }
//                    alert(node.length);
        }

        for(var i=0;i<4;i++) {
            inputs[i].onfocus = onfocus(inputs[i]);
        }

        function check(){
            /*
            * 必填字段，邮件，电话格式和长度检测,注意中文处理
            * */
            for(var i=0;i<4;i++){

                if(inputs[i].value==""){
                    var node=inputs[i].parentNode.childNodes;
                    for(var i=0;i<node.length;i++){
//                        alert(node[i].nodeName);
                        if(node[i].nodeName=="#text"){
//                            alert('div');
                            node[i].nodeValue="字段值不能为空！";
                            break;
                        }
                    }
                    return;
                }
            };

            if(inputs[1].value!=inputs[2].value){
                var node=inputs[2].parentNode.childNodes;
                for(var i=0;i<node.length;i++){
//                    alert(node[i].nodeName);
                    if(node[i].nodeName=="#text"){
//                            alert('div');
                        node[i].nodeValue="前后密码不一致"
                        break;
                    }
                }
                return;
            }
            var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
            if(inputs[8].value==""){
                alert("电子邮件不能为空");
                return;
            }else if(!reg.test(inputs[8].value)){
                alert("电子邮件格式错误");
                return;
            }

            /*var reg1=new RegExp("^\d{8}$");
            if(!reg1.test(inputs[9].value)){
                alert(inputs[9].value.length+"电话号码必须为8位数字，格式错误");
                return;
            }*/
            if(inputs[9].value.length!=8){
                alert(inputs[9].value.length+"电话号码必须为8位数字，格式错误");
                return;
            }

            for(var i=0;i<inputs[9].value.length;i++){
                if((inputs[9].value)[i]<'0'||(inputs[9].value)[i]>'9'){
                    alert(inputs[9].value.length+"电话号码必须为8位数字，格式错误");
                    return;
                }
            }

            document.getElementById("form").submit();
        }
    </script>
</head>
<body>
<h1 style="color: deeppink"><center>新用户注册</center></h1><br>
<form id="form" method="post" action="/实验5/UserInfo.jsp">
    <table width="60%" align="left">
        <tr>
            <th>用户名：</th>
            <th style="float:left;color: red;"><input name="name" value=""/>*必填</th>
        </tr>
        <tr>
            <th>用户密码：</th>
            <th style="float:left;color: red;"><input type="password" name="password" value=""/>*必填</th>
        </tr>
        <tr>
            <th>确认密码:</th>
            <th style="float:left;color: red;"><input type="password" name="retype" value=""/>*必填</th>
        </tr>
        <tr>
            <th>真实姓名:</th>
            <th style="float:left;color: red;"><input name="realName" value=""/>*必填</th>
        </tr>
        <tr>
            <th>性别:</th>
            <th>
                <input type="radio" checked="checked" name="sex" value="男"/>男
                <input type="radio" name="sex" value="女"/>女
            </th>
        </tr>
        <tr>
            <th>出生日期:</th>
            <th>
                <input name="year" value="" style="width: 50px"/>年
            <select name="month">
            <option selected="selected" value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            </select>月
            <input name="day" value="" style="width: 30px"/>日
            </th>
        </tr>
        <tr>
            <th>电子邮件:</th>
            <th><input name="email" value="" style="width: 60%"/></th>
        </tr>
        <tr>
            <th>联系电话:</th>
            <th><input name="phone" value="" style="width: 60%"/></th>
        </tr>
        <tr>
            <th>联系地址:</th>
            <th><textarea name="address" rows="3" cols="30" value=""></textarea></th>
        </tr>
        <tr>
            <th><input type="button" onclick="check()" value="提交" style="align:center;"/></th>
            <th><input type="reset" value="重置" style="align:center;" /></th>
        </tr>
    </table>
</form>
</body>
</html>
