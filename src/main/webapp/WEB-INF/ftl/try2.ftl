<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>try2</title>
</head>
<body>
<#list categories as category >
    <div>
       <ul>
           <h1>${category.name}</h1>
           <#if category.children??>
               <#list category.children as child>
                   <li>${child.name}</li>
               </#list>
           </#if>
       </ul>
    </div>
</#list>

</body>
</html>