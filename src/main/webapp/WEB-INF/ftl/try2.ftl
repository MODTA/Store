<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
    <title>qqqqq</title>
    <script src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script>

</head>
<body>
试一

<#--<img src="pic/imagessr/basic/1.jpg"/>-->


<#list dealList as deal>
${deal.image_id}
<img src="/${helper.getDealImageUrlForDealList(deal)}"/>
</#list>
</body>
</html>