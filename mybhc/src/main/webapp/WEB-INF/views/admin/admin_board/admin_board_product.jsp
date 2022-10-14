<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="http://localhost:9000/mybhc/resources/js/jquery-3.6.0.min.js"></script>
<link rel="stylesheet"
	href="http://localhost:9000/mybhc/resources/css/mybhc.css">
<script>
	/* 	$(document).ready(function (){
	 $("#question").click(function (){
	 $(this).find("#answer").slideToggle("slow");
	 });
	
	
	 });//ready
	 */
	$(document).ready(function() {
		for (i = 1; i <= 4; i++) {
			$('#question0' + i).click(function() {
				$(this).find('.answer').slideToggle();
			});
		}
	});//ready

	
</script>

<style>
.box, .answer {
	padding: 5px;
	text-align: center;
	background-color: #e5eecc;
	border: solid 1px #c3c3c3;
    display:inline-block; 
	width:800px;
	
	
}

.box{
	border: 1px solid red;
}
.answer{
	border: 1px solid blue;
	padding: 30px;

}


</style>
</head>
<body>
	<!-- Header Include -->
	<iframe src="header.do" width="100%" height="160px" scrolling="no"
		frameborder=0></iframe>
	<!-- Content --------->

	<h2>FAQ</h2>
	<p class="h2Txt">궁금한 사항은 무엇이든 물어보세요</p>
	<p class="location">
		<span><img src="../../images/common/ico_home.gif" alt="홈" />
			<a href="http://localhost:9000/mybhc/index.do">홈</a></span> &gt; <span><a
			href="/customer/faq.asp">고객센터</a></span> &gt; <span>FAQ</span>
	</p>
	<div class="content faq_wrap">
		<ul class="tab">
			<li class="on"><a href="/customer/faq_product.asp">제품</a></li>
			<li><a href="/customer/faq_order.asp">주문/배달</a></li>
		</ul>
	</div>
	
	
		<div id="question01" class="box">
			<div class="btn">치킨속살이 빨개요. 안익은 건가요?</div>
			<div class="answer"  style="display: none;" >닭고기를 포함하여 육류의 근육세포내 미오글로빈이라는 단백질 성분이
						있습니다. <br> 해당 성분이 열과 산소를 만나면 속살이 붉게 나타나는 "핑킹현상" 으로 안심하고 드셔도
						무방합니다. 그러나 덜익은 제품으로 의심이 될 경우 제품사진과 함께 문의 주시면 현물 검수를 통해 정확히 안내
						도와드리도록 하겠습니다.</div>
		</div><br>	
		<div id="question02" class="box">
			<div class="btn">치킨 크기가 차이가 나는 이유는 뭔가요?</div>
			<div class="answer"  style="display: none;">당사에서 사용중인 원료육은 닭고기의 Golden zone 에
						해당하는 국내산 10호(중량 951~1050g) 크기의 재료만 사용하고 있습니다. 10호 닭은 육즙이 풍부하고
						부드러우며 쫄깃한 질감이 살아있어 최상의 맛을 느낄수 있지만 , 개체의 발육상태 또는 부분발육상태(다리, 날개 등)에
						따라 오차범위내의 무게차이가 발생 할 수 있습니다. 또한 조리가 진행되면서 유,수분의 증발로 인해 중량차이가
						발생합니다.</div>
		</div><br>
		<div id="question03" class="box">
			<div class="btn">치킨에 목 뼈가 없어요. 누락된 건가요?</div>
			<div class="answer"  style="display: none;">당사 제품의 경우, 비가식부위(목, 날개 끝부분, 잔털)는 미관상,
						건강상(ex.치아손상 등) 의 사유로 취급하지 않고 있습니다.</div>
		</div><br>
		<div id="question04" class="box">
			<div class="btn">가맹점의 튀김유 관리는 어떻게 하나요?</div>
			<div class="answer"  style="display: none;">BHC의 모든 가맹점은 본사에서 실시하는 면접, 실무, 이론교육을
						모두 이수하여 자격이 부여됩니다. <br> 가맹점은 매일 신선한 오일을 사용하기 위해 주기적으로 교체 및
						여과기를 사용하고 있으며 산패도측정지를 이용하여 튀김유를 관리하고 있습니다. 또한 가맹점 운영담당자(SV)와 본사
						QCS팀의 직원이 불시, 상시로 사용중인 오일을 수거 후 당사 연구소 품질관리팀에서 전문 분석장비를 이용하여 혼유 및
						유지산가를 정밀 측정하여 관리 하고 있습니다.</div>
		</div>

	
</body>
</html>