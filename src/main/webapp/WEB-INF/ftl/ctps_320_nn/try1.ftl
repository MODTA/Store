<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>usersInfo</title>
</head>
<body>
<#list userCustoms as userCustom>
    <div>
        username : ${userCustom.name},
        password : ${userCustom.password}
    </div>
</#list>
</body>
</html>