<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }" ></c:set>

	<header>
	<nav>
				<ul>
					<li class="logo_li"><img class="logo" src="img/PayRoll_Logo.png" /></li>
					<li><a href="${contextPath }/main.do" class="bar">메인</a></li>
					<li><a href="${contextPath }/insertWorkerForm.do" class="bar">근무자 등록</a></li>
					<li><a href="${contextPath }/insertScheduleForm.do" class="bar">근무시간 등록</a></li>
					<li><a href="${contextPath }/listForm.do" class="bar">리스트 / 급여</a></li>
<!-- 					<li><a href="javascript:void(window.open('https://www.alba.co.kr/rsc/inc/common/Calculator.asp', '급여 계산기','width=800, height=600'))" class="bar">급여 계산기</a></li> -->
					<li><a href="${contextPath }/settingForm.do" class="bar">설정</a></li>
				</ul>
			<div class="user_name" id="user_name">
						<p> <a href="javascript:void(0);" onclick="workerInfo(${user_no})"> ${user_id } </a> 님 </p>
						<button type="button" onclick="logout(${user_no});">로그아웃</button>
			</div>
	</nav>
	</header>
	<script type="text/javascript">
	
		function logout(user_no) {
			
			location.href="${contextPath}/logout.do?user_no="+user_no;
		}
		
		function workerInfo(user_no) {
			
			location.href="${contextPath}/workerInfo.do?user_no="+user_no;
		}
		
	
	</script>










