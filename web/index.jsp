<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>简单的局部刷新</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
      $(function(){
        /*
          //未使用ajax做出来的局部刷新（未经过后台的处理）
          $("#clickbtn").click(function(){
          $("#local").html("我是新添加的东西");
        })*/
        //使用ajax做出来的局部刷新（经过了后台的处理）
        $("#clickbtn").click(function(){
          $.ajax({
            url:"localServlet.do",
            //data:{}
            type:"get",
            dataType:"text",
            success:function(result){
              $("#local").html(result);
            }
          })
        })
      })
    </script>
  </head>
  <body>
  <input type="button" value="点击" id="clickbtn"/>
  <br>
  <br>
  <div id="local" style="width: 200px;height: 200px;background: lightcoral"></div>
  <br>
  <div id="global" style="width: 200px;height: 200px;background: lightcoral">我是本来就有的文件</div>
  </body>
</html>
