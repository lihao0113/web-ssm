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
    <script src="../js/jquery-1.11.0.js"></script>
</head>
<body>
<script>
    var personData;
    $.ajax({
        url:"http://localhost:8080/web-ssm/person",    //请求的url地址
        dataType:"json",   //返回格式为json
        async:true,//请求是否异步，默认为异步，这也是ajax重要特性
//        data:{"id":"value"},    //参数值
        type:"GET",   //请求方式
        success:function(req){
            //请求成功时处理
            personData = req;
        },
        error:function(){
            //请求出错处理
        }
    });
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
               </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
