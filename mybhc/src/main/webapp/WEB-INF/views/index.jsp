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
							<li class="on"><a href="#none" class="info01">BHC ??????</a></li>
							<li><a href="#none" class="info02">?????? ??????</a></li>
							<li><a href="#none" class="info03">?????? ??????</a></li>
						</ul>
						<div class="info_view">
							  <div class="bg1">
								<p class="tit">Better & Happier Choice</p>
								<p class="sub">???????????? ????????? ???????????? ???????????? ?????? ????????? BHC</p>
								<ul>
									<li>??????????????? ????????? ????????? ??????, NO.1 ?????? ???????????????</li>
									<li>????????? ?????? ????????? ?????? ??? ??? ?????? ?????? ????????????</li>
									<li>????????? ?????? ????????? ???????????? ????????? ????????? ??????</li>
									<li>?????? ????????????, ??? ????????????, ??? ???????????? ?????? ?????? ?????? </li>
								</ul>
							</div>  
							 <div class="bg2">
								<p class="tit">???????????? ??????, ?????? ????????? ?????? ??? BHC</p>
								<p class="sub">BHC ?????? QCS(??????,??????,?????????) ?????? ????????? ??????</p>
								<ul>
									<li>?????? ????????? ?????? BHC?????? QCS ????????? ?????? ??? ????????? ??????</li>
									<li>????????? ?????? ????????? (S/V)??????????????? ????????? ?????? QCS?????? ?? ??????</li>
									<li>?????? ?????? ???????????? ?????? 1,000??? ???????????? ?????? ????????? ??????</li>
									<li>???????????? ?????? CS?????? ???????????? ?????? ????????? ??????</li>
								</ul>
							</div> 
							<div class="bg3">
								<p class="tit">?????? ??????????????? ????????? 1??? BHC</p>
								<p class="sub">????????? 1???, ???????????? 4??? ?????? ??????</p>
								<ul>
									<li>BHC?????? ???????????? ??????????????? ???????????? ????????????</li> 
									<li>?????? ????????? ????????? ??? ?????? ????????? ???????????? ?????? ??????</li>
									<li>???????????? ????????? ????????? ??????????????? ??? ?????? ????????? ??????</li>  
									<li>???????????????(HMR), ???????????? ????????? ?????? ????????? ?????? ??????</li>
								</ul>
							</div>
						</div>
					</div>
		           
					<div class="main_sns_warp">
						<p class="tit">SNS</p>
						<ul>
							<li><a href="https://pf.kakao.com/_ExlBVl" target="_blank"><img src="http://localhost:9000/mybhc/resources/images/btn_kakaoplus_main.png" alt="???????????????????????? ????????????"></a></li>
							<li><a href="http://www.facebook.com/bhcchicken" target="_blank"><img src="http://localhost:9000/mybhc/resources/images/btn_facebook_main.png" alt="???????????? ????????????"></a></li>
							<li><a href="https://instagram.com/bhc_chicken_official?igshid=16tcbhequ830e" target="_blank"><img src="http://localhost:9000/mybhc/resources/images/btn_instagram_main.png" alt="??????????????? ????????????"></a></li>
							<li><a href="https://www.youtube.com/channel/UCvohsyXlehjoLHWuffue5IA" target="_blank"><img src="http://localhost:9000/mybhc/resources/images/btn_youtube_main.png" alt="??????????????? ????????????"></a></li>
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