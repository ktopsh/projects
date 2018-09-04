<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page  contentType="text/html;charset=UTF-8"   pageEncoding="UTF-8"%>
<%
	//DB접속 정보
	final String HOST = "jdbc:mysql://192.168.0.178:3306/ksh";
	final String USER = "ksh"; 
	final String PASS = "1234";

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	//1단계
	Class.forName("com.mysql.jdbc.Driver");

	//2단계
	conn = DriverManager.getConnection(HOST, USER, PASS);
	//3단계
	stmt = conn.createStatement();
	//4단계
	rs = stmt.executeQuery("SELECT * FROM JB_TERMS;");
	//5단계
	rs.next();
	//6단계

%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>terms</title>
		<link rel="stylesheet" href="./css/style.css" />		
	</head>

	<body>
		<div id="terms">
			<section>
				<table>
					<caption>사이트 이용약관</caption>
					<tr>
						<td>
							<textarea readonly> <%= rs.getString(1) %></textarea>
							<div>
								<label><input type="checkbox" name="chk1" />&nbsp;동의합니다.</label>        
							</div>
						</td>
					</tr>
				</table>
			</section>			
			<section>
				<table>
					<caption>개인정보 취급방침</caption>
					<tr>
						<td>
							<textarea readonly> <%= rs.getString(2) %></textarea>
							<div>
								<label><input type="checkbox" name="chk2" />&nbsp;동의합니다.</label>        
							</div>
						</td>
					</tr>
				</table>
			</section>
			
			<div>
				<a href="./login.jsp" class="btnCancel">취소</a>
				<a href="./register.jsp" class="btnNext">다음</a>
			</div>
			
		</div>
	</body>
</html>











