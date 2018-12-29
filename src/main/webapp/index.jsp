<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>登录页面</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"/>
</head>
<body>
    <div onclick="fnClick()" style="border: 1px saddlebrown solid;width: 100px;height: 100px">
        dsds
    </div>
</body>
</html>
<script>
    $(document).ready(function(){
       console.log(1)
    })
    function fnClick() {
        alert("222")
    }
</script>
