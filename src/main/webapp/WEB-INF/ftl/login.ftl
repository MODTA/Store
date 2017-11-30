<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<!-- for-mobile-apps -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Pendent Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
	<script src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script>
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- //for-mobile-apps -->
	<link href="../../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link href="../../css/style.css" rel="stylesheet" type="text/css" media="all" />
	<!-- js -->
	<script src="../../js/jquery-1.11.1.min.js"></script>
	<!-- //js -->
	<!-- start-smoth-scrolling -->
	<script type="text/javascript">
        jQuery(document).ready(function() {
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
<!-- lCartcart -->
<div class="header_top">
	<div class="container">
		<div class="logo">
			<a href="index.ftl">买就完事商城</a>
		</div>
		<div class="header_right">
		</div>
		<div class="clearfix"></div>
	</div>
</div>
<!-- //lCartcart -->
<!------>
<div class="mega_nav">
	<div class="container">
		<div class="menu_sec">
			<!-- start header menu -->
			<ul class="megamenu skyblue">
				<li class="active grid"><a class="color1" href="index.ftl">商店首页</a></li>
				<li class="grid"><a class="color1" href="#">商品分类</a>
					<div class="megapanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<h4>地区</h4>
									<ul>
										<li><a href="products.html">广东地区</a></li>
										<li><a href="products.html">华南</a></li>
										<li><a href="products.html">Necklaces</a></li>
										<li><a href="products.html">Chokers</a></li>
										<li><a href="products.html">Cuff Links</a></li>
										<li><a href="products.html">Bangles</a></li>
									</ul>
								</div>
							</div>

						</div><div class="col1">
						<div class="h_nav">
							<h4>Style Zone</h4>
							<ul>
								<li><a href="products.html">Men</a></li>
								<li><a href="products.html">Women</a></li>
								<li><a href="products.html">Brands</a></li>
								<li><a href="products.html">Kids</a></li>
								<li><a href="products.html">Accessories</a></li>
								<li><a href="products.html">Style Videos</a></li>
							</ul>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>All Jewellery</h4>
								<ul>
									<li><a href="products.html">eum fugiat</a></li>
									<li><a href="products.html">commodi consequatur</a></li>
									<li><a href="products.html">illum qui dolorem</a></li>
									<li><a href="products.html">nihil molestiae</a></li>
									<li><a href="products.html">eum fugiat</a></li>
									<li><a href="products.html">consequatur eum</a></li>
								</ul>
							</div>
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Seating</h4>
								<ul>
									<li><a href="products.html">eum fugiat</a></li>
									<li><a href="products.html">commodi consequatur</a></li>
									<li><a href="products.html">illum qui dolorem</a></li>
									<li><a href="products.html">nihil molestiae</a></li>
									<li><a href="products.html">eum fugiat</a></li>
									<li><a href="products.html">consequatur eum</a></li>
								</ul>
							</div>
						</div>
					</div>
						<div class="row">
							<div class="col2"></div>
							<div class="col1"></div>
							<div class="col1"></div>
							<div class="col1"></div>
							<div class="col1"></div>
						</div>
					</div>
				</li>
			</ul>
			<div class="search">
				<form>
					<input type="text" value="" placeholder="Search...">
					<input type="submit" value="">
				</form>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<!---->
<!-- login-page -->
<div class="login">
	<div class="container">
		<div class="login-grids">
			<div class="col-lg-6 log">
				<h3>用户登录</h3>
				<div class="strip"></div>

				<form class="form-inline" action="/dologin">

				<h5>用户名:</h5>
				<input type="text" value="" placeholder="username" class="form-control" name="name">
				<h5>密码:</h5>
				<input id="fix" type="password" value="" placeholder="password" class="form-control" name="password">
                <div class="msg1"></div>
				<input type="submit" value="登录">
				<input type="reset" value="重置">

				</form>
				<a href="#">忘记密码?</a>
			</div>
			<div class="col-md-6 login-right">
				<h3>新用户注册</h3>
				<div class="strip"></div>
				<p></p>
				<a href="/register" class="button">创建新用户</a>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<script type="text/javascript">
    var str1="false";
    var try1="${alterController?js_string}";
    function addError(){
        $(".msg1").append("<div class=	'label label-danger bg-danger'>密码或者用户名错误</div>");
        $("#fix").css("margin-bottom","0px");
        $(".msg1").css("margin-bottom","3%")
    }
    if(try1==str1){
        addError();
    }
</script>
<!-- //login-page -->
<!-- footer -->
<div class="footer">
</div>
<!-- //footer -->
</body>
</html>