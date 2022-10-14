<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 홈페이지</title>
<link rel="stylesheet"  href="http://localhost:9000/mybhc/resources/css/mybhc.css">
</head>
<body>
	<!-- Header Include -->
	<iframe src="header.do" width="100%" height="160px" scrolling="no" frameborder=0 ></iframe>
	
	<!---------------------------------------------->
	<!--------------- Content ----------------------->
	<!---------------------------------------------->
	<div class="content">
		<h1>관리자 페이지</h1>	
		<section class="adminMain">
			<article><a href="admin_notice_list.do">공지사항</a></article>
			<article><a href="admin_add_list.do">메뉴추가</a></article>
			<article><a href="admin_stock_list.do">재고관리</a></article>
		</section>
	</div>
	
	<!-- footer Include -->
	<iframe src="footer.do" width="100%" height="530px" scrolling="no" frameborder=0></iframe>
</body>
</html>