<%--
  Created by IntelliJ IDEA.
  User: kanyingxin
  Date: 2020/11/29
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script src="jquery-3.4.1.min.js"></script>
    <script>
      $(function () {
        $("#oneB").click(function () {
          $.ajax({
            url:"two",
            type:"get",
            dataType:"json",
            success:function (data) {
              $("#id1").html(data.s1.id)
              $("#name1").html(data.s1.name)
              $("#age1").html(data.s1.age)

              $("#id2").html(data.s2.id)
              $("#name2").html(data.s2.name)
              $("#age2").html(data.s2.age)
            }
          })
        })

      })
    </script>
    <title>$Title$</title>

  </head>
  <body>
    <button id="oneB">点击</button>
    <br/>
    学员1: <br/>
    编号：<span id="id1"></span><br/>
    姓名：<span id="name1"></span><br/>
    年龄：<span id="age1"></span>
    <br/>
    <br/>
    学员2: <br/>
    编号：<span id="id2"></span><br/>
    姓名：<span id="name2"></span><br/>
    年龄：<span id="age2"></span>


  </body>
</html>
