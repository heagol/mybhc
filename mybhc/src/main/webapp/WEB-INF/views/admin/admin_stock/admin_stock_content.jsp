<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BHC</title>
<link rel="stylesheet"  href="http://localhost:9000/mybhc/resources/css/mybhc.css">
</head>
<body>
	<!-- Header Include -->
	<iframe src="http://localhost:9000/mybhc/header.do" width="100%" height="160px" scrolling="no" frameborder=0 ></iframe>
	
	
	<!---------------------------------------------->
	<!--------------- Content ----------------------->
	<!---------------------------------------------->
	<div class="content">
		<h1>상세보기</h1>
		<table class="stockContent">	
			<tr>				
				<th>등록일자</th>
				<td>${vo.mdate }</td>
			</tr>		
			<tr>				
				<th>이름</th>
				<td colspan="3">${vo.mname }</td>
			</tr>
			<tr>				
				<th>내용</th>
				<td colspan="3">${vo.mcontent }<br><br>
				<c:if test="${vo.msfile != null }">
					<img src="http://localhost:9000/mycgv/resources/upload/${vo.msfile}"
						width="100"  height="70">
				</c:if>
				<br><br></td>
			</tr>
			<tr>
				<td colspan="4">
					<a href="admin_stock_update.do?mid=${vo.mid }"><button type="button" class="btn_style">수정하기</button></a>
					<a href="admin_stock_delete.do?mid=${vo.mid }"><button type="button" class="btn_style">삭제하기</button></a>
					<a href="admin_stock_list.do">
						<button type="button" class="btn_style">리스트</button></a>
					<a href="http://localhost:9000/mybhc/admin.do"><button type="button" class="btn_style">관리자홈</button></a>
				</td>
			</tr>			
		</table>	
	</div>
	
	<!-- footer Include -->
	<iframe src="http://localhost:9000/mybhc/footer.do" width="100%" height="530px" scrolling="no" frameborder=0></iframe>
	
</body>
</html>






