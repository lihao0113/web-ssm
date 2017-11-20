<%--
  Created by IntelliJ IDEA.
  User: lihao
  Date: 2017/10/16
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人员信息列表</title>
</head>
<body>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.11.0.js"></script>
<script>
    function del(id) {
        $.ajax({
            type: "DELETE",
            url: "<%=basePath%>person/1",
//            data: {id: studentid},
            dataType: "json",
            success: function (data) {
                var flag = data;
                console.log(flag);
            },
            erroe: function (err) {
                alert("请求错误！")
            }
        });
    }

</script>
<div id="table1">
    <table>
        <tr>
            <th>编号</th>
            <th>用户名</th>
            <th>年龄</th>
            <th>住址</th>
            <th>操作</th>
        </tr>
        <c:forEach var="person" items="${list}">
            <tr>
                <td>${person.id}</td>
                <td>${person.username}</td>
                <td>${person.age}</td>
                <td>${person.address}</td>
                <td>
                    <button onclick="update(${person.id})">修改</button>
                    <button onclick="del(${person.id})">删除</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
