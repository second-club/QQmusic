<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.Song
  Date: 2019/12/17
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
    <style>

    </style>

    <title>注册</title>
</head>
<body>


<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script>

    //注意：选项卡 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function(){
        var element = layui.element;
        //Demo
        layui.use('form', function () {
            var form = layui.form;

            //监听提交
            form.on('submit(formDemo)', function (data) {
                layer.msg(JSON.stringify(data.field));
                return false;
            });
        });
        //…
    });
</script>

<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">账号登录</li>
        <li>用户管理</li>
        <li>权限分配</li>
        <li>商品管理</li>
        <li>订单管理</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
            <div class="form">
                <form class="layui-form" action="">
                    <div class="layui-form-item">
                        <label class="layui-form-label">账户</label>
                        <div class="layui-input-block">
                            <input type="text" name="title" required lay-verify="required" placeholder="请输入账户" autocomplete="off" value="${username}"
                                   class="layui-input">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">密码</label>
                        <div class="layui-input-inline">
                            <input type="password" name="password" required lay-verify="required" placeholder="请输入密码"
                                   autocomplete="off" class="layui-input">
                        </div>
                        <div class="layui-form-mid layui-word-aux">请输入6~18位字符</div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button class="layui-btn" lay-submit lay-filter="formDemo">登录</button>
                            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                        </div>
                    </div>
                </form>
                <div class="register_account"><a href="${pageContext.request.contextPath}/user//test">前往注册</a></div>
            </div>
        </div>
        <div class="layui-tab-item">内容2</div>
        <div class="layui-tab-item">内容3</div>
        <div class="layui-tab-item">内容4</div>
        <div class="layui-tab-item">内容5</div>
    </div>
</div>


</body>
</html>
