<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 홈페이지</title>
<link rel="stylesheet"  href="http://localhost:9000/mybhc/resources/css/mybhc.css">
<script src="http://localhost:9000/mybhc/resources/js/jquery-3.6.0.min.js"></script>
<script src="http://localhost:9000/mybhc/resources/js/mybhc_jquery.js"></script>
</head>
<body>
	<!-- Header Include -->
	<iframe src="header.do" width="100%" height="160px" scrolling="no" frameborder=0 ></iframe>
	
	<!---------------------------------------------->
	<!--------------- Content ----------------------->
	<!---------------------------------------------->
	<div class="content">
		<h1>메뉴추가</h1>	
		<form name="AdminAddMenuForm" action="admin_add_check.do" method="post"
		enctype="multipart/form-data">
			<ul>
				<li>
					<label>메뉴</label>
					<input type="text" name="mname" id="mname">
				</li>
				<li>
					<label>가격</label>
					<input type="text" name="mpay" id="mpay">
				</li>
				<li>
					<label>내용</label>
					<textarea name="mcontent" id="mcontent"></textarea>
				</li>
				<li>
					<label>파일첨부</label>
					<input type="file" name="file1">
				</li>
				<li>
					<button type="button" class="btn_style" id="btnAddMenu">등록완료</button>
					<button type="reset" class="btn_style">다시쓰기</button>
					<a href="admin_stock_list.do">
						<button type="button" class="btn_style">리스트</button>
					</a>
				</li>
			</ul>
		</form>
	</div>
	
	<!-- footer Include -->
	<iframe src="footer.do" width="100%" height="530px" scrolling="no" frameborder=0></iframe>
</body>
</html>