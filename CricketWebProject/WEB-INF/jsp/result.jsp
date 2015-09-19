<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Cricket Game Prediction</title>
<link href="<c:url value="/resources/css/result.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.3.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>
</head>
<body>
	<form>
		<h4>Input values for the prediction</h4>
		<table class="tdcolor">
			<tr>
				<td><div>Top Partnership</div></td>
				<td>${top_partnership}</td>
			</tr>
			<tr>
				<td><div>Weather</div></td>
				<td>${weather}</td>
			</tr>
			<tr>
				<td><div>First Bat</div></td>
				<td>${first_bat}</td>
			</tr>
			<tr>
				<td><div>Home Advantage</div></td>
				<td>${home_advantage}</td>
			</tr>
			<tr>
				<td><div>Run Target</div></td>
				<td>${run_target}</td>
			</tr>
			<tr>
				<td><div>day_night</div></td>
				<td>${day_night}</td>
			</tr>
			<tr>
				<td><div>top_score</div></td>
				<td>${top_score}</td>
			</tr>
			<tr>
				<td><div>toss_won</div></td>
				<td>${toss_won}</td>
			</tr>
		</table>
		<h2>
			The predicted result(win) is: <span
				style='color: #43413D; font-style: italic;'>${result}</span>
		</h2>
	</form>
</body>
</html>