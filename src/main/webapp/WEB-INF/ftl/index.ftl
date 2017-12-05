<!DOCTYPE html>
<html>
<head>
<title>特产商城首页</title>
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
<!-- lCartcart -->
<div class="header_top">
	<div class="container">
		<div class="logo">
		 	<a href="index.ftl">买就完事商城</a>
		</div>
		<div class="header_right">
			<div class="cart box_1">
				<a href="checkout.html">
				<h3> <div class="total">
					<span class="simpleCart_total"></span	> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> 项)</div>
					<img src="../../images/cart1.png" alt=""/></h3>
				</a>
				<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
				<div class="clearfix"> </div>
			</div>				 
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
						<#list categories as category>
						<div class="col1">
							<div class="h_nav">
								<a herf="${ctx}/producets/${category.urlName}"><h4>${category.name}</h4></a>
								<ul>
									<#if category.children??>
									    <#list category.children as child>
									        <li><a href="${ctx}/producets/${child.urlName}">${child.name}</a></li>
									    </#list>
									</#if>
								</ul>	
							</div>
						</div>
						</#list>
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
<!-- banner -->
	<div class="banner">
		<div class="container">
<!-- Slider-starts-Here -->
				<script src="../../js/responsiveslides.min.js"></script>
				 <script>
				    // You can also use "$(window).load(function() {"
				    $(function () {
				      // Slideshow 4
				      $("#slider3").responsiveSlides({
				        auto: true,
				        pager: false,
				        nav: true,
				        speed: 500,
				        namespace: "callbacks",
				        before: function () {
				          $('.events').append("<li>before event fired.</li>");
				        },
				        after: function () {
				          $('.events').append("<li>after event fired.</li>");
				        }
				      });
				
				    });
				  </script>
			<!--//End-slider-script -->
			<div  id="top" class="callbacks_container">
				<ul class="rslides" id="slider3">
					<li>
						<div class="banner-info">
							<div class="banner-info1">
								<div class="banner-inf">
									<h1>商品1</h1>
									<p>商品推荐标题语</p>
									<div class="buy">
										<a href="single.html">Explore</a>
									</div>
								</div>
							</div>
						</div>
					</li>
					<li>
						<div class="banner-info">
							<div class="banner-info1">
								<div class="banner-inf">
									<h1>商品1</h1>
									<p>商品推荐标题语</p>
									<div class="buy">
										<a href="single.html">Explore</a>
									</div>
								</div>
							</div>
						</div>
					</li>
					<li>
						<div class="banner-info">
							<div class="banner-info1">
								<div class="banner-inf">
									<h1>商品1</h1>
									<p>商品推荐标题语</p>
									<div class="buy">
										<a href="single.html">Explore</a>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
<!-- //banner -->
<!-- cate -->
	<div class="cate">
		<div class="container">
			<div class="cate-left">
				<h3>推荐商品<span>更多</span></h3>
			</div>
			<div class="cate-right">
				<!-- slider -->
				<ul id="flexiselDemo1">			
					<li>
						<div class="sliderfig-grid">
							<img src="../../images/test2.png" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="sliderfig-grid">
							<img src="../../images/test2.png" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="sliderfig-grid">
							<img src="../../images/test2.png" alt=" " class="img-responsive" />
						</div>
					</li>
					<li>
						<div class="sliderfig-grid">
							<img src="../../images/test2.png" alt=" " class="img-responsive" />
						</div>
					</li>
					</ul>
					<script type="text/javascript">
							$(window).load(function() {
								$("#flexiselDemo1").flexisel({
									visibleItems: 4,
									animationSpeed: 1000,
									autoPlay: true,
									autoPlaySpeed: 3000,    		
									pauseOnHover: true,
									enableResponsiveBreakpoints: true,
									responsiveBreakpoints: { 
										portrait: { 
											changePoint:480,
											visibleItems: 3
										}, 
										landscape: { 
											changePoint:640,
											visibleItems:4
										},
										tablet: { 
											changePoint:768,
											visibleItems: 3
										}
									}
								});
								
							});
					</script>
					<script type="text/javascript" src="../../js/jquery.flexisel.js"></script>
			</div>
<!-- //slider -->
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //cate -->
<!-- cate-bottom -->
<!-- //cate-bottom -->
<!-- welcome -->
	<div class="welcome">
		<div class="container">
			<div class="welcome-info">
				<h3>欢迎来到我们的商店!</h3>
				<p class="non"></p>
				<p class="rep"></p>
				<div class="buy wel">
					<a href="single.html">更多</a>
				</div>
			</div>
		</div>
	</div>
<!-- //welcome -->
<!-- banner-bottom1 -->
	<div class="banner-bottom1">
		<div class="container">
			<div class="banner-bottom1-grids">
				<div class="col-md-4 banner-bottom1-grid">
					<div class="banner-bottom1-grid1">
						<img src="../../images/test2.png" alt=" " class="img-responsive" />
						<div class="head-para">
							<h3>商品2</h3>
							<p>商品推荐标题语</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 banner-bottom1-grid">
					<div class="banner-bottom1-grid1">
						<img src="../../images/test2.png" alt=" " class="img-responsive" />
						<div class="head-para">
							<h3>商品2</h3>
							<p>商品推荐标题语</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 banner-bottom1-grid">
					<div class="banner-bottom1-grid1">
						<img src="../../images/test2.png" alt=" " class="img-responsive" />
						<div class="head-para">
							<h3>商品2</h3>
							<p>商品推荐标题语</p>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //banner-bottom1 -->
<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container">
			<div class="product-one">
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">							
							<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
							</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">							
							<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
							</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="product-one">
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">							
							<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
							</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">							
							<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
							</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="col-md-2 product-left"> 
					<div class="p-one simpleCart_shelfItem jwe">
						<a href="single.html">
								<img src="../../images/test2.png" alt="" class="img-responsive" />
								<div class="mask">
									<span>Quick View</span>
								</div>
						</a>
						<div class="product-left-cart">
							<div class="product-left-cart-l">
								<p><a class="item_add" href="#"><i></i> <span class=" item_price">价格</span></a></p>
							</div>
							<div class="product-left-cart-r">
								<a href="#"> </a>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //banner-bottom -->
<!-- footer -->
	<div class="footer">
	</div>



<!-- //footer -->
</body>
</html>