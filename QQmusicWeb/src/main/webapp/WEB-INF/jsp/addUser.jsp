<%--
  Created by IntelliJ IDEA.
  User: Mr.Song
  Date: 2019/12/17
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<form action="${pageContext.request.contextPath }/adduserservlet" method="post" onsubmit="return choose(this)">
    <input type="text" name="uname" placeholder="昵称：4~10个字符" class="text" required/>
    <input type="password" name="pwd" placeholder="密码：6~16个字符" pattern="[\dA-Za-z]{6,16}" class="text" required/>
    <input type="text"  name="number" placeholder="电话号码：以13，15，17，18开头" pattern="1[3578]\d{9}" class="text" required/>
    <input type="checkbox" class="radio" required/> 我已阅读并同意相关服务条款和隐私政策
    <input type="submit" value="免费注册" class="text" />
</form>
</body>
</html>
