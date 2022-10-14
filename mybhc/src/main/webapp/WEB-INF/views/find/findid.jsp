<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="http://localhost:9000/mybhc/resources/css/mybhc.css">
<script src="http://localhost:9000/mybhc/resources/js/jquery-3.6.0.min.js"></script>
<script src="http://localhost:9000/mybhc/resources/js/mybhc_jquery.js"></script>
</head>
<body>
	<!-- Header Include -->
	<iframe src="http://localhost:9000/mybhc/header.do" width="100%" height="160px" scrolling="no" frameborder=0 ></iframe>
	
	
	<!---------------------------------------------->
	<!--------------- Content ----------------------->
	<!---------------------------------------------->
	<div class="findid">
		<h1>아이디 찾기</h1>
		<form name="fineidForm"  action="findid.do"  method="post">
		
			<ul>
				<li>
					<label>성명</label>
					<input type="text" name="name" id="name">
				</li>
				<li>
					<label>이메일</label>
					<input type="text" name="email1" id="email1"><span>@</span>
					<input type="text" name="email2" id="email2">
					<select id="email3" >
						<option value="default">선택</option>
						<option value="naver.com">네이버</option>
						<option value="gmail.com">구글</option>
						<option value="daum.net">다음</option>
						<option value="self">직접입력</option>
					</select>
				</li>
				<li>				
					<button type="button" class="btn_style" id="findId">아이디 찾기</button>
					<button type="reset" class="btn_style">다시입력</button>				
					<button type="button" class="btn_style">이전페이지</button>				
				</li>
			</ul>	
		</form>	 
	</div>
	
	<!-- footer Include -->
	<iframe src="http://localhost:9000/mybhc/footer.do" width="100%" height="530px" scrolling="no" frameborder=0></iframe>
	
</body>
</html>