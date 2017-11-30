<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Pendent Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="../../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="../../css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="../../js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="../../js/move-top.js"></script>
<script type="text/javascript" src="../../js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- start menu -->
<link href="../../css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="../../js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<script src="../../js/menu_jquery.js"></script>
<script src="../../js/simpleCart.min.js"> </script>
<link href='http://fonts.useso.com/css?family=Monda:400,700' rel='stylesheet' type='text/css'>
</head>

<body>
<!-- header -->
	
<!-- //header -->
<!-- top-header -->
<div class="top_bg">
	<div class="container">
		<div class="header_top-sec">
			<div class="top_right">
				<ul>
					<li><a href="contact.html">Contact</a></li>|
					<li><a href="login.ftl">Track Order</a></li>
				</ul>
			</div>
			<div class="top_left">
				<ul>
					<li class="top_link">Email:<a href="mailto:info@example.com">info@example.com</a></li>|
					<li class="top_link"><a href="login.ftl">My Account</a></li>
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
</div>
<!-- top-header -->
<!-- logo-cart -->
<div class="header_top">
	<div class="container">
		<div class="logo">
		 	<a href="index.ftl">Specialty Store</a>
		</div>
		<div class="header_right">

		</div>
		<div class="clearfix"></div>	
	</div>
</div>
<!-- //logo-cart -->
<!------>
<!---->
<!-- reg-form -->
	<div class="reg-form">
		<div class="container">
			<div class="reg">
				<h3>新用户注册</h3>
				 <form action="/register/insertUser" method="GET" onsubmit="return judge()">
					<ul>
						<li class="text-info">用户名字: </li>
						<li><input type="text" value="" name="name"></li>
					</ul>
					<ul>
						<li class="text-info">Email: </li>
						<li><input type="text" value="" name="email"></li>
					</ul>
					<ul>
						<li class="text-info">密码: </li>
						<li><input type="password" value="" name="password"></li>
					</ul>
					<ul>
						<li class="text-info">确认密码</li>
						<li><input type="password" value=""></li>
                        <div class="msg"></div>
					</ul>
					<ul>
						<li class="text-info">手机号</li>
						<li><input type="text" value="" name="phone"></li>
					</ul>
					<input type="submit" value="注册">
					 <input type="reset" value="重置">
					<p class="click">点击同意以下条款  <a href="#">用户条件协议.</a></p>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
    	function judge(){
      	  var password1,password2;
       	 password1=$('input:password:first').val();
       	 password2=$('input:password:last').val();
       	 if (password1!== password2) {
            $('.msg').append("<div class='msg bg-danger .text-info'>两次密码输入不一样,请重新输入</div>");
            return false;
        }
        else{
            return true;
        }
    }

	</script>
<!-- footer -->
	<div class="footer">
			<div class="clearfix"></div>
		</div>
	</div>

<!-- //footer -->
</body>
</html>