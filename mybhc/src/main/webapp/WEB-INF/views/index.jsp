<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BHC</title>
<link rel="stylesheet"  href="http://localhost:9000/mybhc/resources/css/mybhc.css">
</head>
<script>
	 $(document).ready(function (){
		 $(".bg1").show();
		$(".info01").mouseover(function (){	
			$(".bg1").show();
			$(".bg2").hide();
			$(".bg3").hide(); 
		});
		$(".info02").mouseover(function (){ 	
			$(".bg1").css("display","none");
			$(".bg2").show();
			$(".bg3").css("display","none");   		  
		});
		$(".info03").mouseover(function (){
		 	$(".bg3").show();
		 	$(".bg1").css("display","none");
		 	$(".bg2").css("display","none"); 
		});
	 });
 
 
 </script>
<script src="http://localhost:9000/mybhc/resources/js/jquery-3.6.0.min.js"></script>
<script src="http://localhost:9000/mybhc/resources/js/mybhc_index.js"></script>
<body>
	<!-- Header Include -->
	<iframe src="header.do" width="100%" height="160px" scrolling="no" frameborder=0 ></iframe>
	<!-- Content --------->
	<div class="content">
		<section>
			<div class="main1">
				<div class="img1">
					<img src="http://localhost:9000/mybhc/resources/images/2022-08-31 175343.png">
					<img src="http://localhost:9000/mybhc/resources/images/2022-08-31 175427.png">
					<img src="http://localhost:9000/mybhc/resources/images/new_quick2.gif">
					<img src="http://localhost:9000/mybhc/resources/images/new_quick3.gif">
					<img src="http://localhost:9000/mybhc/resources/images/new_quick_franchise.png">
				</div>
				<div class="img2">
					<img src="http://localhost:9000/mybhc/resources/images/img_main_banner_220418.jpg">
				</div>
				<div class="img3">
					<img src="http://localhost:9000/mybhc/resources/images/2022-08-31 180100.png">
				</div>
			</div>
		</section>
		<div class="main2">
			<section>
				<iframe width="785" height="485" src="https://www.youtube.com/embed/g6Yu-X71308" 
					title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; 
					encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</section>
			<section>
				<div class="section02 clear" id="infotab">
					<div>
					<div class="bhc_infomation">				
						<ul class="infotab clear" >
							<li class="on"><a href="#none" class="info01">BHC 소개</a></li>
							<li><a href="#none" class="info02">고객 만족</a></li>
							<li><a href="#none" class="info03">창업 정보</a></li>
						</ul>
						<div class="info_view">
							  <div class="bg1">
								<p class="tit">Better & Happier Choice</p>
								<p class="sub">지속적인 혁신과 도전으로 치킨시장 선도 프랜드 BHC</p>
								<ul>
									<li>치킨시장의 새로운 트렌드 리더, NO.1 치킨 프랜차이즈</li>
									<li>다양한 맛과 재미를 경험 할 수 있는 치킨 문화공간</li>
									<li>최고의 맛과 품질로 고객에게 행복을 전하는 기업</li>
									<li>‘더 깨끗하게, 더 친절하게, 더 맛있게‘ 고객 중심 경영 </li>
								</ul>
							</div>  
							 <div class="bg2">
								<p class="tit">고객중심 경영, 품질 경영에 앞장 선 BHC</p>
								<p class="sub">BHC 만의 QCS(품질,청결,서비스) 관리 시스템 구축</p>
								<ul>
									<li>고객 만족을 위한 BHC만의 QCS 매뉴얼 구축 및 가맹점 교육</li>
									<li>본사의 슈퍼 바이저 (S/V)정기적으로 가맹점 방문 QCS점검 · 교육</li>
									<li>업계 최초 위생등급 획득 1,000개 매장으로 품질 신뢰도 구축</li>
									<li>본사에서 직접 CS센터 운영으로 고객 서비스 강화</li>
								</ul>
							</div> 
							<div class="bg3">
								<p class="tit">치킨 프랜차이즈 수익률 1위 BHC</p>
								<p class="sub">수익성 1위, 창업비용 4배 평균 매출</p>
								<ul>
									<li>BHC만의 체계적인 시스템으로 안정적인 수익구조</li> 
									<li>최신 트렌드 반영한 신 메뉴 출시로 지속적인 수익 창출</li>
									<li>공격적인 마케팅 전개로 브랜드인지 및 고객 만족도 향상</li>  
									<li>가정간편식(HMR), 펫푸드등 다양한 상품 출시로 추가 수익</li>
								</ul>
							</div>
						</div>
					</div>
		           
					<div class="main_sns_warp">
						<p class="tit">SNS</p>
						<ul>
							<li><a href="https://pf.kakao.com/_ExlBVl" target="_blank"><img src="http://localhost:9000/mybhc/resources/images/btn_kakaoplus_main.png" alt="카카오플러스친구 바로가기"></a></li>
							<li><a href="http://www.facebook.com/bhcchicken" target="_blank"><img src="http://localhost:9000/mybhc/resources/images/btn_facebook_main.png" alt="페이스북 바로가기"></a></li>
							<li><a href="https://instagram.com/bhc_chicken_official?igshid=16tcbhequ830e" target="_blank"><img src="http://localhost:9000/mybhc/resources/images/btn_instagram_main.png" alt="인스타그램 바로가기"></a></li>
							<li><a href="https://www.youtube.com/channel/UCvohsyXlehjoLHWuffue5IA" target="_blank"><img src="http://localhost:9000/mybhc/resources/images/btn_youtube_main.png" alt="유튜브채널 바로가기"></a></li>
						</ul>
					</div>
				</div>
			</section>
		</div>
	</div>
	<!-- footer Include -->
	<iframe src="footer.do" width="100%" height="530px" scrolling="no" frameborder=0></iframe>
	
</body>
</html>