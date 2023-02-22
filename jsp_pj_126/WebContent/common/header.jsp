<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="setting.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name ="viewport" content="width=device-width, initial-scale=1">
<title>header</title>
</head>
<body>
<!-- header 시작 -->
<header id = "header" class ="container-fluid">	<!-- 헤더 아이디 : header -->
	<div class = "col-md-12">
		<div class = "row">
			<div id = "mainLogo" class = "col-md-2"> <!-- 메인 로고  -->
				<a href = "http://localhost/jsp_pj_126/common/main.jsp"><img src = "http://localhost/jsp_pj_126/resources/images/main/photoZeniaPng.png" style ="width:200px;"></a>
			</div>
				<nav id ="mainNav" class ="col-md-6">	<!-- 메인 메뉴 --> 
					<ul class ="nav_li">				
						<li><a class="text-decoration-none" style = "font-style: italic;" href="${path}/main.do">Home</a></li>
						<li><a class="text-decoration-none" style = "font-style: italic;" href ="${path}/shopAll.do">Product</a></li>
						<li><a class="text-decoration-none" style = "font-style: italic;" href ="${path}/boardList.do">Community</a></li>
					</ul>
				</nav>
			<div id = "mainSide" class = "col-md-4 "> <!-- 메인 사이드 바-->
				<nav class="navbar">
					<div>
						<ul class="nav nav-tabs" style ="font-size:10px;color:bisque;" >
							<li id = "my">
								<a class="nav-link link-secondary" href ="${path}/login.do">Login</a>
							</li>
							<li id = "my">
								<a class="nav-link link-secondary" href = "${path}/join.do">Join</a>
							</li>
							<li id = "my">
								<a class="nav-link link-secondary" href = "${path}/cart.do">
									<i class="bi bi-cart4"></i>
								</a>
							</li>
							<li id = "my">
								<a class="nav-link link-secondary" href = "${path}/mypage.do">
									<i class="bi bi-person-circle"></i>
								</a>
							</li>		
							<!-- 리스트 바 -->
							<li><button id ="my" type ="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarContent" 
									aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation"><i class ="bi bi-list"></i>
								</button>
								<div class="collapse navbar-collapse" id="navbarContent">
									<div class="navbar-nav">
										<a class="nav-link" href="#">category1</a>
										<a class="nav-link" href="#">category2</a>
										<a class="nav-link" href="#">category3</a>
										<hr>
										<a class="nav-link" href="#">category3</a>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</nav>				
			</div>
		</div>
	</div>
</header>

<!-- header 끝 -->


</body>
</html>