<%@ page import="example.*" %>
<%@ page contentType="text/html; charset=utf-8"%>	
	<footer class="container">
		<p>&copy; 쇼핑몰 대표 : 박주현, 고유번호 : 20200981, 연락처 : epahs1831@naver.com<br> 
            
        <%
            ShopTime time = new ShopTime();
        %>
            오늘 날짜와 시간 : <%=time.timenow() %>
        </p>
	</footer>
