<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
    <title>qqqqq</title>
    <script src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script>
</head>
<body>
试一下
<div class="msg2"></div>

<script type="text/javascript">
    var str1="success";
    var try1="${try1?js_string}";
    function addError(){
        $(".msg2").append("<div class='bg-danger .text-info'>密码或者用户名错误</div>");
    }
    if(try1==str1){
        addError();
    }
</script>

</body>
</html>