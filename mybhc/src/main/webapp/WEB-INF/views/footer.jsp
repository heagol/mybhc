<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="http://localhost:9000/mybhc/resources/css/mybhc.css">
</head>
<body>
	<div class="footer_wrap">
	<div class="footer">
		<ul>
			<li>
				<a href="javascript:void(0);" onclick="fn_terms()">이용약관</a>
				<a href="javascript:void(0);" onclick="fn_policy()">개인정보취급방침</a>
				<!--a href="javascript:void(0);" onclick="fn_rules()">정보통신망법</a-->
				<a  href="javascript:void(0);" onclick="fn_denial()">이메일무단수집거부</a>
				<a href="/site_map.asp">사이트맵</a>
				<!--a href="javascript:void(0);" onclick="window.open('/images/new/BHC_1311.pdf','winbrochure', 'width=1200, height=800, left=100, top=50, scrollbars=no,titlebar=no,status=no,resizable=no,fullscreen=no')" class="bgn">브로슈어다운로드</a-->
				<!-- s:패밀리사이트 -->
				<div class="familysite">
					<label for="family">패밀리사이트</label>
					<select onChange='if(this.selectedIndex) { this.blur(); window.open(options[selectedIndex].value); }' id="family" name="">
						<option value="" selected>패밀리사이트</option>
							<option value="http://www.bhcgroup.co.kr/">BHC그룹 </option>
							<option value="https://bhcmall.co.kr/main/">BHC MALL </option>
							<option value="https://www.outback.co.kr/">OUTBACK </option>
							<option value="http://www.changgo43.co.kr/">창고43 </option>
							<option value="http://www.bkfood.kr/">큰맘할매순대국 </option>
							<option value="http://jokbalstore.com/">족발상회 </option>
							<option value="http://www.gram-gram.com/">그램그램 </option>
					</select>
				</div>
				<!-- e:패밀리사이트 -->
			</li>
			<li>
				<span>대표이사 : 임금옥</span>
				<span class="bgn">주소 : 서울시 송파구 올림픽로 300, 19층 (신천동) </span> 
			</li>
			<li>
				<span>(주)비에이치씨 </span>
				<span >사업자등록번호 : 215-86-61559</span>
				<span class="bgn">통신판매업 : 제2014-서울송파-0593호</span>
			</li>
			<li>
				<span>문의전화 : 02-6204-3406</span>
				<span class="bgn">FAX : 02-6204-3484</span>					
			</li>
			<li class="copy">COPYRIGHT &copy; 2021 BHC ALL RIGHT RESERVED</li>
		</ul>
		<p class="ordercall"><img src="http://localhost:9000/mybhc/resources/images/img_ordernum.gif" alt="배달주문 전화주세요! 1577-5577" /></p>
	</div>
</div>
	
</body>
</html>